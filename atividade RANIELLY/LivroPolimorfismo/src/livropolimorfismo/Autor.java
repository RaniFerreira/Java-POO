/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livropolimorfismo;

/**
 *
 * @author ranie
 */
public class Autor extends Livro{
    
    private String nome;
    private int idade;
    
    public Autor(){
        
    }

    
    public Autor(String nome, int idade, int quantidadePagina, String titulo, String idioma) {
        super(quantidadePagina, titulo, idioma);
        this.nome = nome;
        
        if(idade < 18){
            this.idade = 20;
        }
        else{
            this.idade = idade;  
        }
        
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 18){
            this.idade = 20;
        }
        else{
            this.idade = idade;  
        }
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
        return"{Autor: -> Titulo: " + super.getTitulo() + ", Quantidade de Páginas: " + 
                super.getQuantidadePagina() + ", Idioma: " + super.getIdioma() + ", Autor: " + nome + ", idade: " + idade;
    }
    
}
