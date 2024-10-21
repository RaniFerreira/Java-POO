/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapooherancaconstrutor;

/**
 *
 * @author ranie
 */
public class Funcionario {
    private String primeiroNome;
    private String segundoNome;
    private double salario;

    public Funcionario(String primeiroNome, String segundoNome, double salario) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.salario = salario;
    }


    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public double getSalario() {
        return salario;
    }
    
    
    
    
    
}
