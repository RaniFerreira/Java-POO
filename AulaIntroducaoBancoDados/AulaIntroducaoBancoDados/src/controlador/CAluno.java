package controlador;

import java.util.ArrayList;
import modelo.dominio.Aluno;
import modelo.DAO.DAOAluno;
import visao.CadastrarAluno;
import visao.VisualizarAluno;


/**
 * Classe CAluno
 * Autora Profª Ligia
 * Código didático disponibilizado pela professora - IFTM/campus Patrocínio   
 */
public class CAluno 
{
    public void eventoTelaPrincipal(String opcao)
    {
        if(opcao.equals("1"))
        {
            new CadastrarAluno().telaCadastro();
        }
        else if (opcao.equals("2"))
        {
            new VisualizarAluno().visualizarTodosAlunos();
        }
    }
    
    public String cadastrarAluno (Aluno aluno)
    {
        DAOAluno salvarDados = new DAOAluno();
        if(aluno.getNome().equals("") || aluno.getRa().equals(""))
        {
            return "Nome do aluno e/ou RA em branco. Preencha todos os campos.";
        }
        else if(salvarDados.insereAluno(aluno))
        {
            return "Dados salvos com sucesso!";
        }
        else
        {
            return "Erro ao inserir aluno! Cadastre novamente.";
        }
    }
    
    public ArrayList<Aluno> visualizarTodosAlunos ()
    {
        DAOAluno visualizarDados = new DAOAluno();
        return visualizarDados.selecionarTodosRegistros();
    }
    

}
