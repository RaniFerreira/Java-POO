package trabalhoarraylist2;

import java.util.ArrayList;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args) {
        
        
        Aluno aluno1 = new Aluno("João", "São Paulo", "IFSP", "ADS");
        Aluno aluno2 = new Aluno("Maria", "Rio de Janeiro", "UFRJ", "EE");
        Aluno aluno3 = new Aluno("Pedro", "Belo Horizonte", "UFMG", "Biologia"); // Curso inválido, será ADS
        Aluno aluno4 = new Aluno("Ana", "Curitiba", "UTFPR", "EE");
        Aluno aluno5 = new Aluno("Lucas", "Porto Alegre", "UFRGS", "ADS");

        // Criação dos ArrayLists para ADS e EE do tipo aluno
        ArrayList<Aluno> alunosADS = new ArrayList<>();
        ArrayList<Aluno> alunosEE = new ArrayList<>();

        // Verificação do curso de cada aluno e adição na lista correspondente
        Aluno[] alunos = { aluno1, aluno2, aluno3, aluno4, aluno5 };
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals("ADS")) {
                alunosADS.add(aluno);
            } else if (aluno.getCurso().equals("EE")) {
                alunosEE.add(aluno);
            }
        }

        // Exibindo a quantidade de alunos em cada curso
        System.out.println("Quantidade de alunos em ADS: " + alunosADS.size());
        System.out.println("Quantidade de alunos em EE: " + alunosEE.size());

        // Exibindo os nomes e cidades dos alunos, separados por curso
        System.out.println("\nAlunos do curso de ADS:");
        for (Aluno aluno : alunosADS) {
            System.out.println("Nome: " + aluno.getNome() + ", Cidade: " + aluno.getCidade());
        }

        System.out.println("\nAlunos do curso de EE:");
        for (Aluno aluno : alunosEE) {
            System.out.println("Nome: " + aluno.getNome() + ", Cidade: " + aluno.getCidade());
        }
    }
    
}
