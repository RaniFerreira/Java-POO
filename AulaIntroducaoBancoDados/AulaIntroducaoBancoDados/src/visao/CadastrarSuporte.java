
package visao;

import controlador.CSuporte;
import java.util.Scanner;
import modelo.dominio.Suporte;

/**
 *
 * @author ranie
 */
public class CadastrarSuporte {
    
    public void telaCadastro() {
        Scanner ler = new Scanner(System.in);
        
        // Solicita as informações do suporte
        System.out.printf("Informe o Responsavel: ");
        String responsavel = ler.nextLine();
        
        System.out.printf("Informe o numero do chamado:(0-para NULO) ");
        int numeroChamado = ler.nextInt();
        
        // Consume a quebra de linha deixada pelo nextInt()
        ler.nextLine(); 
        
        System.out.printf("Informe a data da Finalização do Suporte: ");
        String dataFinalizacao = ler.nextLine();
        
        System.out.printf("Informe a descrição do Chamado: ");
        String descricaoChamado = ler.nextLine();
        
        // Cria o objeto Suporte e define seus valores
        Suporte mSuporte = new Suporte();
        mSuporte.setResponsavel(responsavel);
        mSuporte.setNumeroChamado(numeroChamado);
        mSuporte.setDatafinalizacao(dataFinalizacao);
        mSuporte.setDescricaoChamado(descricaoChamado);
        
        // Chama o controlador para cadastrar o suporte
        CSuporte cSuporte = new CSuporte();
        
        // Exibe o retorno do cadastro
        System.out.println(cSuporte.cadastrarSuporte(mSuporte));
    }
    
}
