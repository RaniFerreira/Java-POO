/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.controlador;

import java.util.Scanner;
import controlador.CAluno;

/**
 *
 * @author ranie
 */
public class MenuAluno {
    
    // Método que exibe o submenu de Aluno
    // Método que exibe o submenu de Aluno
    public static void menuAluno() {
        Scanner ler = new Scanner(System.in);  // Inicializa o Scanner
        String opcaoAluno = "";
        CAluno controladorAluno = new CAluno();  // Instancia o controlador CAluno
        do {
            System.out.println("************************************************************");
            System.out.println("############################################################");
            System.out.println("1 - Cadastrar aluno.");
            System.out.println("2 - Visualizar alunos.");
            System.out.println("3 - Voltar ao menu Principal.");
            System.out.println("############################################################");
            System.out.println("************************************************************");
            System.out.print("Resposta: ");
            opcaoAluno = ler.nextLine();  // Captura a opção do usuário

            switch (opcaoAluno) {
                case "1":
                    // Chama o controlador para realizar o cadastro do aluno
                    controladorAluno.eventoTelaPrincipal("1");  // Passa a opção e o Scanner para o controlador
                    break;

                case "2":
                    // Chama o controlador para visualizar os alunos cadastrados
                    controladorAluno.eventoTelaPrincipal("2");  // Passa a opção e o Scanner para o controlador
                    break;

                case "3":
                    return;  // Volta ao menu principal

                default:
                    System.out.println("Escolha uma opção válida.");
            }

        } while (!opcaoAluno.equals("3"));  // Continua até a opção 3 ser escolhida
    }

}
