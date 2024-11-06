/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoquestao2.poo;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main (String[] agrs){
        
        ContaBancaria conta1 = new ContaBancaria("Jose Cardoso", 1500, 3500.00);
        conta1.depositar(50);
        conta1.sacar(720);
        conta1.verificarSaldo();
        System.out.println(conta1);
        
        ContaBancaria conta2 = new ContaBancaria("Joana Lima", 500, 900.0);
        conta2.depositar(50.0);
        conta2.sacar(300.0);
        conta2.verificarSaldo();
        System.out.println(conta2);
        
        ContaBancaria conta3 = new ContaBancaria(" ", 400.0, 1000.0);
        conta3.depositar(20.0);
        conta3.sacar(10.0);
        conta3.verificarSaldo();
        System.out.println(conta3);
        
        ContaPoupanca conta4 = new ContaPoupanca(0.7,"Robson Lima", 100, 2000.0);
        conta4.depositar(232.0);
        conta4.sacar(15.0);
        conta4.aplicarJuros();
        conta4.verificarSaldo();
        System.out.println(conta4);
        
        ContaPoupanca conta5 = new ContaPoupanca(2.1,"josé Campos", 550, 5000.0);
        conta5.depositar(182.0);
        conta5.sacar(426.0);
        conta5.aplicarJuros();
        conta5.verificarSaldo();
        System.out.println(conta5);
        
        ContaPoupanca conta6 = new ContaPoupanca(1.8,"Renato santos", 800, 3100.0);
        conta6.depositar(124.0);
        conta6.sacar(110.0);
        conta6.aplicarJuros();
        conta6.verificarSaldo();
        System.out.println(conta6);
        
        ContaCorrente conta7 = new ContaCorrente("Eduardo Campos", 1200.0, 5850.0, 2300.0);
        conta7.depositar(48.0);
        conta7.sacar(29.0);
        conta7.verificarSaldo();
        System.out.println(conta7);
        
        ContaCorrente conta8 = new ContaCorrente("Bento Rosa", 50.0, 200.0, 800.0);
        conta8.depositar(112.0);
        conta8.sacar(1000.0);
        conta8.verificarSaldo();
        System.out.println(conta8);
        
        ContaCorrente conta9 = new ContaCorrente("Edimar  Xavier", 100.0, 4000.0, 1600.0);
        conta9.depositar(10.0);
        conta9.sacar(5.0);
        conta9.verificarSaldo();
        System.out.println(conta9);
    }
        
    
}
