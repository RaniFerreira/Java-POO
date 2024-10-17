package livro;

/**
 *
 * @author ranielly
 */
public class Principal {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        
        livro1.setTitulo("Como Eu Era Antes de Você");
        livro1.setAutor("Jojo Moyes");
        livro1.setGenero("Romance");
        livro1.setPreco(25);
        
        System.out.println("Livro 1 ");
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Genêro: " + livro1.getGenero());
        System.out.println("Preço : R$ " + livro1.getPreco());
        System.out.println("---------------------------------------");
        
        Livro livro2 = new Livro();
        
        livro2.setTitulo("A Rainha Vermelha");
        livro2.setAutor("Victoria");
        livro2.setGenero("ficção");
        livro2.setPreco(85);
        
        System.out.println("Livro 2 ");
        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Genêro: " + livro2.getGenero());
        System.out.println("Preço : R$ " + livro2.getPreco());
    }
    
}
