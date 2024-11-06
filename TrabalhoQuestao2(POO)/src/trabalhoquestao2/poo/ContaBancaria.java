/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoquestao2.poo;

/**
 *
 * @author ranie
 */
public class ContaBancaria {
    private String titular;
    private double saldo;
    private double rendaMensal;

    public ContaBancaria() {
    }

    public ContaBancaria(String titular, double saldo, double rendaMensal) {
        
        if(titular.equals(" ")){
            this.titular = "Não identificado";
        }
        else{
           this.titular = titular; 
        }
        
        if(rendaMensal < 2824.00){
            this.rendaMensal = 2824.00;
        }else{
            this.rendaMensal = rendaMensal;
        }
        
        this.saldo = saldo;
        
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }
    
    public void depositar(double montante){
        
        saldo += montante;
        
    }
    
    public void sacar(double montante){
        if(saldo > montante){
            saldo -= montante;
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void verificarSaldo(){
        System.out.println("O Saldo na conta de " + titular +  " é: R$ " + saldo);
    }
    
    @Override
    public String toString(){
        System.out.println("\n*************************************************************");
        return "ContaBancaria" + "\nTitular: " + titular +
                "\nSaldo: " + saldo + "\nRenda Mensal: "
                + rendaMensal + "}"; 
    }
    
    
    
}
