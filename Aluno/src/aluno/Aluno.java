package aluno;

/**
 *
 * @author ranielly
 */
public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, int idade, double nota, String matricula) {
        this.nome = nome;
        
        if (idade >=18 && idade <= 90)
            this.idade = idade;
        else
            this.idade = 18;
        
        if(nota >=0 && nota <= 10)
            this.nota = nota;
        else
            this.nota = 1;
        
        this.matricula = matricula;
    }
    
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade >=18 && idade <= 90)
        this.idade = idade;
        else
            this.idade = 18;
            
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        if(nota >=0 && nota <= 10)
        this.nota = nota;
        else
            this.nota = 1;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}
