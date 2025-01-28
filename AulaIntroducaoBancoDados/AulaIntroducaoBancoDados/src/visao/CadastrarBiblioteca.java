/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

import controlador.CBiblioteca;
import java.util.Scanner;
import modelo.dominio.Biblioteca;

/**
 *
 * @author ranie
 */
public class CadastrarBiblioteca {
    
    public void telaCadastro() {
        Scanner ler = new Scanner(System.in);
        
        // Solicita as informações do livro
        System.out.printf("Informe o nome do Coordenador da Biblioteca: ");
        String nomeCoOrdenador = ler.nextLine();
        
        System.out.printf("Informe a quantidade de Acervos: (0-para nulo)");
        int quantidadeAcervo = ler.nextInt();
        // Limpa o buffer do scanner após a leitura de um número
        ler.nextLine(); // Adiciona esta linha
        
        System.out.printf("Informe o Horario de Funcionamento: ");
        String horarioFuncionamento = ler.nextLine();
        
       
        
        
        // Cria o objeto Biblioteca e define seus valores
        Biblioteca mBiblioteca = new Biblioteca();
        mBiblioteca.setNomeCoOrdenador(nomeCoOrdenador);
        mBiblioteca.setQuantidadeAcervo(quantidadeAcervo);
        mBiblioteca.setHorarioFuncionamento(horarioFuncionamento);
        
        // Chama o controlador para cadastrar a biblioteca
        CBiblioteca cBiblioteca = new CBiblioteca();
        
        // Exibe o retorno do cadastro
        System.out.println(cBiblioteca.cadastrarBiblioteca(mBiblioteca));
    }
}
