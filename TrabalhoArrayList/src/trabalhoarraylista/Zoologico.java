/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoarraylista;

import java.util.ArrayList;

/**
 *
 * @author ranie
 */
public class Zoologico {
    
    private ArrayList<String> mamiferos;
    private ArrayList<String> peixes;
    private ArrayList<String> aves;

     public Zoologico() {
        this.mamiferos = new ArrayList<>();
        this.peixes = new ArrayList<>();
        this.aves = new ArrayList<>();
    }

    // Construtor com parâmetros: usa os valores fornecidos
    public Zoologico(ArrayList<String> mamiferos, ArrayList<String> peixes, ArrayList<String> aves) {
        this.mamiferos = mamiferos;
        this.peixes = peixes;
        this.aves = aves;
    }


    public ArrayList<String> getMamiferos() {
        return mamiferos;
    }

    public void setMamiferos(ArrayList<String> mamiferos) {
        this.mamiferos = mamiferos;
    }

    public ArrayList<String> getPeixes() {
        return peixes;
    }

    public void setPeixes(ArrayList<String> peixes) {
        this.peixes = peixes;
    }

    public ArrayList<String> getAves() {
        return aves;
    }

    public void setAves(ArrayList<String> aves) {
        this.aves = aves;
    }
    
    
    
}
