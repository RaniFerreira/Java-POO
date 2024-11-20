package provaq2;

/**
 *
 * @author ranie
 */
public abstract class Exemplares {
    
    private String editora;
    private int edicao;
    
    public abstract String realizarEmprestimo(int codigo);
    public abstract String realizarDevolucao(int codigo, boolean atraso);
    
    public String toString(){
        
        return "{Exemplares: Editora: " + editora + ", Edição: " + edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    
    
    
}
