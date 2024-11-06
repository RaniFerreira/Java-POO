/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabalho1poo;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main (String[] args){
        
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        pessoa1.setCodigo(1);
        pessoa1.setNome("Richard");
        pessoa1.setDataCadastro("03/08/2023");
        
        pessoa2.setCodigo(2);
        pessoa2.setNome("José");
        pessoa2.setDataCadastro("03/07/2023");
        
        
        System.out.println("Teste classe Pessoa");
        System.out.println("Pessoa 1: ");
        System.out.println("nome: " + pessoa1.getNome());
        System.out.println("Data Cadastro: " + pessoa1.getDataCadastro());
        System.out.println("codigo: " + pessoa1.getCodigo());
        
        System.out.println("\nPessoa 2: ");
        System.out.println("nome: " + pessoa2.getNome());
        System.out.println("Data Cadastro: " + pessoa2.getDataCadastro());
        System.out.println("codigo: " + pessoa2.getCodigo());
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        
        cliente1.setCodigo(3);
        cliente1.setNome("Joao");
        cliente1.setDataCadastro("14/05/2024");
        cliente1.setEmail("joao@gmail.com");
        cliente1.setEndereco("Rua almiro nº 32 Bairro Camir");
        cliente1.setTelefone("3498888-8888");
        
        cliente2.setCodigo(4);
        cliente2.setNome("Carlos");
        cliente2.setDataCadastro("14/07/2024");
        cliente2.setEmail("carlos@gmail.com");
        cliente2.setEndereco("av cerrão nº 1502 Bairro Centro");
        cliente2.setTelefone("3497777-7777");
        
        System.out.println("Teste classe Cliente");
        System.out.println("\nCliente 1:");
        System.out.println("nome: " + cliente1.getNome());
        System.out.println("Data Cadastro: " + cliente1.getDataCadastro());
        System.out.println("codigo: " + cliente1.getCodigo());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("Endereço: " + cliente1.getEndereco());
        
        System.out.println("\nCliente 2:");
        System.out.println("nome: " + cliente2.getNome());
        System.out.println("Data Cadastro: " + cliente2.getDataCadastro());
        System.out.println("codigo: " + cliente2.getCodigo());
        System.out.println("Email: " + cliente2.getEmail());
        System.out.println("Telefone: " + cliente2.getTelefone());
        System.out.println("Endereço: " + cliente2.getEndereco());
        
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        
        usuario1.setCodigo(5);
        usuario1.setNome("Henrique");
        usuario1.setDataCadastro("14/07/2024");
        usuario1.setLogin("Admim");
        usuario1.setSenha("123");
        
        usuario2.setCodigo(6);
        usuario2.setNome("Mauricio");
        usuario2.setDataCadastro("15/05/2024");
        usuario2.setLogin("maur1515");
        usuario2.setSenha("987");
        
        System.out.println("\nTeste classe Usuario");
        System.out.println("\nUsuario 1:");
        System.out.println("nome: " + usuario1.getNome());
        System.out.println("Data Cadastro: " + usuario1.getDataCadastro());
        System.out.println("codigo: " + usuario1.getCodigo());
        System.out.println("Login: " + usuario1.getLogin());
        System.out.println("Senha: " + usuario1.getSenha());
        System.out.println("\nUsuario 2:");
        System.out.println("nome: " + usuario2.getNome());
        System.out.println("Data Cadastro: " + usuario2.getDataCadastro());
        System.out.println("codigo: " + usuario2.getCodigo());
        System.out.println("Login: " + usuario2.getLogin());
        System.out.println("Senha: " + usuario2.getSenha());
        
        
        
    }
    
}
