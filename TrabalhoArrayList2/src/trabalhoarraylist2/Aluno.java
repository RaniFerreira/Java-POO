package trabalhoarraylist2;

/**
 *
 * @author ranie
 */
public class Aluno {
    
    private String nome;
    private String cidade;
    private String instituicao;
    private String curso;

    public Aluno(String nome, String cidade, String instituicao, String curso) {
        this.nome = nome;
        this.cidade = cidade;
        this.instituicao = instituicao;
       if(curso.equals("ADS") ||  curso.equals("EE")){
            
            this.curso = curso;
        }
        else{
            this.curso = "ADS"; // valor por default
        }
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        
        if(curso.equals("ADS") ||  curso.equals("EE")){
            
            this.curso = curso;
        }
        else{
            this.curso = "ADS"; // valor por default
        }
        
    }
    
    
    
}
