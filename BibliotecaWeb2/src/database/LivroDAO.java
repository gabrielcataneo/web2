package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utils.LivroList;

public class LivroDAO {
	private Connection conn = ConnectorClass.getConnection();

	public void cadastrarLivro (LivroList livro)
	{
		String query = "INSERT INTO livros(codlivro, titulo, editora, valor, codcategoria, codbib, Situacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		 try {
	            PreparedStatement preparador = conn.prepareStatement(query);
	            preparador.setInt(1, livro.getCodlivro());
	            preparador.setString(2, livro.getTitulo());
	            preparador.setString(3, livro.getEditora());
	            preparador.setString(4, livro.getValor());
	            preparador.setInt(5, livro.getCodcategoria());
	            preparador.setInt(6, livro.getCodbib());
	            preparador.setBoolean(7, livro.isSituacao());

	            preparador.execute();
	            preparador.close();
	        } catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateLivro(LivroList livro) {
        String query = "UPDATE livros SET titulo = ?, valor = ?, titulo = ?, editora = ?, Codcategoria = ?, Codbib = ?, Situacao = ? WHERE codmatricula = ?";

        try {
            PreparedStatement preparador = conn.prepareStatement(query);
            preparador.setInt(1, livro.getCodlivro());
            preparador.setString(2, livro.getTitulo());
            preparador.setString(3, livro.getEditora());
            preparador.setString(4, livro.getValor());
            preparador.setInt(5, livro.getCodcategoria());
            preparador.setInt(6, livro.getCodbib());
            preparador.setBoolean(7, livro.isSituacao());

            preparador.execute();
            preparador.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
	
	
	
	public List<LivroList> buscarLivro(String titulo)
	{
        String query = "SELECT * FROM livros WHERE titulo = ?";
        List<LivroList> livros = new ArrayList<>();

        try {
            PreparedStatement preparador = conn.prepareStatement(query);
            preparador.setString(2, titulo);

            ResultSet result = preparador.executeQuery();

            while (result.next()) {
                int codlivro = result.getInt("codlivro");
                String editora = result.getString("editora");
                String valor = result.getString("valor");
                int codcategoria = result.getInt("codcategoria");
                int codbib = result.getInt("codbib");
                boolean Situacao = result.getBoolean("Situacao");

                LivroList livro = new LivroList(codlivro, titulo, editora, valor, codcategoria, codbib, Situacao);

                livros.add(livro);
            }

            preparador.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return livros;
    }


	public List<LivroList> buscarLivroDispon(boolean Situacao)
	{
        String query = "SELECT * FROM livros WHERE Situacao = ?";
        List<LivroList> livros = new ArrayList<>();

        try {
            PreparedStatement preparador = conn.prepareStatement(query);
            preparador.setBoolean(7, Situacao);

            ResultSet result = preparador.executeQuery();

            while (result.next()) {
                int codlivro = result.getInt("codlivro");
                String titulo = result.getString("titulo");
                String editora = result.getString("editora");
                String valor = result.getString("valor");
                int codcategoria = result.getInt("codcategoria");
                int codbib = result.getInt("codbib");

                LivroList livro = new LivroList(codlivro, titulo, editora, valor, codcategoria, codbib, Situacao);

                livros.add(livro);
            }

            preparador.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return livros;
    }
}