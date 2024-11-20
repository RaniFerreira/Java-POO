package aulaarraylist;

import java.util.ArrayList;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args){
        
        //ArrayLista classe pertencente no pacote util
        //Estrutura de dados no formato de lista
        ArrayList lista = new ArrayList();
        //adicionando valores aleatorios na lilsta
        lista.add("Ian");
        lista.add("Paulo");
        lista.add("Pedro");
        lista.add("Ranielly");
        
        lista.add(2.4);
        lista.add(100);
        lista.add(true);
        
        //adicionando valor com indice
        lista.add(5, "Ligia");
        
        //imprimindo a lista conforme o tamanho
        for(int i=0; i < lista.size(); i++){
            
            System.out.println(lista.get(i));
        }
        
        System.out.println("A lista tem = " + lista.size() + " posições");
        
        //mostrando e removendo um elemento da lista
        System.out.println("Elemento: 3 -> " + lista.get(3));
        System.out.println("Removendo...");
        lista.remove(3);
        
        //iterando novamente apos remoção
        for(int i=0; i < lista.size(); i++){
            
            System.out.println(lista.get(i));
        }
        
        
        //testando se o elemento esta na lista
        
        String elemento = "Ranielly";
        if(lista.contains(elemento)){
            System.out.println("Valor existente");
        }
        else{
            System.out.println("Valor Inexistente");
        }
        
        String elemento2 = "Paulo";
        if(lista.contains(elemento2)){
            System.out.println("Valor Existente!");
        }
        else{
            System.out.println("Valor Inexistente!");
        }
        
        //mostrando posicionamento de um determinado valor na lista
        
        System.out.println("O valor 2.4 está localizado no seguinte indice: "
            + lista.indexOf(2.4));
            
        
    }
    
}
