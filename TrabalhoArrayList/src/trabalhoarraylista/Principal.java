/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoarraylista;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args){
        
        Zoologico animais = new Zoologico();
        
        animais.getMamiferos().add("Leao");
        animais.getMamiferos().add("Mamute");
        animais.getMamiferos().add("Urso");
        animais.getMamiferos().add("Girafa");
        animais.getMamiferos().add("Tigre");
        
        animais.getPeixes().add("Tucunaré");
        animais.getPeixes().add("Tilapia");
        animais.getPeixes().add("Oscar");
        animais.getPeixes().add("Traíra");
        animais.getPeixes().add("Dourado");
        
        animais.getAves().add("Canarinho");
        animais.getAves().add("Águia");
        animais.getAves().add("Corvo");
        animais.getAves().add("Maritaca");
        animais.getAves().add("Papagaio");
        
        
        int somaArray = animais.getMamiferos().size() + animais.getPeixes().size() + animais.getAves().size();
        System.out.println("O Zoologico tem: " + somaArray + " animais" );
        
        //mostrando e removendo um elemento da lista
            
        System.out.println(animais.getAves());
        
        //removendo po posicao
        
        animais.getAves().remove(1); // aguia estava na posicao 1, 
        animais.getAves().remove(1); // corvo estava na posicao 1,
        // lembrando que o indice inicia de 0
        
        //mostrando novamente
        
        System.out.println(animais.getAves());
        
        
        System.out.println("*****************************");
        System.out.println("Cerificando se há pelicano");
        
        if(!animais.getAves().contains("Pelicano")){
            
            animais.getAves().add("Pelicano");
            System.out.println("O animail foi adicionado");
        }
        else{
            System.out.println("Já tem Pelicano no zoologico");
        }
        
    }
    
}
