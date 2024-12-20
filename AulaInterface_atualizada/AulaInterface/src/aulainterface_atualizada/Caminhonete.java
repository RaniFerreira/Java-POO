/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulainterface_atualizada;

/**
 *
 * @author ranie
 */
public class Caminhonete extends VeiculoEixoSimples{

    public Caminhonete(String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);
    }

    @Override
    public String tipoEixo() {
        return "Eixo simples com capacidade media de carga";
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.03;
    }
    
}
