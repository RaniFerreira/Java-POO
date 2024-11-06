/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args){
        Personalidade personalidade = new Personalidade();
        Extrovertido extrovertido = new Extrovertido();
        Introvertido introvertido = new Introvertido();
        Otimista otimista = new Otimista();
        Pessimista pessimista = new Pessimista();
        ProAtivo proAtivo = new ProAtivo();
        
        Personalidade [] variasPersonalidades = new Personalidade[6];
        variasPersonalidades[0] = personalidade;
        variasPersonalidades[1] = extrovertido;
        variasPersonalidades[2] = introvertido;
        variasPersonalidades[3] = otimista;
        variasPersonalidades[4] = pessimista;
        variasPersonalidades[5] = proAtivo;
       
        /*
        System.out.println(variasPersonalidades[2].falar());
        System.out.println(variasPersonalidades[4].falar());
        */
        
        personalidade.acionarFalar(variasPersonalidades[0]);
        personalidade.acionarFalar(variasPersonalidades[1]);
        personalidade.acionarFalar(variasPersonalidades[2]);
        personalidade.acionarFalar(variasPersonalidades[3]);
        personalidade.acionarFalar(variasPersonalidades[4]);
        personalidade.acionarFalar(variasPersonalidades[5]);
                
    }
        
}
