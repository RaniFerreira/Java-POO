package pootrabalhoexec2;

/**
 *
 * @author ranie
 */
public class Consulta {
    private String nomePaciente;
    private String dataNascimento;
    private String profissão;
    private boolean convenio;

    public Consulta() {
    }

    public Consulta(String nomePaciente, String dataNascimento) {
        if(nomePaciente.equals(""))
            this.nomePaciente = "Sem preencimento";
        else 
            this.nomePaciente = nomePaciente;
            
        
        if(dataNascimento.equals(" "))
           this.dataNascimento = "Sem preenchimento"; 
        else
            this.dataNascimento = dataNascimento;
        
        
    }
    
    

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        if(nomePaciente.equals(""))
        this.nomePaciente = "Sem preencimento";
        else
            this.nomePaciente = nomePaciente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if(dataNascimento.equals(""))
        this.dataNascimento = "Sem preenchimento";
        else
            this.dataNascimento = dataNascimento;
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public String getConvenio() {
        if(convenio == true)
            return "Sim";
        else
            return "Não";
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }
    
    

    
    
    
}
