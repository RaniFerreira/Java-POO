package produto;

/**
 *
 * @author ranielly
 */
public class Principal {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        
        produto1.setNome("Azulim");
        produto1.setCategoria("Limpeza");
        produto1.setPreco(24);
        produto1.setQuantidadeEmEstoque(4);
        
        System.out.println("Produto 1");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Categoria: " + produto1.getCategoria());
        System.out.println("Preço : R$ " + produto1.getPreco());
        System.out.println("Quantidade em Estoque : " + produto1.getQuantidadeEmEstoque());
        System.out.println("----------------------------------------------------------");
        
        Produto produto2 = new Produto();
        
        produto2.setNome("Bombom Lactea");
        produto2.setCategoria("Alimentos");
        produto2.setPreco(3);
        produto2.setQuantidadeEmEstoque(25);
        
        System.out.println("Produto 2");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Categoria: " + produto2.getCategoria());
        System.out.println("Preço : R$ " + produto2.getPreco());
        System.out.println("Quantidade em Estoque : " + produto2.getQuantidadeEmEstoque());
        System.out.println("----------------------------------------------------------");
        
        
        Produto produto3 = new Produto(); // Aplicando valores inválido para teste de verificação
        
        produto3.setNome("Lapis Faber Castell");
        produto3.setCategoria("Material escolar");
        produto3.setPreco(0);
        produto3.setQuantidadeEmEstoque(0);
        
        System.out.println("Produto 3");
        System.out.println("Nome: " + produto3.getNome());
        System.out.println("Categoria: " + produto3.getCategoria());
        System.out.println("Preço : R$ " + produto3.getPreco());
        System.out.println("Quantidade em Estoque : " + produto3.getQuantidadeEmEstoque());
        
    }
    
}
