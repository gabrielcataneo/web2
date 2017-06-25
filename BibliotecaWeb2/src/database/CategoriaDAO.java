package database;

import java.sql.Connection;
import utils.CategoriaList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO
{

	private Connection conn = ConnectorClass.getConnection();
	
	 public void addCategoria(CategoriaList categoria) {
	        String query = "INSERT INTO categoria (codcategoria, descricao) VALUES (?, ?)";

	        try {
	            PreparedStatement preparador = conn.prepareStatement(query);
	            preparador.setInt(1, categoria.getCodcategoria());
	            preparador.setString(2, categoria.getDescricao());
	            preparador.execute();
	            preparador.close();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	 public List<CategoriaList> buscaCategoria(String descricao) {
	        List<CategoriaList> categorias = new ArrayList<>();
	        String query = "SELECT * FROM categoria WHERE descricao = ?";

	        try {
	            PreparedStatement preparador = conn.prepareStatement(query);
	            preparador.setString(2, descricao);
	            ResultSet resultado = preparador.executeQuery();

	            while (resultado.next()) {
	                int codcategoria = resultado.getInt("codcategoria");

	                CategoriaList categoria = new CategoriaList(codcategoria, descricao);
	                categorias.add(categoria);
	            }

	            preparador.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return categorias;
	    }

	 public void deleteCategoria(CategoriaList agencia) {
	        
	    }

}