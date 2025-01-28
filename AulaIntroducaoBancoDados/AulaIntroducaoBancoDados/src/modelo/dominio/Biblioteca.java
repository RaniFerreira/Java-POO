
package modelo.dominio;

/**
 *
 * @author ranielly
 */
public class Biblioteca {
    
    private String nomeCoOrdenador;
    private int quantidadeAcervo;
    private String horarioFuncionamento;
     
    public Biblioteca() {
    }

    public Biblioteca(String nomeCoOrdenador, int quantidadeAcervo, String horarioFuncionamento) {
        this.nomeCoOrdenador = nomeCoOrdenador;
        this.quantidadeAcervo = quantidadeAcervo;
        this.horarioFuncionamento = horarioFuncionamento;
    }
   

    public String getNomeCoOrdenador() {
        return nomeCoOrdenador;
    }

    public void setNomeCoOrdenador(String nomeCoOrdenador) {
        this.nomeCoOrdenador = nomeCoOrdenador;
    }

    public int getQuantidadeAcervo() {
        return quantidadeAcervo;
    }

    public void setQuantidadeAcervo(int quantidadeAcervo) {
        this.quantidadeAcervo = quantidadeAcervo;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }
    
    @Override
    public String toString() 
    {
        return "Coordenador =" + nomeCoOrdenador + ", "
                + "Quantidade de Acervo =" + quantidadeAcervo + ", Horário de Funcionamento =" + 
                horarioFuncionamento + '}';
    }
    
}
