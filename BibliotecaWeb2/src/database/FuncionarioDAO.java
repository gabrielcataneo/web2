package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utils.FuncionarioList;

public class FuncionarioDAO {
	private Connection conn = ConnectorClass.getConnection();

	public void cadastrarFuncionario (FuncionarioList funcionario)
	{
		String query = "INSERT INTO funcionario(codfunc, nome, endereco, telefone, salario, codbib) VALUES (?, ?, ?, ?, ?, ?)";
		
		 try {
	            PreparedStatement preparador = conn.prepareStatement(query);
	            preparador.setInt(1, funcionario.getCodfunc());
	            preparador.setString(2, funcionario.getNome());
	            preparador.setString(3, funcionario.getEndereco());
	            preparador.setString(4, funcionario.getTelefone());
	            preparador.setString(5, funcionario.getSalario());
	            preparador.setInt(6, funcionario.getCodbib());

	            preparador.execute();
	            preparador.close();
	        } catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateFuncionario(FuncionarioList funcionario) {
        String query = "UPDATE funcionario SET nome = ?, endereco = ?, telefone = ?, salario = ?, codbib = ? WHERE codfunc = ?";

        try {
            PreparedStatement preparador = conn.prepareStatement(query);
            preparador.setInt(1, funcionario.getCodfunc());
            preparador.setString(2, funcionario.getNome());
            preparador.setString(3, funcionario.getEndereco());
            preparador.setString(4, funcionario.getTelefone());
            preparador.setString(5, funcionario.getSalario());
            preparador.setInt(6, funcionario.getCodbib());

            preparador.execute();
            preparador.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
	
	
	
	public List<FuncionarioList> buscarFuncionario(String nome)
	{
        String query = "SELECT * FROM funcionario WHERE nome = ?";
        List<FuncionarioList> funcionarios = new ArrayList<>();

        try {
            PreparedStatement preparador = conn.prepareStatement(query);
            preparador.setString(2, nome);

            ResultSet result = preparador.executeQuery();

            while (result.next()) {
                int codfunc = result.getInt("codfunc");
                String endereco = result.getString("endereco");
                String telefone = result.getString("telefone");
                String salario = result.getString("salario");
                int codbib = result.getInt("codbib");
                
                FuncionarioList funcionario = new FuncionarioList(codfunc, nome, endereco,telefone,salario, codbib);

                funcionarios.add(funcionario);
            }

            preparador.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return funcionarios;
    }


public List<FuncionarioList> buscarTodosFuncionario() {
    List<FuncionarioList> funcionarios = new ArrayList<>();
    String query = "SELECT * FROM funcionario";

    try {
        PreparedStatement preparador = conn.prepareStatement(query);
        ResultSet result = preparador.executeQuery();

        while (result.next()) {
        	int codfunc = result.getInt("codfunc");
        	String nome = result.getString("nome");
            String endereco = result.getString("endereco");
            String telefone = result.getString("telefone");
            String salario = result.getString("salario");
            int codbib = result.getInt("codbib");
            
            FuncionarioList funcionario = new FuncionarioList(codfunc, nome, endereco,telefone,salario, codbib);

            funcionarios.add(funcionario);
        }

        preparador.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    return funcionarios;
}
public void DeleteFuncionario(FuncionarioList funcionario) {
    String query = "DELETE FROM funcionario (codfunc, nome, endereco, telefone, salario, codbib) VALUES (?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement preparador = conn.prepareStatement(query);
        preparador.setInt(1, funcionario.getCodfunc());
        preparador.setString(2, funcionario.getNome());
        preparador.setString(3, funcionario.getEndereco());
        preparador.setString(4, funcionario.getTelefone());
        preparador.setString(5, funcionario.getSalario());
        preparador.setInt(6, funcionario.getCodbib());
        preparador.execute();
        preparador.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}