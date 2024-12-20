/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulainterface_atualizada;

/**
 *
 * @author ranie
 */
public class Trator extends VeiculoRural{

    public Trator(String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);
    }
    
    

    @Override
    public String finalidadeRural() {
        return "Uso em atividades agricolas";
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.2;
    }
    
}
