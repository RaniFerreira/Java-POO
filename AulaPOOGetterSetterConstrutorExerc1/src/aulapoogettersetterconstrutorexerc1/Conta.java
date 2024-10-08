package aulapoogettersetterconstrutorexerc1;

/**
 *
 * @author ranie
 */
public class Conta {
    private String titular;
    private double saldo;
    
    public Conta(){
        
    }
    public Conta(double saldo, double deposito, double saque,String titular ) {
        
        this.setTitular(titular);
        this.setSaldo(500);
        this.mostrarSaldo();
        this.depositar(deposito);
        this.sacar(saque);
        this.mostrarSaldo();
    }
     
    
    public void mostrarSaldo(){
        
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
    }
    public void depositar(double deposito){
        
        this.saldo = this.saldo + deposito;
    }
    public void sacar(double saque){
        
        this.saldo = this.saldo - saque;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
