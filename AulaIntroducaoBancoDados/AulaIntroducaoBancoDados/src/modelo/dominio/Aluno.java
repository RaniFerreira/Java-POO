package modelo.dominio;

/**
 * Classe Aluno
 Autora Profª Ligia
 Código didático disponibilizado pela professora - IFTM/campus Patrocínio   
 */
public class Aluno 
{
    private String nome;
    private String dataNascimento;
    private String curso;
    private String ra;

    public Aluno(){ }

    public Aluno(String nome, String dataNascimento, String curso, String ra) 
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        this.ra = ra;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public String getNome() 
    {
        return nome;
    }

    public String getDataNascimento() 
    {
        return dataNascimento;
    }

    public String getCurso() 
    {
        return curso;
    }

    public String getRa() 
    {
        return ra;
    }

    @Override
    public String toString() 
    {
        return "nome =" + nome + ", "
                + "dataNascimento =" + dataNascimento + ", curso =" + 
                curso + ", ra =" + ra + '}';
    }
    
}
