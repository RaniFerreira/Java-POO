package aulapoogettersetterconstrutorexerc1;

/**
 *
 * @author ranie
 */
public class Principal {

    public static void main(String[] args) {
        
        Conta conta1 = new Conta(150,  "Diego");
        
        System.out.println("titular: " + conta1.getTitular() );
        System.out.println("Saldo Anterior: " + conta1.getSaldo());
        conta1.depositar(500);
        conta1.sacar(150);
        System.out.println("Saldo Atual: " + conta1.getSaldo());
        
        
        Conta conta2 = new Conta();
        
        conta2.setSaldo(450);
        conta2.setTitular("Jesus amado");
        System.out.println("titular: " + conta2.getTitular());
        System.out.println("Saldo Anterior: " + conta2.getSaldo());
        conta2.depositar(50);
        conta2.sacar(300);
        System.out.println("Saldo Atual: " + conta2.getSaldo());
        
        
        
        
        
        
        
        
    }
    
}
