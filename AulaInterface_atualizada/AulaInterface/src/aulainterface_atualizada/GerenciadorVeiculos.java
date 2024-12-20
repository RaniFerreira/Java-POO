package aulainterface_atualizada;

import java.util.ArrayList;

/**
 *
 * @author Ligia
 */
public class GerenciadorVeiculos 
{
    private ArrayList<VeiculoN> veiculosN;
    private ArrayList<VeiculoRural> veiculosR;
    private ArrayList<VeiculoEixoSimples> veiculosE;
    
    
    public GerenciadorVeiculos() {
    veiculosN = new ArrayList<>();
    veiculosR = new ArrayList<>();
    veiculosE = new ArrayList<>();
}
    
    public void adicionarVeiculo(VeiculoN veiculoN) 
    { 
        this.veiculosN.add(veiculoN); 
    }
    
    public void adicionarVeiculoRural(VeiculoRural veiculoR) 
    { 
        this.veiculosR.add(veiculoR); 
    }
    
    public void adicionarVeiculoEixo(VeiculoEixoSimples veiculoE) 
    { 
        this.veiculosE.add(veiculoE); 
    }
    
    public double calcularImpostoTotalVeiculosN() 
    { 
        double total = 0; 
        for (VeiculoN veiculo : veiculosN) 
        { 
            total+= veiculo.calcularImposto(); 
        } 
        return total; 
    }
    
    public double calcularImpostoTotalVeiculosR() 
    { 
        double total = 0; 
        for (VeiculoRural veiculo : veiculosR) 
        { 
            total+= veiculo.calcularImposto(); 
        } 
        return total; 
    }
    
    public double calcularImpostoTotalVeiculosE() 
    { 
        double total = 0; 
        for (VeiculoEixoSimples veiculo : veiculosE) 
        { 
            total+= veiculo.calcularImposto(); 
        } 
        return total; 
    }
    
    public void listarVeiculosN() 
    { 
        for (VeiculoN veiculo : veiculosN) 
        { 
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Valor: " + veiculo.getValor() + ", Imposto: " + veiculo.calcularImposto()); 
        } 
    }
    
    public void listarVeiculosR() 
    { 
        for (VeiculoRural veiculo : veiculosR) 
        { 
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Valor: " + veiculo.getValor() + ", Imposto: " + veiculo.calcularImposto()); 
        } 
    }
    
    public void listarVeiculosE() 
    { 
        for (VeiculoEixoSimples veiculo : veiculosE) 
        { 
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Valor: " + veiculo.getValor() + ", Imposto: " + veiculo.calcularImposto()); 
        } 
    }
    
    
}
