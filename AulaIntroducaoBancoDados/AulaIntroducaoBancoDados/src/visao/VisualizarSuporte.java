/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;
import controlador.CSuporte;
import java.util.ArrayList;
import modelo.dominio.Suporte;

/**
 *
 * @author ranie
 */
public class VisualizarSuporte {
    
     public void visualizarTodosSuportes() {
        CSuporte visualizarSuportes = new CSuporte();
        ArrayList<Suporte> todosSuportes = new ArrayList<>();
        todosSuportes = visualizarSuportes.visualizarTodosSuportes();
        
        System.out.println("****************************************************");
        System.out.println("Visualizando todos os suportes solicitados:");
        
        for (Suporte suporte : todosSuportes) {
            System.out.println("Responsavel: " + suporte.getResponsavel());
            System.out.println("Número do Chamado: " + suporte.getNumeroChamado());
            System.out.println("Data da finalização: " + suporte.getDatafinalizacao());
            System.out.println("Descrição do Suporte: " + suporte.getDescricaoChamado());
            System.out.println("");
        }
    }
    
}
