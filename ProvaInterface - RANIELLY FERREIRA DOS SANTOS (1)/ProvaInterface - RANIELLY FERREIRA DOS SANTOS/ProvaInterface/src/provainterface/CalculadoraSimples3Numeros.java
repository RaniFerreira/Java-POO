/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provainterface;

/**
 *
 * @author Ligia
 */
public class CalculadoraSimples3Numeros implements OperacoesAritmeticas
{
    private double num1;
    private double num2;
    private double num3;
    
    //@Override
//    public void mostrarSoma() 
//    {
//        System.out.println("mostrar aqui o resultado da soma de num1, num2 e num3");
//    }
    
    
    
    
/*- As classes concretas CalculadoraSimples2Numeros e CalculadoraSimples2Numeros implementam a classe interface OperacoesAritmeticas
- Consequentemente implementam seus métodos abstratos;
- A implementação dos métodos abstratos consiste em fazer a operação aritmética descrita no nome do método e mostrar o resultado;
- Encapsule as variáveis das duas classes;
- Crie métodos getters e setters;
- Verifique se o valor enviado pelo usuário é maior que 0 (zero), se não for, adicione 1 à variável;
- A verificação acima deve ser feita no setter de cada variável;*/
    

    @Override
    public void mostrarSoma() {
        double soma = this.num1 + this.num2 + this.num3;
        System.out.println("Soma = " + soma);
    }

    @Override
    public void mostrarSubtracao() {
        double sub = this.num1 - this.num2 - this.num3;
        System.out.println("Subtração = " + sub);
    }

    @Override
    public void mostrarDivisao() {
        double div = this.num1 / this.num2  / this.num3;
        System.out.println("Divisão: " + div);
    }

    @Override
    public void mostrarMultiplicacao() {
        double mult = this.num1 * this.num2 * this.num3;
        System.out.println("Multiplicação: " + mult);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        if(num1  <= 0){
            this.num1 = 1;
        }
        else{
            this.num1 = num1;
        }
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        if(num2  <= 0){
            this.num2 = 1;
        }
        else{
            this.num2 = num2;
        }
        
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        if(num3  <= 0){
            this.num3 = 1;
        }
        else{
            this.num3 = num3;
        }
    }
    
}
