/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.controlador;

import controlador.CSuporte;
import java.util.Scanner;

/**
 *
 * @author ranie
 */
public class MenuSuporte {
    
    // Método que exibe o submenu de Suporte
    public static void menuSuporte() {
        Scanner ler = new Scanner(System.in);  // Inicializa o Scanner
        String opcaoSuporte = "";
        CSuporte controladorSuporte = new CSuporte();  // Instancia o controlador CSuporte
        do {
            System.out.println("************************************************************");
            System.out.println("############################################################");
            System.out.println("1 - Abrir chamado de suporte.");
            System.out.println("2 - Visualizar chamados.");
            System.out.println("3 - Voltar ao menu Principal.");
            System.out.println("############################################################");
            System.out.println("************************************************************");
            System.out.print("Resposta: ");
            opcaoSuporte = ler.nextLine();  // Captura a opção do usuário

            switch (opcaoSuporte) {
                case "1":
                    // Chama o controlador para abrir um chamado
                    controladorSuporte.eventoTelaPrincipal("1");
                    break;

                case "2":
                    // Chama o controlador para visualizar os chamados
                    controladorSuporte.eventoTelaPrincipal("2");
                    break;

                case "3":
                    return;  // Volta ao menu principal

                default:
                    System.out.println("Escolha uma opção válida.");
            }

        } while (!opcaoSuporte.equals("3"));  // Continua até a opção 3 ser escolhida
    }
}
