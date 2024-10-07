package excercicioteste;

/**
 *
 * @author ranie
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String modelo, float ponta){
        //estse é o metodo construtor
        this.setModelo(modelo);
        this.setPonta(ponta);
        this.tampar();
        this.cor = "Azul";
        
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampada(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Dados da caneta: ");
        System.out.println("Modelo:" + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + cor);
        System.out.println("Tampada: " + this.tampada);
    }
    
    
}
