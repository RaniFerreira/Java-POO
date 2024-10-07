package aulapoogettersetterconstrutorexce2;

/**
 *
 * @author ranie
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.chamarInformacoes();
        this.verificarTabelaFipe(valor);
    }
    
    public void chamarInformacoes(){
        
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
    }
    
    public void verificarTabelaFipe(double valor){
      double valorAtual = valor + (valor * 0.20);
        System.out.println("Valor da tabela Fipe: " + valorAtual);
    }
    

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    
    
}
