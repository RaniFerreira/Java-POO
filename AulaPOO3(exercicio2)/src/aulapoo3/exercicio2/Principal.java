/**2) Crie uma classe chamada Carro com atributos marca, modelo e ano. 
 * Crie um método chamado mostrarInformacoes que retorne o valor de todas 
 * as variáveis concatenados, com seus respectivos rótulos. Crie também um método 
 * chamado verificarTabelaFipe, que receberá como parâmetro o valor do carro segundo 
 * a fipe dele no ano corrente, depois acrescente 20% desse valor e retorne o valor atualizado. 
 * Faça uma classe Principal com 3 objetos e teste todos os atributos e métodos.**/
package aulapoo3.exercicio2;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2020;
        carro1.chamarInformacoes();
        carro1.verificarTabelaFipe(45000);
        
        System.out.println("\n");
        carro2.marca = "Honda";
        carro2.modelo = "civic";
        carro2.ano = 2022;
        carro2.chamarInformacoes();
        carro2.verificarTabelaFipe(100000);
        
        System.out.println("\n");
        carro3.marca = "Toyota";
        carro3.modelo = "Corolla";
        carro3.ano = 2021;
        carro3.chamarInformacoes();
        carro3.verificarTabelaFipe(110000);
    }
    
}
