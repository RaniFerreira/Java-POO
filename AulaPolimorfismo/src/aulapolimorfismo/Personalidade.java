/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author ranie
 */
public abstract class Personalidade {
    
    public abstract String falar();
    
    public void acionarFalar(PersonalidadeClasseConcreta obj){
        
        System.out.println(obj.falar());
    }
    
}
