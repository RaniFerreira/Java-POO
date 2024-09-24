/**1) Crie uma classe chamada ContaBancaria com atributos  saldo e titular.
 * Adicione métodos para depositar, sacar e exibir o saldo. Toda vez que o usuário 
 * depositar uma quantia, deverá ser acrescido ao atributo saldo o valor depositado 
 * e toda vez que ele sacar uma quantia, deverá ser diminuído do 
 * atributo saldo o valor. Faça uma classe Principal com 3 
 * objetos e teste todos os atributos e métodos.**/
package aulapoo3;

/**
 *
 * @author ranie
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ContaBancaria contaJoana = new ContaBancaria();
        ContaBancaria contaRicardo= new ContaBancaria();
        ContaBancaria contaSergio = new ContaBancaria();
        
        System.out.println("\n");
        contaJoana.titular = "Joana Cardoso Silva";
        contaJoana.saldo = 2500;
        contaJoana.mostrarSaldo();
        contaJoana.depositar(300);
        contaJoana.sacar(800);
        contaJoana.mostrarSaldoAposOperacoes();
        
        
        System.out.println("\n");
        contaRicardo.titular = " Ricardo Veloso de Amaral";
        contaRicardo.saldo = 4;
        contaRicardo.mostrarSaldo();
        contaRicardo.depositar(800);
        contaRicardo.sacar(500);
        contaRicardo.mostrarSaldoAposOperacoes();
        
        System.out.println("\n");
        contaSergio.titular = " Serigio Peralta chagas";
        contaSergio.saldo = 853;
        contaSergio.mostrarSaldo();
        contaSergio.depositar(250);
        contaSergio.sacar(10);
        contaSergio.mostrarSaldoAposOperacoes();
        
    }
    
}
