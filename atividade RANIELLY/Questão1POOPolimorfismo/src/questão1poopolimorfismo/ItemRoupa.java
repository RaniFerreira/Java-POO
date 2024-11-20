package questão1poopolimorfismo;

/**
 *
 * @author ranie
 */
public abstract class  ItemRoupa {
    
    private String descricao;
    private double valor;
    private static boolean disponivel = true;

    public ItemRoupa() {
    }
    

    public ItemRoupa(String descricao, double valor) {
        
        if(descricao.equals("calca") || descricao.equals("jaqueta") ||
        descricao.equals("T-Shirt") || descricao.equals("shorts") ||
        descricao.equals("vestido") || descricao.equals("blusa")){
            this.descricao = descricao;
        }else{
            System.out.println("Item sem cadastro no sistema.");
            this.descricao = "sem cadastro";
        }
       
        if(valor == 0){
            this.valor = 10;
        }else{
            this.valor = valor;
        }
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public static boolean isDisponivel() {
        return disponivel;
    }
    
    public abstract void emprestar();
    public abstract void devolver();
    
    public static void setDisponivel(boolean disponivel) {
        ItemRoupa.disponivel = disponivel;
    }
    
    @Override
    public String toString() {
        return "ItemRoupa{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", disponivel=" + disponivel +
                '}';
    }
}


