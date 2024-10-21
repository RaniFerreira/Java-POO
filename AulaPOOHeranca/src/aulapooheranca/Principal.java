package aulapooheranca;

/**
 *
 * @author ranielly
 */
public class Principal {
    public static void main (String[] args){
        
        Funcionario joao = new Funcionario();
        
        joao.setPrimeiroNome("João");
        joao.setSegundoNome("Pires");
        joao.setSalario(900.00);
        
        FuncionarioComissionado maria = new FuncionarioComissionado();
        
        maria.setPrimeiroNome("Maria");
        maria.setSegundoNome("Silva");
        maria.setSalario(1000.00);
        maria.setComissao(50.00);
        maria.setVendas(10);
        
        
        
        System.out.println("funcionario fixo: "+ joao.getPrimeiroNome() + " " + joao.getSegundoNome() 
                + "\nSalario: R$ " + joao.getSalario());
        
        
        System.out.println("/********************************************************************************/");
        
        System.out.println("Funcionatio Comissionado: \nNome: " + maria.getPrimeiroNome()
        + " " + maria.getSegundoNome() + "\nSalarioFixo: R$ " + maria.getSalario());
        
        System.out.println("Salario com Comissão: R$ " + maria.calcularPagamentoTotal());
 
        
        
    }
    
}
