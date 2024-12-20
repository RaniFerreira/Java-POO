/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provainterface;

/**
 *
 * @author Ligia
 */
public class CalculadoraSimples2Numeros implements OperacoesAritmeticas{
    
    private int num1;
    private int num2;
    
    
    

//    @Override
//    public void mostrarSoma() 
//    {
//        System.out.println("mostrar aqui o resultado da soma de num1 e num2");
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
        int soma = num1 + num2;
        System.out.println("Soma = " + soma);
    }

    @Override
    public void mostrarSubtracao() {
        int sub = this.num1 - this.num2;
        System.out.println("Subtração = " + sub);
    }

    @Override
    public void mostrarDivisao() {
        
        double v1 = num1;
        double v2 = num2;
        double div = v1 /v2;
        System.out.println("Divisão: " + div);
    }

    @Override
    public void mostrarMultiplicacao() {
        int mult = this.num1 * this.num2;
        System.out.println("Multiplicação: " + mult);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        if(num1  <= 0){
            this.num1 = 1;
        }
        else{
            this.num1 = num1;
        }
        
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        
        if(num2  <= 0){
            this.num2 = 1;
        }
        else{
            this.num2 = num2;
        }
        
      
    }
    
    
}
