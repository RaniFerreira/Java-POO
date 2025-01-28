package modelo.dominio;

/**
 *
 * @author ranielly
 */
public class Suporte {
    
    private String responsavel;
    private int numeroChamado;
    private String datafinalizacao;
    private String descricaoChamado;

    public Suporte() {
    }

    public Suporte(String responsavel, int numeroChamado, String datafinalizacao, String descricaoChamado) {
        this.responsavel = responsavel;
        this.numeroChamado = numeroChamado;
        this.datafinalizacao = datafinalizacao;
        this.descricaoChamado = descricaoChamado;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getNumeroChamado() {
        return numeroChamado;
    }

    public void setNumeroChamado(int numeroChamado) {
        this.numeroChamado = numeroChamado;
    }

    public String getDatafinalizacao() {
        return datafinalizacao;
    }

    public void setDatafinalizacao(String datafinalizacao) {
        this.datafinalizacao = datafinalizacao;
    }

    public String getDescricaoChamado() {
        return descricaoChamado;
    }

    public void setDescricaoChamado(String descricaoChamado) {
        this.descricaoChamado = descricaoChamado;
    }

    @Override
    public String toString() 
    {
        return "Responsável =" +responsavel + ", "
                + "Numero do Chamado =" + numeroChamado+ ", Data da Finalização =" + 
                datafinalizacao + ", Descrição do Chamado =" + descricaoChamado + '}';
    }
    
}
