package aulapoo2;

/**
 *
 * @author ranie
 */
public class Empregado {
   
    public String nome;
    public String endereco;
    public String funcao;
    public double salario;
    
    public boolean verificarSalario(){
        
        boolean auxSalario = salario > 0 ? true : false;
        return auxSalario;
    }
    
    public String verificarNomefuncao(){
        
        String aux = "Funcionário: " + nome + "\nSalário: R$ " + salario;
        return aux;
    }
}
