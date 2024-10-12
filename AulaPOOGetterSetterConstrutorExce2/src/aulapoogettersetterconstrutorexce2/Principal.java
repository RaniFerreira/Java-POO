package aulapoogettersetterconstrutorexce2;

/**
 *
 * @author ranie
 */
public class Principal {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Uno", 2014);
        carro1.chamarInformacoes();
        carro1.verificarTabelaFipe(45000);
        Carro carro2 = new Carro("Honda" , "Civic", 2022);
        carro2.chamarInformacoes();
        carro2.verificarTabelaFipe(100000);
        Carro carro3 = new Carro("Toyota", "Corola",2021);
        carro3.chamarInformacoes();
        carro3.verificarTabelaFipe(110000);
    }
    
}
