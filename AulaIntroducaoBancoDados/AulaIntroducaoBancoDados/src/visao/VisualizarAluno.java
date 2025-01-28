package visao;

import controlador.CAluno;
import java.util.ArrayList;
import modelo.dominio.Aluno;

/**
 * Classe VisualizarAluno
 * Autora Profª Ligia
 * Código didático disponibilizado pela professora - IFTM/campus Patrocínio   
 */
public class VisualizarAluno 
{
    public void visualizarTodosAlunos()
    {
        CAluno visualizarAlunos = new CAluno();
        ArrayList<Aluno> todosAluno = new ArrayList();
        todosAluno = visualizarAlunos.visualizarTodosAlunos();
        
        System.out.println("****************************************************");
        System.out.println("Visualizando todos os alunos:");
        
        for(Aluno aluno : todosAluno)
        {
            System.out.println("Nome: "+aluno.getNome());
            System.out.println("Data Nascimento: "+aluno.getDataNascimento());
            System.out.println("Curso: "+aluno.getCurso());
            System.out.println("RA: "+aluno.getRa());
            System.out.println("");
        }
    }

}
