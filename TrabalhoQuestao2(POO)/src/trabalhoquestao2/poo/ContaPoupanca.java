/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoquestao2.poo;

/**
 *
 * @author ranie
 */
public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;

    public ContaPoupanca(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public ContaPoupanca(){
        
    }
        

    public ContaPoupanca(double taxaJuros, String titular, double saldo, double rendaMensal) {
        super(titular, saldo, rendaMensal);
        
        if(taxaJuros < 0.6 && taxaJuros > 2.8){
            System.out.println("Taxa não aceita");
        }
        else{
            this.taxaJuros = taxaJuros;   
        }
        
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
    
    public void aplicarJuros(){
        double juros = getSaldo() * (taxaJuros / 100);
        depositar(juros);
    }
    
    @Override
    public String toString(){
        System.out.println("\n********************************************************************");
        return "ContaPoupanca" + "\nTitular: " + getTitular() +
                "\nSaldo: " + getSaldo() + "\nRenda Mensal: "
                + getRendaMensal() + "\nTaxa de Juros: " + taxaJuros;         
    }
    
    
    
    
}
