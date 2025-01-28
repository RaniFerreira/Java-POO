
package modelo.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.dominio.*;
import java.util.ArrayList;
/**
 *
 * @author ranie
 */
public class DAOSuporte {
    
    private Connection con;
    private PreparedStatement comando;
    private final FabricaConexao fConexao = FabricaConexao.getInstancia();

    // Método de conexão com o banco de dados
    private void conectar() {
        con = fConexao.conexao();
    }

    // Método para fechar a conexão com o banco de dados
    private void fechar() {
        try {
            comando.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Erro ao fechar conexão\n" + e.getMessage());
        }
    }

    // Método para inserir um suporte na tabela SUPORTE
    public boolean insereSuporte(Suporte suporte) {
        conectar();
        String sql = "INSERT INTO suporte (responsavel, numeroChamado, datafinalizacao, descricaoChamado) VALUES (?, ?, ?, ?)";
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, suporte.getResponsavel());
            comando.setInt(2, suporte.getNumeroChamado());
            comando.setString(3, suporte.getDatafinalizacao());
            comando.setString(4, suporte.getDescricaoChamado());

            comando.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir Suporte\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

    // Método para selecionar todos os registros da tabela SUPORTE
    public ArrayList<Suporte> selecionarTodosRegistros() {
        conectar();
        ResultSet rs;
        String sql = "SELECT * FROM suporte";
        ArrayList<Suporte> listaSuportes = new ArrayList<>();
        try {
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while (rs.next()) {
                Suporte suporte = new Suporte();
                suporte.setResponsavel(rs.getString("responsavel"));
                suporte.setNumeroChamado(rs.getInt("numeroChamado"));
                suporte.setDatafinalizacao(rs.getString("dataFinalizacao"));
                suporte.setDescricaoChamado(rs.getString("descricaochamado"));
                listaSuportes.add(suporte);
            }
            return listaSuportes;
        } catch (SQLException e) {
            System.err.println("Erro ao visualizar Suportes\n" + e.getMessage());
            return null;
        } finally {
            fechar();
        }
    }
    
}
