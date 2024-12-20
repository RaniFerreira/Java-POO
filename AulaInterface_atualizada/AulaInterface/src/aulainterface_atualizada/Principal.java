package aulainterface_atualizada;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos(); 
        Carro carro1 = new Carro("Toyota", "Corolla", 2021, 80000);
        Carro carro2 = new Carro("VolksWagen", "Fox Connect", 2020, 40000);
        
        gerenciador.adicionarVeiculo(carro1);
        gerenciador.adicionarVeiculo(carro2);
        
        System.out.println("Veículos sem PNE no sistema:"); 
        gerenciador.listarVeiculosN();
        System.out.println("Imposto total: " + gerenciador.calcularImpostoTotalVeiculosN()); 
        
        System.out.println("****************************************************************************************");
        GerenciadorVeiculos gerenciador2 = new GerenciadorVeiculos();
        
        Moto moto1 = new Moto("CG", "150", 2010, 8500);
        Moto moto2 = new Moto("Harley", "Golden Plus", 2024, 150000);
        
        gerenciador2.adicionarVeiculo(moto1);
        gerenciador2.adicionarVeiculo(moto2);
        
        System.out.println("Motos sem PNE no sistema");
        gerenciador2.listarVeiculosN();
        System.out.println("Imposto total: " + gerenciador2.calcularImpostoTotalVeiculosN());
        
        System.out.println("****************************************************************************************");
        
        //adicionando outros tipos de veiculos
        GerenciadorVeiculos gerenciador3 = new GerenciadorVeiculos();
        
        Trator trator = new Trator(" Trator John Deere", "T200", 2022, 150000);
        gerenciador3.adicionarVeiculoRural(trator);
        
        Trator pulverizador = new Trator(" Pulverizador Jacto", "Uniport 3030", 2021, 250000);
        gerenciador3.adicionarVeiculoRural(pulverizador);
        
        System.out.println("Classe Trator");
        System.out.println(trator.finalidadeRural());
        System.out.println("veiculos Rurais no sistema");
        gerenciador3.listarVeiculosR();
        System.out.println("Imposto total: " + gerenciador3.calcularImpostoTotalVeiculosR());
     
        System.out.println("****************************************************************************************");
        
        
        GerenciadorVeiculos gerenciador4 = new GerenciadorVeiculos(); 
        Colheitadeira colheitadeira = new Colheitadeira("Case IH", "Axial-Flow 250", 2021, 350000);
        gerenciador4.adicionarVeiculoRural(colheitadeira);
        
        Colheitadeira colheitadeiraNewHolland = new Colheitadeira("New Holland", "CR10.90", 2023, 450000);
        gerenciador4.adicionarVeiculoRural(colheitadeiraNewHolland);
        
        System.out.println("Classe Colheitadeira");
        System.out.println(colheitadeira.finalidadeRural());
        System.out.println("veiculos Rurais no sistema");
        gerenciador4.listarVeiculosR();
        System.out.println("Imposto total: " + gerenciador4.calcularImpostoTotalVeiculosR());
        
        System.out.println("****************************************************************************************");
        
        GerenciadorVeiculos gerenciador5 = new GerenciadorVeiculos();
        
        Caminhonete caminhonete = new Caminhonete("Ford", "F-150", 2023, 180000);
        gerenciador5.adicionarVeiculoEixo(caminhonete);
        
        Caminhonete caminhoneteChevrolet = new Caminhonete("Chevrolet", "S10", 2022, 120000);
        gerenciador5.adicionarVeiculoEixo(caminhoneteChevrolet);
        
        
        System.out.println("Classe Caminhonete");
        System.out.println(caminhonete.tipoEixo());
        System.out.println("veiculos de Eixo simples no sistema");
        gerenciador5.listarVeiculosE();
        System.out.println("Imposto total: " + gerenciador5.calcularImpostoTotalVeiculosE());
        
        System.out.println("****************************************************************************************");
        
        GerenciadorVeiculos gerenciador6 = new GerenciadorVeiculos();
        
        Carreta carreta = new Carreta("Scania", "R500", 2020, 400000);
        gerenciador6.adicionarVeiculoEixo(carreta);
        
        Carreta carretaVolvo = new Carreta("Volvo", "FH16", 2021, 450000);
        gerenciador6.adicionarVeiculoEixo(carretaVolvo);
        
        System.out.println("Classe Carreta");
        System.out.println(carreta.tipoEixo());
        System.out.println("veiculos de Eixo duplo no sistema");
        gerenciador5.listarVeiculosE();
        System.out.println("Imposto total: " + gerenciador6.calcularImpostoTotalVeiculosE());
        
    }
    
}
