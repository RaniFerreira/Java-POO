/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.controlador;

import controlador.CBiblioteca;
import java.util.Scanner;

/**
 *
 * @author ranie
 */
public class MenuBiblioteca {
    
    // Método que exibe o submenu de Biblioteca
    public static void menuBiblioteca() {
        Scanner ler = new Scanner(System.in);  // Inicializa o Scanner
        String opcaoBiblioteca = "";
        CBiblioteca controladorBiblioteca = new CBiblioteca();  // Instancia o controlador CBiblioteca
        do {
            System.out.println("************************************************************");
            System.out.println("############################################################");
            System.out.println("1 - Adicionar Biblioteca.");
            System.out.println("2 - Listar Bibliotecas.");
            System.out.println("3 - Voltar ao menu Principal.");
            System.out.println("############################################################");
            System.out.println("************************************************************");
            System.out.print("Resposta: ");
            opcaoBiblioteca = ler.nextLine();  // Captura a opção do usuário

            switch (opcaoBiblioteca) {
                case "1":
                    // Chama o controlador para adicionar um livro
                    controladorBiblioteca.eventoTelaPrincipal("1");
                    break;

                case "2":
                    // Chama o controlador para listar os livros
                    controladorBiblioteca.eventoTelaPrincipal("2");
                    break;

                case "3":
                    return;  // Volta ao menu principal

                default:
                    System.out.println("Escolha uma opção válida.");
            }

        } while (!opcaoBiblioteca.equals("3"));  // Continua até a opção 3 ser escolhida
    }
}
