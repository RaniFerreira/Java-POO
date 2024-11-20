package provaq2;

/**
 *
 * @author ranielly
 */
public class Revista extends Exemplares{
    
    private String nome;
    private String categoria;
    private int ano;
    private int edicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(categoria.equals("psicologia")   || categoria.equals("espiritualidade") || categoria.equals("auto ajuda")){
            this.categoria = categoria;   
        }
        else{
            this.categoria = "sem categoria";
        }
        
    }



    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

   

    @Override
    public String realizarEmprestimo(int codigo) {
        if(codigo >= 1 && codigo <= 25 ){
            System.out.println("Prazo de devolução da revista - 15 dias");
        }
        if(codigo >= 26 && codigo <= 40 ){
            System.out.println("Prazo de devolução da restista - 15 dias");
        }
        
        
        
        return "";
    }

    @Override
    public String realizarDevolucao(int codigo, boolean atraso) {
        if(codigo >= 1 && codigo <= 25){
            System.out.println("Valor do emprestimo da revista - 10 reais");
        }
        if(codigo >= 11 && codigo <= 40 ){
            System.out.println("Valor do emprestimo da revista - 15 reais");
        }
     
        if(atraso == true){
            System.out.println("Revista em atraso");
        }
        
        return "";
    }
    
    @Override
    public String toString(){
        
        return"{Revista: " + "Nome: " + nome + ", ECategoria: " + categoria
                + ", Editora: " + super.getEditora()+ ", Ano: " + ano + ", Edição: " + super.getEdicao();
    }
    
    
    
}
