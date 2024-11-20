package provaq1;

/**
 *
 * @author ranielly
 */
public class Principal {
    public static void main(String[] args){
        
        Livro livro1 = new Livro();
        
        livro1.setAutor("Jojo MOyes");
        livro1.setEditora("Arqueiro");
        livro1.setTitulo("O passado");
        livro1.setEdicao(2);
        livro1.setISBN(4545);
        
        livro1.realizarEmprestimo(15);
        livro1.realizarDevolucao(2, false);
        System.out.println(livro1.toString());
        
        System.out.println("***********************************************************");
        
        Revista revista1 = new Revista();
        
        revista1.setNome("Achismo");
        revista1.setCategoria("espiritualidade");
        revista1.setEditora("O passado");
        revista1.setAno(2014);
        revista1.setEdicao(13);
        
        revista1.realizarEmprestimo(15);
        revista1.realizarDevolucao(2, false);
        System.out.println(revista1.toString());
        
        
        System.out.println("***********************************************************");
        Livro livro2 = new Livro();
        
        livro2.setAutor("Henri joaquim");
        livro2.setEditora("Arqueiro");
        livro2.setTitulo("a sorte do azar");
        livro2.setEdicao(2);
        livro2.setISBN(4358);
        
        livro2.realizarEmprestimo(25);
        livro2.realizarDevolucao(25, true);
        System.out.println(livro2.toString());
        
        System.out.println("***********************************************************");
        
        Revista revista2 = new Revista();
        
        revista2.setNome("tttt");
        revista2.setCategoria("ejoaqres");
        revista2.setEditora("O passado");
        revista2.setAno(2014);
        revista2.setEdicao(13);
        
        revista2.realizarEmprestimo(15);
        revista2.realizarDevolucao(58, true);
        System.out.println(revista2.toString());
    }
    
}
