/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulainterface_atualizada;

/**
 *
 * @author ranie
 */
public class Carreta extends VeiculoEixoSimples{

    public Carreta(String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);
    }

    @Override
    public String tipoEixo() {
        return "Eixo duplo para grandes cargas";
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.05;
    }
    
}
