package modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FabricaConexao {
    //Padrão Singleton
   //Garantir que uma classe tenha uma, somente uma instância e forneça um ponto 
    //global de acesso para a mesma.
    private static FabricaConexao instanciaUnica;
    
    private FabricaConexao(){}
    
    public static FabricaConexao getInstancia()
    {
        if(instanciaUnica == null) instanciaUnica = new FabricaConexao();
        return instanciaUnica;
    }
    
     public Connection conexao()
     {
        //Classe que fornece informações de tabelas, SQL's, procedimentos e sintaxe.
        Connection con = null;
        try 
        {
            //fazendo a chamada para carregar o drive do MySql
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String url = ("jdbc:mysql://localhost:3306/trabalhopoo1");
            //estabelecendo conexão com o caminho, usuário e senha
            con = DriverManager.getConnection(url, "root", "");
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    
}
