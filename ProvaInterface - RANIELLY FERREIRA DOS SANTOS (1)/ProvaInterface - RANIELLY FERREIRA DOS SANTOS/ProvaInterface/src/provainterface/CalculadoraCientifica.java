/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provainterface;

/**
 *
 * @author Ligia
 */
public class CalculadoraCientifica extends OperacoesComplexas implements OperacoesAritmeticas{

    private int num1;
    private int num2;
    
//    @Override
//    public void mostrarEcalcularRaizQuadrada() 
//    {
        // Como calcular raiz quadrada em Java:
        // Número do qual queremos calcular a raiz quadrada: 
        // double numero = 16.0; 
        // Calculando a raiz quadrada usando o método Math.sqrt():
        // double raizQuadrada = Math.sqrt(numero); 
        // Exibindo o resultado:
        // System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada); 
//    }

//    @Override
//    public void mostrarEcalcularPotenciaQuadrado() 
//    {
        // Número que queremos elevar ao quadrado:
        // double numero = 5.0; 
        // Calculando a potência ao quadrado usando Math.pow() 
        // double potenciaQuadrado = Math.pow(numero, 2); 
        // Exibindo o resultado:
        // System.out.println(numero + " ao quadrado é " + potenciaQuadrado); 
//    }
    
    
/*- A classe concreta CalculadoraCientifica vai herdar a classe abstratas OperacoesComplexas e implementar a interface OperacoesAritmeticas
- Consequentemente implementa os métodos abstratos de ambas classes;
- A implementação dos métodos abstratos da classe interface OperacoesAritmeticas, 
    consiste em fazer a operação aritmética descrita no nome do método e mostrar o resultado;
- A implementação dos métodos abstratos da classe abstrata OperacoesComplexas, 
    consiste em realizar a operação descrita no nome tanto da variável num1 como da variável num2,
    posteriormente mostram ambos resultados;
- Encapsule as variáveis das duas classes;
- Crie métodos getters e setters;
- Verifique se o valor enviado pelo usuário é maior que 0 (zero), se não for, adicione 1 à variável;
- A verificação acima deve ser feita no setter de cada variável;*/

    @Override
    public void mostrarEcalcularRaizQuadrada() {
        double numero = this.num1;
        double numero2 = this.num2;
        // Calculando a raiz quadrada usando o método Math.sqrt():
        double raizQuadrada = Math.sqrt(numero);
        double raizQuadrada2 = Math.sqrt(numero2); 
        // Exibindo o resultado:
        System.out.println("Primeiro valor: ");
        System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada);
        System.out.println("Segundo valor");
        System.out.println("A raiz quadrada de " + numero2 + " é " + raizQuadrada2);
    }

    @Override
    public void mostrarEcalcularPotenciaQuadrado() {
        // Número que queremos elevar ao quadrado:
        double numero = this.num1; 
        double numero2 = this.num2;
        // Calculando a potência ao quadrado usando Math.pow() 
        double potenciaQuadrado = Math.pow(numero, 2); 
        double potenciaQuadrado2 = Math.pow(numero2, 2);
        // Exibindo o resultado:
        System.out.println("Primeiro valor");
        System.out.println(numero + " ao quadrado é " + potenciaQuadrado); 
        System.out.println("Segundo valor");
        System.out.println(numero2 + " ao quadrado é " + potenciaQuadrado2);
        
    }

   @Override
    public void mostrarSoma() {
        int soma = this.num1 + this.num2;
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
        };
    }



}
