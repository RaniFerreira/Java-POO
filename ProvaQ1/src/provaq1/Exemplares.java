package provaq1;

/**
 *
 * @author ranielly
 */
public abstract class Exemplares {
    
    public abstract String realizarEmprestimo(int codigo);
    public abstract String realizarDevolucao(int codigo, boolean atraso);
    
    public String toString(){
        
        return "{Exemplares: ";
    }
    
}
