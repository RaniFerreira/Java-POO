/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livropolimorfismo;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main (String[] args){
        
        Livro livro1 = new Autor("Jojo Moyes", 32, 256, "Como eu era antes de voce", "portugues");
        System.out.println(livro1.toString());
        livro1.adicionarDescricao("Este é um livro de romance que envolve drama");
        livro1.verPreco();
        
        System.out.println("*********************************************************************************");
        System.out.println("*********************************************************************************");
        Livro livro2 = new Genero("terror", 200,"It: A coisa" , "Frances");
        System.out.println(livro2);
        
        System.out.println("*********************************************************************************");
        System.out.println("*********************************************************************************");
        Autor livro3 = new Autor();
        
        livro3.setNome("Victoria");
        livro3.setIdade(15);
        livro3.setTitulo("The red Queen");
        livro3.setIdioma("ingles");
        livro3.setQuantidadePagina(500);
        
        System.out.println(livro3.toString());
        livro3.adicionarDescricao("Uma otima historia de ficção");
        livro3.verPreco();
    }
}
