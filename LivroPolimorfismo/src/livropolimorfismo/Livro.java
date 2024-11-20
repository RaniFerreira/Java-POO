/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livropolimorfismo;

/**
 *
 * @author ranie
 */
public abstract class Livro {
    private int quantidadePagina;
    private String titulo;
    private String idioma;
    
    public Livro(){
        
    }

    public Livro(int quantidadePagina, String titulo, String idioma) {
        
        if(quantidadePagina < 250){
            System.out.println("O livro precisa ter no minimo 250 Páginas");
            return;
        }
        else{
            this.quantidadePagina = quantidadePagina;
        }
        
        this.titulo = titulo;
        if(!idioma.equals("ingles") && !idioma.equals("portugues")){
            System.out.println("Não São aceitos livros neste idioma(somente Inglês e Português)");
            
            this.idioma = "Sem idioma definido";
        }
        else{
            this.idioma = idioma;
        }
        
    }

    public void setQuantidadePagina(int quantidadePagina) {
        this.quantidadePagina = quantidadePagina;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    

    public int getQuantidadePagina() {
        return quantidadePagina;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIdioma() {
        return idioma;
    }
    
    
    
    public abstract void verPreco();
    
    public abstract void adicionarDescricao(String descricao);
    
    public String toString(){
        return"{Livro: -> Titulo: " + titulo + ", Quantidade de Páginas: " + quantidadePagina + ", Idioma: " + idioma;
    }
}
