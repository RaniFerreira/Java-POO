package provaq2;

/**
 *
 * @author ranielly
 */
public class Livro extends Exemplares{
    private String autor;
    private String titulo;
    private int ISBN;
    
    

    @Override
    public String realizarEmprestimo(int codigo) {
        if(codigo >= 1 && codigo <=10 ){
            System.out.println("Prazo de devolução do livro - 10 dias");
        }
        if(codigo >= 11 && codigo <= 20 ){
            System.out.println("Prazo de devolução do livro - 20 dias");
        }
        if(codigo >= 20 ){
            System.out.println("Prazo de devolução do livro - Indeterminado");
        }
        
        
        return "";

    }

    @Override
    public String realizarDevolucao(int codigo, boolean atraso) {
    
        if(codigo >= 1 && codigo <=10 ){
            System.out.println("Valor do emprestimo do livro - 10 reais");
        }
        if(codigo >= 11 && codigo <= 20 ){
            System.out.println("Valor do emprestimo do livro - 15 reais");
        }
        if(codigo >= 20 ){
            System.out.println("Valor do emprestimo do livro - 50 reais");
        }
        if(atraso == true){
            System.out.println("Livro em atraso");
        }
        
        
        return "";
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    @Override
    public String toString(){
        return"{Livro: " + "Autor: " + autor + ", Editora: " + super.getEditora()
                + ", Titulo: " + titulo + ", Edição: " + super.getEdicao()+ ", ISBN: " + ISBN;
    }
    
}
