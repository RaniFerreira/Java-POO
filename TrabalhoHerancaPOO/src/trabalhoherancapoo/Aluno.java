package trabalhoherancapoo;

/**
 *
 * @author ranielly
 */
public class Aluno extends UsuarioSistema{
    
    private int RA;
    private String disciplinas;

    public Aluno(int RA,String disciplinas, String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
        this.RA = RA;
        this.disciplinas = disciplinas;
    }

    public String mostrarInformacoes(){
        return "RA: " + RA + "\nDisciplinas: " + disciplinas  + "\n" +  super.mostrarInformacoes();
    
    }
    
}
