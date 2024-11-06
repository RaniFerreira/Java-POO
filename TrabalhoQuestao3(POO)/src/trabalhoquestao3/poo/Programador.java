/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoquestao3.poo;

/**
 *
 * @author ranie
 */
public class Programador extends Funcionario{
    
    private double valorPontoFuncao;

    public double getValorPontoFuncao() {
        return valorPontoFuncao;
    }

    public Programador(String nome, double salario, double valorPontoFuncao) {
        super(nome, salario);
        this.valorPontoFuncao = valorPontoFuncao;
    }
    
    public double calcularValorSoftware(int linhasCodigo){
        return valorPontoFuncao * linhasCodigo;
    }
    
    @Override
    public void calcularBonus(String mesPagamento){ 
        if(!mesPagamento.equals("dezembro") && !mesPagamento.equals("janeiro") && !mesPagamento.equals("julho")){
            double salarioComBonus = getSalario() * 1.05;  
            System.out.printf("Programador: " +  getNome() + "\nSalario para o mes: " + mesPagamento + " R$ " + salarioComBonus);
        }else{
            System.out.printf("Programador: " +  getNome() + "\nSalario para o mes: " + mesPagamento + " R$ " + getSalario());

        }
    }
    
    @Override
    public String toString() {
        System.out.println("\n*****************************************************");
        return "Programador" + "\nNome: " + getNome() + "\nSalario: " + getSalario() + "\nValorPontoFuncao = " + valorPontoFuncao;
    }
    
}
