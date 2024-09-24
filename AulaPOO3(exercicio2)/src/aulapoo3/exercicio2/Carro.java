
package aulapoo3.exercicio2;

/**
 *
 * @author ranie
 */
public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    
    
    public void chamarInformacoes(){
        
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
    public void verificarTabelaFipe(double valor){
      double valorAtual = valor + (valor * 0.20);
        System.out.println("Valor fa tabela Fipe: " + valorAtual);
    }
    
}
