/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasobreescritatostring;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main (String[] args){
        
        Animal lulu = new Animal("Lulu", "gato", false);
        lulu.fazerSom();
        
        System.out.println(lulu.toString());
        
        
        Cachorro joaquim = new Cachorro("Joaquim", "cachorro", true);
        joaquim.fazerSom();
        
        Animal theo = new Cachorro("Theo", "Pincher", true);
        theo.fazerSom();
    }
    
}
