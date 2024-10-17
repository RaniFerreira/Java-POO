package produto;

/**
 *
 * @author ranielly
 */
public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0){
            this.preco = 10;
        }
        else{
            this.preco = preco;
        }
    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(quantidadeEmEstoque <= 0){
            this.quantidadeEmEstoque = 1;
        }
        else{
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }
    
    
    
    
}
