package aulapoo3;

/**
 *
 * @author ranie
 */
public class ContaBancaria {
    
    public String titular;
    public double saldo;
    
    
    public void mostrarSaldo(){

        System.out.println("Titular: " + titular);
        System.out.println("Saldo Inicial R$: " + saldo);
 
    }
        
    
    public void depositar(double deposito){
        
        saldo += deposito;
        System.out.println("Valor depositado R$: " + deposito);
        
    }
    
    public void sacar(double saque){
        
        saldo -= saque;
        System.out.println("Valor sacado R$: " + saque);
        
    }
    public void mostrarSaldoAposOperacoes(){
        
        System.out.println("Saldo Atual: " + saldo);
    }
    
            
}
