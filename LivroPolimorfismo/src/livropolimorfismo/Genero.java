/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livropolimorfismo;

/**
 *
 * @author ranie
 */
public class Genero extends Livro{
    
    private String tipoGenero;
    
    public Genero(){
        
    }

    public Genero(String tipoGenero, int quantidadePagina, String titulo, String idioma) {
        super(quantidadePagina, titulo, idioma);
        this.tipoGenero = tipoGenero;
    }

    public Genero(int quantidadePagina, String titulo, String idioma) {
        super(quantidadePagina, titulo, idioma);
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }
    
    
    
    

    @Override
    public void verPreco() {
        
        if(super.getQuantidadePagina() > 300){
            double preco = 95;
            System.out.println("Preço: R$ " + preco);
        }
        else{
            System.out.println("Preço: R$ " + 78);
        }
    }

    @Override
    public void adicionarDescricao(String descricao) {
        System.out.println(descricao);
    }
    
    public String toString(){
        return"{Genero: -> Titulo: " + super.getTitulo() + ", Quantidade de Páginas: " + 
                super.getQuantidadePagina() + ", Idioma: " + super.getIdioma() + ", Tipo Genero: "  + tipoGenero;
    }
    
    
    
}
