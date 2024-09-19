package aulapoo2;

/**
 *
 * @author ranie
 */
public class Principal {

    public static void main(String[] args) {
        Empregado maria = new Empregado();
        maria.nome = "Maria Benedita";
        maria.endereco = "rua Jatobar, 33, Centro";
        maria.funcao = "Supervisora de loja";
        maria.salario = 9000.00;
        
        String aux = maria.verificarNomefuncao();
        System.out.println(aux);
            
        if(maria.verificarSalario())
            System.out.println("Salário de " + maria.nome + 
                    " é: R$" + maria.salario);
        else
            System.out.println("Salário inexistente.");
        
        
        System.out.println("\n");
        
        Empregado joao = new Empregado();
        joao.nome = "João ";
        joao.endereco = "Av Jacinto, 450, Jardim Ipriranga";
        joao.funcao = "Administrador";
        joao.salario = 2500.00;
        
        String auxJ = joao.verificarNomefuncao();
        System.out.println(auxJ);
            
        if(joao.verificarSalario())
            System.out.println("Salário de " + joao.nome + 
                    " é: R$" + joao.salario);
        else
            System.out.println("Salário inexistente.");
        
    }
    
}
