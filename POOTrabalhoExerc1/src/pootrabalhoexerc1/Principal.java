package pootrabalhoexerc1;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args){
        
        FigurasGeometricas figura1 = new FigurasGeometricas(4,0,0,0,0,"quadrado");
        System.out.println( "\nNome da Figura: " + figura1.getNomeFigura());
        System.out.println("Valor lado: " + figura1.getLado());
        System.out.println("Calculo da area " + figura1.calcularAreaFigura());
        
        
        FigurasGeometricas figura2 = new FigurasGeometricas();
        figura2.setNomeFigura("triangulo");
        figura2.setAltura(5);
        figura2.setBase(6);
        System.out.println( "\nNome da Figura: " + figura2.getNomeFigura());
        System.out.println("Base: " + figura2.getBase());
        System.out.println("Altura: " + figura2.getAltura());
        System.out.println("Calculo da area: " + figura2.calcularAreaFigura());
        
        
        FigurasGeometricas figura3 = new FigurasGeometricas();
        figura3.setNomeFigura("trapezio");
        figura3.setAltura(0);
        figura3.setBaseMaior(11);
        figura3.setBaseMenor(10);
        System.out.println( "\nNome da Figura: " + figura3.getNomeFigura());
        System.out.println("Base Maior : " + figura3.getBaseMaior());
        System.out.println("Base Menor : " + figura3.getBaseMenor());
        System.out.println("Altura: " + figura3.getAltura());
        System.out.println("Calculo da area: " + figura3.calcularAreaFigura());
        
        
        
       
        
    }
    
}
