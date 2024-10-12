package pootrabalhoexerc1;

/**
 *
 * @author ranie
 */
public class FigurasGeometricas {
    private double lado;
    private double altura;
    private double base;
    private double baseMaior;
    private double baseMenor;
    private String nomeFigura;

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(double lado, double altura, double base, double baseMaior, double baseMenor, String nomeFigura) {
        if(lado <= 0)
            this.lado = 1;
        else
            this.lado = lado;
        if(altura <= 0)
            this.altura = 1;
        else
            this.altura = altura;
        if(base <= 0)
            this.base = 1;
        else
            this.base = base;
        if(baseMaior <= 0)
            this.baseMaior = 1;
        else
            this.baseMaior = baseMaior;
        
        if(baseMenor<= 0)
            this.baseMenor = 1;
        else
            this.baseMenor = baseMenor;
        
        this.nomeFigura = nomeFigura;
    }
    
    

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        if(lado <= 0)
            this.lado = 1;
        else
            this.lado = lado;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0)
            this.altura = 1;
        else
            this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        if(base <= 0)
            this.base = 1;
        else
            this.base = base;
    }

    public double getBaseMaior() {
        return this.baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        if(baseMaior <= 0)
            this.baseMaior = 1;
        else
            this.baseMaior = baseMaior;;
    }

    public double getBaseMenor() {
        return this.baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        if(baseMenor<= 0)
            this.baseMenor = 1;
        else
            this.baseMenor = baseMenor;
    }

    public String getNomeFigura() {
        return this.nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    public double calcularAreaFigura(){
        
        if (nomeFigura.equals("quadrado"))
            return this.lado * lado;
      
        else if (nomeFigura.equals("triangulo"))
            return (this.base * this.altura) / 2;
        
        else if (nomeFigura.equals("trapezio"))
            return ((this.baseMaior + this.baseMenor) * this.altura) / 2;
        
        else 
            return 0;
    }
    
    
    
    
}
