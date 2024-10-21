/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapooherancaconstrutor;

/**
 *
 * @author ranie
 */
public class FuncionarioComissionado extends Funcionario{
    
    
    private double comissao;
    private int vendas;
    
    public FuncionarioComissionado
        (String primeiroNome, String segundoNome, double salario,
                double comissao, int vendas){
        
        super(primeiroNome, segundoNome, salario);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public int getVendas() {
        return vendas;
    }
    public void adicionarVendas(int vendas){
        this.vendas += vendas;
    }
    public void zerarVendas(){
        this.vendas = 0;
    }
    
    public double calcularPagamentoTotal(){
        
        double pagamento 
                = getSalario() + (this.comissao * this.vendas);
        
        return pagamento;
    }    
    
    
}
