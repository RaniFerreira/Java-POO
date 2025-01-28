package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.dominio.*;
import java.util.ArrayList;

/**
 * Classe DAOAluno
 Autora Profª Ligia
 Código didático disponibilizado pela professora - IFTM/campus Patrocínio   
 */
public class DAOAluno 
{
    
     //Classe responsável pela conexão (sessão) com um banco de dados específico. 
    //As instruções SQL são executadas e os resultados são retornados dentro do contexto de uma conexão.
     private Connection con;
     
    //Pre-compila a query para o banco de dados
    // Cria um objeto PreparedStatement para enviar instruções SQL parametrizadas para o banco de dados.
    //Uma instrução SQL com ou sem parâmetros IN pode ser pré-compilada e armazenada em um objeto PreparedStatement.
    //Esse objeto pode ser usado para executar essa instrução de forma eficiente várias vezes. 
    private PreparedStatement comando;
    
    private final FabricaConexao fConexao = 
            FabricaConexao.getInstancia();
    
    // Método acessado internamente para conectar com o banco
    private void conectar()
    {
        con = fConexao.conexao();
    }
    
    //Método que fecha a conexão com o banco
    private void fechar(){
        try{
            comando.close();
            con.close();
        }catch(SQLException e){
            System.err.println("Erro ao fechar conexão\n"+e.getMessage());
        }
    }
    
    public boolean insereAluno(Aluno aluno){
        
        conectar();
        String sql = "INSERT INTO aluno(nome, "
                + "dataNascimento, curso, ra) "
                + "VALUES(?,?,?,?)";
        try
        {
            comando = con.prepareStatement(sql);
            comando.setString(1, aluno.getNome());
            comando.setString(2, aluno.getDataNascimento());
            comando.setString(3, aluno.getCurso());
            comando.setString(4, aluno.getRa());
           
            comando.execute();
            
            return true;
        }
        catch(SQLException e)
        {
            System.err.println("Erro ao inserir Aluno\n"+e.getMessage());
        }
        finally
        {
            fechar();
        }
        return false;
    }
    
    public  ArrayList<Aluno> selecionarTodosRegistros()
    {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM aluno";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Aluno> listaAlunos = new ArrayList();
        try
        {
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while(rs.next())
            {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setDataNascimento(rs.getString("dataNascimento"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setRa(rs.getString("ra"));
                listaAlunos.add(aluno);
            }
            return listaAlunos;
        }
        catch(SQLException e)
        {
            System.err.println("Erro visualizar Alunos\n"+e.getMessage());
            return null;
        }
        finally
        {
            fechar();
        }
    }
    
    

}
