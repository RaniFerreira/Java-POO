/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhoquestao3.poo;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("Marina Arantes", 2000.0);
        funcionario1.calcularBonus("novembro");
        System.out.println(funcionario1);
        
        Funcionario funcionario2 = new Funcionario("Roberto Cardoso", 1500.0);
        funcionario2.calcularBonus("novembro");
        System.out.println(funcionario2);
        
        Funcionario funcionario3 = new Funcionario("Marcia Rubens", 5500.0);
        funcionario3.calcularBonus("dezembro");
        System.out.println(funcionario3);

        Gerente gerente1 = new Gerente("Henrico Guedes", 3000.0, 1000.0);
        gerente1.calcularBonus("novembro");
        System.out.println(gerente1);
        
        Gerente gerente2 = new Gerente("Rayssa Xavier", 2500.0, 900.0);
        gerente2.calcularBonus("janeiro");
        System.out.println(gerente2);
        
        Gerente gerente3 = new Gerente("Renan Santos", 5500.0, 1000.0);
        gerente3.calcularBonus("julho");
        System.out.println(gerente3);

        Programador programador1 = new Programador("Theobaldo Silva", 31500.0, 122.0);
        programador1.calcularBonus("novembro");
        programador1.calcularValorSoftware(200);
        System.out.println(programador1);
        
        Programador programador2 = new Programador("Tayrone Borges", 6200.0, 13.0);
        programador2.calcularBonus("fevereiro");
        programador2.calcularValorSoftware(150);
        System.out.println(programador2);
        
        Programador programador3 = new Programador("Eudes Felix", 7800.0, 22.0);
        programador3.calcularBonus("janeiro");
        programador3.calcularValorSoftware(100);
        System.out.println(programador3);
    }
    
}
