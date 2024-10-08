
package aulapoogettersetterconstrutorexec3;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args){
        
        Smartphone Smart1 = new Smartphone(5,516);
        Smart1.setModelo("Iphone 13");
        Smart1.setMarca("Apple");
        
        System.out.println("Modelo: " + Smart1.getModelo());
        System.out.println("Marca: " + Smart1.getMarca());
        System.out.println("Memoria Ram: " + Smart1.getMemoriaRam());
        System.out.println("HD: " + Smart1.getHD());
        
    }
}
