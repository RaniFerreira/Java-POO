/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provainterface;

import java.util.Scanner;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        // crie aqui 1 objeto da classe CalculadoraSimples2Numeros
        CalculadoraSimples2Numeros simples = new CalculadoraSimples2Numeros();
        
        //receba os valores do prompt
        System.out.println("Classe CalculadoraSimples2Numeros");
        System.out.println("Operações com 2 valores: ");
        System.out.println("Digite o primeiro valor: ");
        int valor = ler.nextInt();
        simples.setNum1(valor);
        System.out.println("Digite o segundo valor: ");
        int valor2 = ler.nextInt();
        simples.setNum2(valor2);
        //mostrando operações;
        //teste todos os métodos
        simples.mostrarSoma();
        simples.mostrarSubtracao();
        simples.mostrarDivisao();
        simples.mostrarMultiplicacao();
        
        
        
        System.out.println("*****************************************************************************");
        // crie aqui 1 objeto da classe CalculadoraSimples3Numeros
        System.out.println("Classe CalculadoraSimples3Numeros");
        System.out.println("Operações com 3 valores");
        CalculadoraSimples3Numeros tresValores = new CalculadoraSimples3Numeros();
        //receba os valores do prompt 
        
        
        System.out.println("Digite o primeiro valor: ");
        double num1 = ler.nextDouble();
        tresValores.setNum1(num1);
        
        System.out.println("Digite o segundo valor: ");
        double num2 = ler.nextDouble();
        tresValores.setNum2(num2);
        
        System.out.println("Digite o terceiro valor: ");
        double num3 = ler.nextDouble();
        tresValores.setNum3(num3);
        //teste todos os métodos
        
        tresValores.mostrarSoma();
        tresValores.mostrarSubtracao();
        tresValores.mostrarDivisao();
        tresValores.mostrarMultiplicacao();
        
        System.out.println("*****************************************************************************");
        // crie aqui 1 objeto da classe CalculadoraCientifica
        System.out.println("Classe CalculadoraCientifica");
        
        CalculadoraCientifica cientifica = new CalculadoraCientifica();
        //receba os valores do prompt 
        System.out.println("Digite o primeiro valor: ");
        int primeiro = ler.nextInt();
        cientifica.setNum1(primeiro);
        
        System.out.println("Digite o segundo valor: ");
        int segundo = ler.nextInt();
        cientifica.setNum2(segundo);
        
        //teste todos os métodos
        
        cientifica.mostrarSoma();
        cientifica.mostrarSubtracao();
        cientifica.mostrarDivisao();
        cientifica.mostrarMultiplicacao();
        cientifica.mostrarEcalcularRaizQuadrada();
        cientifica.mostrarEcalcularPotenciaQuadrado();
        
    }
    
}
