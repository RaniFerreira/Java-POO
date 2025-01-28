
package visao;

import controlador.CAluno;
import java.util.Scanner;
import modelo.dominio.Aluno;

/**
 * Classe CadastrarAluno
 Autora Profª Ligia
 Código didático disponibilizado pela professora - IFTM/campus Patrocínio   
 */
public class CadastrarAluno 
{
    
    
    public void telaCadastro() 
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Informe o nome do aluno:");
        String nomeAluno = ler.nextLine();
        
        System.out.printf("Informe a data de nascimento do aluno:");
        String dataNascimentoAluno = ler.nextLine();
        
        System.out.printf("Informe o curso do aluno:");
        String cursoAluno = ler.nextLine();
        
        System.out.printf("Informe o RA do aluno:");
        String raAluno = ler.nextLine();
        
        Aluno mAluno = new Aluno();
        
        mAluno.setNome(nomeAluno);
        mAluno.setDataNascimento(dataNascimentoAluno);
        mAluno.setCurso(cursoAluno);
        mAluno.setRa(raAluno);
        
        CAluno cAluno = new CAluno();
        
        System.out.println(cAluno.cadastrarAluno(mAluno));
    }
}
