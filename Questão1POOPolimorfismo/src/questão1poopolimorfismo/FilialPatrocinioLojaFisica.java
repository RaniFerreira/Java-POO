/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questão1poopolimorfismo;

/**
 *
 * @author ranie
 */
public class FilialPatrocinioLojaFisica extends ItemRoupa{
    
    private String gerente;
    private String endereco;

    public FilialPatrocinioLojaFisica(String gerente, String endereco, String descricao, double valor) {
        super(descricao, valor);
        this.gerente = gerente;
        this.endereco = endereco;
    }
    
    

    @Override
    public void emprestar() {
        if(isDisponivel()){
            System.out.println("O item esta disponivel para emprestimo no endereco: " + endereco);
            setDisponivel(false);
        }else{
            System.out.println("O item nao esta disponivel para emprestimo");
        }
    }

    @Override
    public void devolver() {
        setDisponivel(true);
        System.out.println("A devolucao foi feita com sucesso");
    }
    
    @Override
    public String toString() {
        return "Loja Fisica: \n" + "Descrição: " + super.getDescricao() + ", Valor: R$ " + super.getValor()
                + "Endereco: " + endereco + "Gerente: " + gerente;
    } 
    
}
