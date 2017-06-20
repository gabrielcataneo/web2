package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modeloUsuario.Usuario;

public class UsuarioDAO {
	public UsuarioDAO()
	{
		
	}

	public boolean inserir(Usuario usuario)
	{
		String sql = "INSERT INTO alunos(codmatricula, nome, endereco, Situacao) VALUES (?, ?, ?, ?)";
		Boolean retorno = false;
		PreparedStatement pst = Conexao.getPreparedStatement(sql);
		try {
			pst.setInt(1, usuario.getCodmatricula());
			pst.setString(2, usuario.getEndereco());
			pst.setString(3, usuario.getNome());
			pst.setString(4, usuario.getSituacao());
			
			if(pst.executeUpdate()==0)
			{
				retorno = true;
			}
		
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			retorno = false;
		}
	return retorno;
	}

	public List<Usuario> listar()
	{
		String sql = "SELECT * FROM alunos";
		List<Usuario> retorno = new ArrayList<Usuario>();
		
		PreparedStatement pst = Conexao.getPreparedStatement(sql);
		try {
			ResultSet res  = pst.executeQuery();
			while(res.next())
			{
				Usuario item = new Usuario();
				item.setCodmatricula(res.getInt("codmatricula"));
				item.setEndereco(res.getString("endereco"));
				item.setNome(res.getString("nome"));
				item.setSituacao(res.getString("Situacao"));
				
				retorno.add(item);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return retorno;
		
	}


}



