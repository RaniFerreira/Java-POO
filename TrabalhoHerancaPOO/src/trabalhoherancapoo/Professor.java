package trabalhoherancapoo;

/**
 *
 * @author ranielly
 */
public class Professor extends UsuarioSistema {
    
    private int siape;
    private String nucleo;

    public Professor(int siape, String nucleo, String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
        this.siape = siape;
        this.nucleo = nucleo;
        
        if(nucleo.equals("informatica") || nucleo.equals("administracao") || nucleo.equals("eletrica"))
            this.nucleo = nucleo;
        else
            this.nucleo = "Não informado";
    }

    public String mostrarInformacoes(){
        return "Siape " + siape + "\nNucleo: " + nucleo + "\n" +  super.mostrarInformacoes();
    }
    
    
    
}
