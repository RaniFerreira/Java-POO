/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questão1poopolimorfismo;

/**
 *
 * @author ranielly
 */
public class FilialPatosLojaVirtual extends ItemRoupa{
    private String URL;
    private String nomeEntregador;
    private static boolean statusEntregador = true;
    

    public FilialPatosLojaVirtual(String descricao, double valor, String URL, String nomeEntregador) {
        super(descricao, valor);
        this.URL = URL;
        this.nomeEntregador = nomeEntregador;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }

    public void setStatusEntregador(boolean statusEntregador) {
        this.statusEntregador = statusEntregador;
    }
    
    public String getURL() {
        return URL;
    }

    public String getNomeEntregador() {
        return nomeEntregador;
    }

    public boolean isStatusEntregador() {
        return statusEntregador;
    }
    
     @Override
    public void emprestar(){
        if(isDisponivel() && isStatusEntregador()){
            System.out.println("O item esta disponivel para emprestimo e sera entregue");
            setDisponivel(false);
            setStatusEntregador(false);
        }else{
            System.out.println("O item ou o entregador nao esta disponivel no momento");
        }
    }
    
    @Override
    public void devolver(){
        if(isStatusEntregador()){
            System.out.println("O entregador esta a caminho para retirar");
            setDisponivel(true);
            System.out.println("A devolução foi feita com sucesso");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", URL: " + URL + ", Nome Entregador: " + nomeEntregador + ", Status Entregador: " + statusEntregador + '}';
    }
  
}
