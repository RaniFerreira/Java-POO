package visao;

import java.util.Scanner;
import menu.controlador.MenuAluno;
import menu.controlador.MenuBiblioteca;
import menu.controlador.MenuSuporte;





/**
 * Classe TelaPrincipal
 * Autora Profª Ligia
 * Código didático disponibilizado pela professora - IFTM/campus Patrocínio   
 */
public class TelaPrincipal 
{
    //classe que implementa as operações de 
        //entrada de dados pelo teclado no console
        //lendo int - ler.nextInt();
        //lendo float - ler.nextFloat(); 
        //lendo double - ler.nextDouble();
        //lendo uma String, usado na leitura de palavras simples que não 
            //usam o caractere de espaço (ou barra de espaço) - ler.next();
        //lendo uma String, usado na leitura de palavras compostas - ler.nextLine();

     public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.println("************************************************************");
            System.out.println("############################################################");
            System.out.println("Selecione uma das opções abaixo: ");
            System.out.println("1 - Aluno");
            System.out.println("2 - Biblioteca");
            System.out.println("3 - Suporte");
            System.out.println("4 - Fechar o programa");
            System.out.println("############################################################");
            System.out.println("************************************************************");
            System.out.print("Resposta: ");
            opcao = ler.nextLine();

            switch(opcao) {
                case "1":
                    MenuAluno.menuAluno();   // Chama o menu de Aluno
                    break;

                case "2":
                   // Chama o menu de Biblioteca
                    MenuBiblioteca.menuBiblioteca();
                    break;

                case "3":
                   // Chama o menu de Suporte
                    MenuSuporte.menuSuporte();

                case "4":
                    System.out.println("Fechando o programa...");
                    break;

                default:
                    System.out.println("Escolha uma opção válida.");
            }

        } while (!opcao.equals("4"));
    }

}
