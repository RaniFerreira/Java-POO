/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoquestao3.poo;

/**
 *
 * @author ranie
 */
public class Gerente extends Funcionario{
    
    private double gratificacao;

    public Gerente(String nome, double salario, double gratificacao) {
        super(nome, salario);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }
    
    @Override
    public void calcularBonus(String mesPagamento){ 
        if(mesPagamento.equals("dezembro") || mesPagamento.equals("janeiro") || mesPagamento.equals("julho") || gratificacao > 1000.0){
            double salarioComBonus = (getSalario() * 1.20) + gratificacao;
            System.out.println("Gerente: " + getNome() + "\nSalario para o mes: " + mesPagamento +
        " R$ " + salarioComBonus);
        }else{
            System.out.println("Gerente: " + getNome() + "\nSalario para o mes: " + mesPagamento +
            " R$ " + getSalario());
        }
    }
    
    public String toString() {
        System.out.println("*****************************************************");
        return "Gerente" + "\nNome: " + getNome() + "\nsalario: " + getSalario() + "\nGratificacao: " + gratificacao;
    }
    
}
