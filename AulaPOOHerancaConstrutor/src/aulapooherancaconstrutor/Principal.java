/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapooherancaconstrutor;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args) {
       Funcionario carlos = new Funcionario("Carlos", "Maranhão", 200.00);
       FuncionarioComissionado joana = new FuncionarioComissionado("Joana", "Cardoso", 1000.00 , 10, 2);
       
        System.out.println("funcionario fixo: "+ carlos.getPrimeiroNome() + " " + carlos.getSegundoNome() 
                + "\nSalario: R$ " + carlos.getSalario());
        
        System.out.println("/********************************************************************************/");
        
        System.out.println("Funcionatio Comissionado: \nNome: " + joana.getPrimeiroNome()
        + " " + joana.getSegundoNome() + "\nSalarioFixo: R$ " + joana.getSalario());
        
        System.out.println("Salario com Comissão: R$ " + joana.calcularPagamentoTotal());
        joana.adicionarVendas(7);
        System.out.println("Salario com Comissão: R$ " + joana.calcularPagamentoTotal());
        joana.zerarVendas();
         System.out.println("Salario com Comissão: R$ " + joana.calcularPagamentoTotal());
    }
    
}
