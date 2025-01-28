/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.DAO.DAOBiblioteca;
import modelo.dominio.Biblioteca;
import visao.CadastrarBiblioteca;
import visao.VisualizarBiblioteca;

/**
 *
 * @author ranielly
 */
public class CBiblioteca {
    
    private DAOBiblioteca daoBiblioteca;

    public CBiblioteca() {
        daoBiblioteca = new DAOBiblioteca();
    }
    public void eventoTelaPrincipal(String opcao)
    {
        if(opcao.equals("1"))
        {
            new CadastrarBiblioteca().telaCadastro();
        }
        else if (opcao.equals("2"))
        {
            new VisualizarBiblioteca().visualizarTodosLivros();
        }
    }

    public String cadastrarBiblioteca (Biblioteca biblioteca)
    {
        DAOBiblioteca salvarDados = new DAOBiblioteca();
        
        if(biblioteca.getHorarioFuncionamento().equals("") || biblioteca.getNomeCoOrdenador().equals("")){
            
            return "Campo de Horario ou Nome do Coordenador em Branco \nTodos os dados devem ser preenchido corretamente.";  
        }
        
        else if(biblioteca.getQuantidadeAcervo()<= 0) {
            return "O numero de Acervos não pode ser zero ou Nulo";
        }
               
        else if(biblioteca.getQuantidadeAcervo()<= 50) {
            return "O acervo deve ser maior que 50.";
        }
              
        else if(salvarDados.insereBiblioteca(biblioteca))
        {
            return "Dados salvos com sucesso!";
        }
        else
        {
            return "Erro ao inserir aluno! Cadastre novamente.";
        }
        
    }

    public ArrayList<Biblioteca> visualizarTodosLivros() {
        return daoBiblioteca.selecionarTodosRegistros();
    }
    
}
