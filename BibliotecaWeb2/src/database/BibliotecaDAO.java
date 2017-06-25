package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utils.BibliotecaList;

public class BibliotecaDAO {
	private Connection conn = ConnectorClass.getConnection();

	public void cadastrarAluno (BibliotecaList biblioteca)
	{
		String query = "INSERT INTO biblioteca(codbib, nome, endereco) VALUES (?, ?, ?)";
		
		 try {
	            PreparedStatement preparador = conn.prepareStatement(query);
	            preparador.setInt(1, biblioteca.getCodbib());
	            preparador.setString(2, biblioteca.getNome());
	            preparador.setString(3, biblioteca.getEndereco());

	            preparador.execute();
	            preparador.close();
	        } catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateBiblioteca(BibliotecaList biblioteca) {
        String query = "UPDATE biblioteca SET nome = ?, endereco = ? WHERE codbib = ?";

        try {
            PreparedStatement preparador = conn.prepareStatement(query);
            preparador.setInt(1, biblioteca.getCodbib());
            preparador.setString(2, biblioteca.getNome());
            preparador.setString(3, biblioteca.getEndereco());

            preparador.execute();
            preparador.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
	
	
	
	public List<BibliotecaList> buscarBiblioteca(String nome)
	{
        String query = "SELECT * FROM biblioteca WHERE nome = ?";
        List<BibliotecaList> biblioteca = new ArrayList<>();

        try {
            PreparedStatement preparador = conn.prepareStatement(query);
            preparador.setString(2, nome);

            ResultSet result = preparador.executeQuery();

            while (result.next()) {
                int codbib = result.getInt("codbib");
                String endereco = result.getString("endereco");

                BibliotecaList bibliotecas = new BibliotecaList(codbib, nome, endereco);

                biblioteca.add(bibliotecas);
            }

            preparador.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return biblioteca;
    }


public List<BibliotecaList> buscarTodasBibliotecas() {
    List<BibliotecaList> biblioteca = new ArrayList<>();
    String query = "SELECT * FROM biblioteca";

    try {
        PreparedStatement preparador = conn.prepareStatement(query);
        ResultSet result = preparador.executeQuery();

        while (result.next()) {
            int codbib = result.getInt("codbib");
            String nome = result.getString("nome");
            String endereco = result.getString("endereco");

            BibliotecaList bibliotecas = new BibliotecaList(codbib, nome, endereco);

            biblioteca.add(bibliotecas);
        }

        preparador.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    return biblioteca;
}
}