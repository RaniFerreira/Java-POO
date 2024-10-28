package trabalhoherancapoo;

/**
 *
 * @author ranielly
 */
public class UsuarioSistema {
    String nome;
    private String login;
    private int senha;
    private String email;

    public UsuarioSistema(String nome, String login, int senha, String email) {
        this.nome = nome;
        this.email = email;
        
        if(senha == 0)
            this.senha = 123;
        else
           this.senha = senha; 
        
        if(login.equals(" "))
            this.login = "Admin";
        else
            this.login = login;
        
            
    }
    
    public String mostrarInformacoes(){
        return "Nome " + nome + "\nLogin: " + login + "\nSenha: " + senha + "\nEmail: " + email;
    }
}
