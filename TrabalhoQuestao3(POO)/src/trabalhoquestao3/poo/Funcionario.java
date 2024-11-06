/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoquestao3.poo;

/**
 *
 * @author ranie
 */
public class Funcionario {
    
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
    public void calcularBonus(String mesPagamento){
        double salarioComBonus = salario;
        if(mesPagamento.equals("dezembro")){
            salarioComBonus += (salario * 10) / 100;
            System.out.println("Funcionario: " + nome + "\nSalario para o mes: " + mesPagamento +
            " R$ " + salarioComBonus);
        }else{
            System.out.println("Funcionario: " + nome + "\nSalario para o mes: " + mesPagamento +
        " R$ " + salario);
        }

    }
    
    @Override
    public String toString() {
        System.out.println("****************************************************");
        return "Funcionario" + "\nNome: " + nome + "\nSalario: " + salario;
    }
    
}
