/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoquestao2.poo;

/**
 *
 * @author ranie
 */
public class ContaCorrente extends ContaBancaria {
    
    private double limiteEspecial;
    
    public ContaCorrente(String titular, double saldo, double rendaMensal, double limiteEspecial) {
       super(titular, saldo, rendaMensal);
       if(limiteEspecial > getRendaMensal() * 0.4){
           this.limiteEspecial = getRendaMensal() * 0.4;
       }else{
           this.limiteEspecial = limiteEspecial;
       }
    }
    
    
    @Override
    public void sacar(double montante){
        if(montante <= getSaldo() + limiteEspecial){
            double saldoRestante = getSaldo() - montante;
            if (saldoRestante < 0) {
                limiteEspecial += saldoRestante;
                saldoRestante = 0;
            }
            System.out.println("saque efetuado com sucesso");
        }else{
            System.out.println("Mesmo com limite especial o saldo  e insuficiente");
        }
    }
    
    @Override
    public String toString(){
        System.out.println("\n********************************************************************");
        return "ContaCorrente" + "\nTitular: " + getTitular() +
                "\nSaldo: " + getSaldo() + "\nRenda Mensal: "
                + getRendaMensal() + "\nLimite Especial: " + limiteEspecial + "}";         
    }
}
