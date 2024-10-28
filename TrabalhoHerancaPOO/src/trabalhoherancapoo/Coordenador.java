package trabalhoherancapoo;

/**
 *
 * @author ranielly
 */
public class Coordenador extends UsuarioSistema{
    
    private String curso;
    private int senhaMplan;

    public Coordenador(String curso, int senhaMplan, String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
        this.curso = curso;
        this.senhaMplan = senhaMplan;
    }
    
    public String mostrarInformacoes(){
        return "Curso " + curso + "\nSenha Mplan: " +  senhaMplan + "\n" +  super.mostrarInformacoes();
    }

    
    
    
    
}
