/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulainterface2;

import java.util.Scanner;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args) {
        
        /*Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();
        
        System.out.println(nome);*/
        
        Aluno ian = new Aluno();
        Scanner ler = new Scanner(System.in);
        
      
        
        ian.setNome(ler.next());
        ian.setCurso(ler.next());
        ian.setRA(ler.next());
        
        ian.setNome(ler.next());
        ian.setCurso(ler.next());
        ian.setRA(ler.next());
        
        Aluno dao = new Aluno();
        
        
        
    }
}
