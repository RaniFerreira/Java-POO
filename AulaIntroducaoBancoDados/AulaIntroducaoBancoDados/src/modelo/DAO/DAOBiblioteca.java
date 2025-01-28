/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.dominio.*;
import java.util.ArrayList;

/**
 *
 * @author ranie
 */
public class DAOBiblioteca {
    
    private Connection con;
    private PreparedStatement comando;
    private final FabricaConexao fConexao = FabricaConexao.getInstancia();

    // Método de conexão com o banco de dados
    private void conectar() {
        con = fConexao.conexao();
    }

    // Método para fechar a conexão com o banco de dados
    private void fechar() {
        try {
            comando.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Erro ao fechar conexão\n" + e.getMessage());
        }
    }

    // Método para inserir um livro na tabela BIBLIOTECA
    public boolean insereBiblioteca(Biblioteca biblioteca) {
        conectar();
        String sql = "INSERT INTO biblioteca (nomeCoOrdenador,quantidadeAcervo, horarioFuncionamento) VALUES (?, ?, ?)";
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, biblioteca.getNomeCoOrdenador());
            comando.setInt(2, biblioteca.getQuantidadeAcervo());
            comando.setString(3, biblioteca.getHorarioFuncionamento());

            comando.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir Biblioteca\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

    // Método para selecionar todos os livros da tabela BIBLIOTECA
    public ArrayList<Biblioteca> selecionarTodosRegistros() {
        conectar();
        ResultSet rs;
        String sql = "SELECT * FROM biblioteca";
        ArrayList<Biblioteca> listaBibliotecas = new ArrayList<>();
        try {
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while (rs.next()) {
                Biblioteca biblioteca = new Biblioteca();
                biblioteca.setNomeCoOrdenador(rs.getString("nomeCoOrdenador"));
                biblioteca.setQuantidadeAcervo(rs.getInt("quantidadeAcervo"));
                biblioteca.setHorarioFuncionamento(rs.getString("horarioFuncionamento"));
                listaBibliotecas.add(biblioteca);
            }
            return listaBibliotecas;
        } catch (SQLException e) {
            System.err.println("Erro ao visualizar Bibliotecas\n" + e.getMessage());
            return null;
        } finally {
            fechar();
        }
    }
    
}
