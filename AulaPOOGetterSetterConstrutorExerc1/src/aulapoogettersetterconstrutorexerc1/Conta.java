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
    public Conta(double saldo,String titular ) {
        
        this.titular = titular;
        this.saldo =  saldo;
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
