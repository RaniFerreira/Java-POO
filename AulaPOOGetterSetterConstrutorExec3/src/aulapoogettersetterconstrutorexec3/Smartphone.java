package aulapoogettersetterconstrutorexec3;

/**
 *
 * @author ranie
 */
public class Smartphone {
    private String modelo;
    private String marca;
    private int memoriaRam;
    private int HD;
    
    public Smartphone(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
        
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if(marca.equals("Apple") || marca.equals("Xioami") || marca.equals("Samsung")){
            this.marca = marca;
        }
        else{
            this.marca= "Não informado!";
        }
    }

    public int getMemoriaRam() {
        return this.memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getHD() {
        return this.HD;
    }

    public void setHD(int HD) {
        this.HD = HD;
    }

    public Smartphone(int memoriaRam, int HD) {
        
        if(memoriaRam <= 0 && HD <= 0){
            
            this.memoriaRam = 100;
            this.HD = 100;
        }
        else{
            this.memoriaRam = memoriaRam;
            this.HD = HD;
            
        }
            
    }

   
    
    

    
    
    
    
    
}
