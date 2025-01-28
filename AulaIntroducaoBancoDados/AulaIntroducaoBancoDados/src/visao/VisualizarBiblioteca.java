/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;
import controlador.CBiblioteca;
import java.util.ArrayList;
import modelo.dominio.Biblioteca;

/**
 *
 * @author ranie
 */
public class VisualizarBiblioteca {
    
    public void visualizarTodosLivros() {
        CBiblioteca visualizarLivros = new CBiblioteca();
        ArrayList<Biblioteca> todasBibliotecas = new ArrayList<>();
        todasBibliotecas = visualizarLivros.visualizarTodosLivros();
        
        System.out.println("****************************************************");
        System.out.println("Visualizando todos as bibliotecas:");
        
        for (Biblioteca biblioteca : todasBibliotecas) {
            System.out.println("Nome do Coordenador: " + biblioteca.getNomeCoOrdenador());
            System.out.println("Quantidade de Acervos: " + biblioteca.getQuantidadeAcervo());
            System.out.println("Horario de Funcionamento: " + biblioteca.getHorarioFuncionamento());
            System.out.println("");
        }
    }
}
