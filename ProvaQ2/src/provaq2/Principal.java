package provaq2;

/**
 *
 * @author ranielly
 */
public class Principal {
    public static void main(String[] args){
        
        System.out.println("Teste feito com editora e edicão sendo da classe Exemplares");
        System.out.println("*******************************************************************");
        
        
        Livro livro3 = new Livro();
        
        
        livro3.setAutor("Ranielly");
        livro3.setEditora("Edit");
        livro3.setTitulo("A volta dos que não foram");
        livro3.setEdicao(3);
        livro3.setISBN(1548);
        
        livro3.realizarEmprestimo(78);
        livro3.realizarDevolucao(15, false);
        System.out.println(livro3.toString());
        
        System.out.println("****************************************************************");
        
        Revista revista3 = new Revista();
        
        revista3.setNome("Achismo");
        revista3.setCategoria("carneirinho do nordeste");
        revista3.setEditora("O passado");
        revista3.setAno(2014);
        revista3.setEdicao(13);
        
        revista3.realizarEmprestimo(7);
        revista3.realizarDevolucao(2, true);
        System.out.println(revista3.toString());
    }
    
}
