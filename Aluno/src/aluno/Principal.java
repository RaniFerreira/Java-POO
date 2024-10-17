package aluno;

/**
 *
 * @author ranielly
 */
public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        
        aluno1.setNome("João Macedo");
        aluno1.setIdade(20);
        aluno1.setNota(8);
        aluno1.setMatricula("4545");
        
        System.out.println("Aluno 1");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Nota: " + aluno1.getNota());
        System.out.println("Matricula: " + aluno1.getMatricula());
        System.out.println("-------------------------------------------");
        
        Aluno aluno2 = new Aluno();
        
        aluno2.setNome("Ricardo Lopes");
        aluno2.setIdade(15);
        aluno2.setNota(23);
        aluno2.setMatricula("7878");
        
        System.out.println("Aluno 2"); // testando variavel inválida para nota o valor default será 1 e para iddae será 18
        
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Nota: " + aluno2.getNota());
        System.out.println("Matricula: " + aluno2.getMatricula());
        System.out.println("-------------------------------------------");
        
        Aluno aluno3 = new Aluno("Ranielly Ferreira", 25,10,"2525");
        
        System.out.println("Aluno 3"); 
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Idade: " + aluno3.getIdade());
        System.out.println("Nota: " + aluno3.getNota());
        System.out.println("Matricula: " + aluno3.getMatricula());
        System.out.println("-------------------------------------------");
        
        Aluno aluno4 = new Aluno("Ryan Alencar", 4,333,"1414"); // testando variavel inválida para nota o valor default será 1 e para iddae será 18
        
        System.out.println("Aluno 4"); 
        System.out.println("Nome: " + aluno4.getNome());
        System.out.println("Idade: " + aluno4.getIdade());
        System.out.println("Nota: " + aluno4.getNota());
        System.out.println("Matricula: " + aluno4.getMatricula());
        System.out.println("-------------------------------------------");
    }
    
}
