package aulapoo4gettersetter;

/**
 *
 * @author ranie
 */
public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;

    // metodos gettes recuperam informações
    // metodos setters adicionam informações
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
