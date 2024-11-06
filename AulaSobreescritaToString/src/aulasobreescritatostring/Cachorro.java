package aulasobreescritatostring;

/**
 *
 * @author ranie
 */
public class Cachorro extends Animal{

    public Cachorro(String nome, String raca, boolean predigree) {
        super(nome, raca, predigree);
    }
    
    @Override
    public void fazerSom(){
      
        System.out.println("Latindo, AuAu!");
        
    }
    
    
    
}
