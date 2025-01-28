/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.DAO.DAOSuporte;
import modelo.dominio.Suporte;
import visao.CadastrarSuporte;
import visao.VisualizarSuporte;

/**
 *
 * @author ranie
 */
public class CSuporte {
    
    private DAOSuporte daoSuporte;

    public CSuporte() {
        daoSuporte = new DAOSuporte();
    }
    public void eventoTelaPrincipal(String opcao)
    {
        if(opcao.equals("1"))
        {
            new CadastrarSuporte().telaCadastro();
        }
        else if (opcao.equals("2"))
        {
            new VisualizarSuporte().visualizarTodosSuportes();
        }
    }

    // Método para cadastrar um novo suporte
    public String cadastrarSuporte(Suporte suporte) {
        DAOSuporte salvarDados = new DAOSuporte();
        // Verifica se os campos obrigatórios estão preenchidos
        if (suporte.getResponsavel().equals("")) {
            return "Responsavel em branco. Preencha todos os campos.";
        } 
        if((suporte.getNumeroChamado() != 0) && ((suporte.getDatafinalizacao().equals("")) || (suporte.getDescricaoChamado().equals("")))){
       
            System.out.println("Após adicionar numero de chamado, o demais campos são obrigatórios");
                
            return "Refaça o cadastro";  
        }
        else if (salvarDados.insereSuporte(suporte)) {
            return "Dados salvos com sucesso!";
        } else {
            return "Erro ao inserir suporte! Cadastre novamente.";
        }
    }

    // Método para visualizar todos os registros de suporte
    public ArrayList<Suporte> visualizarTodosSuportes() {
        return daoSuporte.selecionarTodosRegistros();
    }
    
}
