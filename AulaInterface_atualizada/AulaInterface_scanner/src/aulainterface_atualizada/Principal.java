package aulainterface_atualizada;

import java.util.Scanner;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);

        // Gerenciador para carros
        GerenciadorVeiculos gerenciadorCarros = new GerenciadorVeiculos();
        System.out.println("Adicionando Carro");
        System.out.print("Digite a marca do carro: ");
        String marcaCarro = leia.nextLine();
        System.out.print("Digite o modelo do carro: ");
        String modeloCarro = leia.nextLine();
        System.out.print("Digite o ano do carro: ");
        int anoCarro = leia.nextInt();
        System.out.print("Digite o preço do carro: ");
        double precoCarro = leia.nextDouble();
        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, precoCarro);
        gerenciadorCarros.adicionarVeiculo(carro);

        System.out.println("\nVeículos sem PNE no sistema:");
        gerenciadorCarros.listarVeiculosN();
        System.out.println("Imposto total: " + gerenciadorCarros.calcularImpostoTotalVeiculosN());

        System.out.println("****************************************************************************************");

        // Gerenciador para motos
        GerenciadorVeiculos gerenciadorMotos = new GerenciadorVeiculos();
        System.out.println("Adicionando Moto");
        leia.nextLine(); // Consumir quebra de linha
        System.out.print("Digite a marca da moto: ");
        String marcaMoto = leia.nextLine();
        System.out.print("Digite o modelo da moto: ");
        String modeloMoto = leia.nextLine();
        System.out.print("Digite o ano da moto: ");
        int anoMoto = leia.nextInt();
        System.out.print("Digite o preço da moto: ");
        double precoMoto = leia.nextDouble();
        Moto moto = new Moto(marcaMoto, modeloMoto, anoMoto, precoMoto);
        gerenciadorMotos.adicionarVeiculo(moto);

        System.out.println("\nMotos sem PNE no sistema:");
        gerenciadorMotos.listarVeiculosN();
        System.out.println("Imposto total: " + gerenciadorMotos.calcularImpostoTotalVeiculosN());

        System.out.println("****************************************************************************************");

        // Gerenciador para tratores
        GerenciadorVeiculos gerenciadorTratores = new GerenciadorVeiculos();
        System.out.println("Adicionando Trator");
        leia.nextLine(); // Consumir quebra de linha
        System.out.print("Digite a marca do trator: ");
        String marcaTrator = leia.nextLine();
        System.out.print("Digite o modelo do trator: ");
        String modeloTrator = leia.nextLine();
        System.out.print("Digite o ano do trator: ");
        int anoTrator = leia.nextInt();
        System.out.print("Digite o preço do trator: ");
        double precoTrator = leia.nextDouble();
        Trator trator = new Trator(marcaTrator, modeloTrator, anoTrator, precoTrator);
        gerenciadorTratores.adicionarVeiculoRural(trator);

        System.out.println("\nVeículos Rurais no sistema:");
        gerenciadorTratores.listarVeiculosR();
        System.out.println("Imposto total: " + gerenciadorTratores.calcularImpostoTotalVeiculosR());

        System.out.println("****************************************************************************************");

        // Gerenciador para caminhonetes
        GerenciadorVeiculos gerenciadorCaminhonetes = new GerenciadorVeiculos();
        System.out.println("Adicionando Caminhonete");
        leia.nextLine(); // Consumir quebra de linha
        System.out.print("Digite a marca da caminhonete: ");
        String marcaCaminhonete = leia.nextLine();
        System.out.print("Digite o modelo da caminhonete: ");
        String modeloCaminhonete = leia.nextLine();
        System.out.print("Digite o ano da caminhonete: ");
        int anoCaminhonete = leia.nextInt();
        System.out.print("Digite o preço da caminhonete: ");
        double precoCaminhonete = leia.nextDouble();
        Caminhonete caminhonete = new Caminhonete(marcaCaminhonete, modeloCaminhonete, anoCaminhonete, precoCaminhonete);
        gerenciadorCaminhonetes.adicionarVeiculoEixo(caminhonete);

        System.out.println("\nVeículos de Eixo simples no sistema:");
        gerenciadorCaminhonetes.listarVeiculosE();
        System.out.println("Imposto total: " + gerenciadorCaminhonetes.calcularImpostoTotalVeiculosE());
    }
    
}
