package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utils.AlunoList;

public class AlunoDAO {
	private Connection conn = ConnectorClass.getConnection();

	public void cadastrarAluno (AlunoList aluno)
	{
		String query = "INSERT INTO alunos(codmatricula, nome, endereco, Situacao) VALUES (?, ?, ?, ?)";
		
		 try {
	            PreparedStatement preparador = conn.prepareStatement(query);
	            preparador.setInt(1, aluno.getCodmatricula());
	            preparador.setString(2, aluno.getNome());
	            preparador.setString(3, aluno.getEndereco());
	            preparador.setBoolean(4, aluno.isSituacao());

	            preparador.execute();
	            preparador.close();
	        } catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateAluno(AlunoList aluno) {
        String query = "UPDATE alunos SET nome = ?, endereco = ?, Situacao = ? WHERE codmatricula = ?";

        try {
            PreparedStatement preparador = conn.prepareStatement(query);
            preparador.setInt(1, aluno.getCodmatricula());
            preparador.setString(2, aluno.getNome());
            preparador.setString(3, aluno.getEndereco());
            preparador.setBoolean(4, aluno.isSituacao());

            preparador.execute();
            preparador.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
	
	
	
	public List<AlunoList> buscarAluno(String nome)
	{
        String query = "SELECT * FROM alunos WHERE nome = ?";
        List<AlunoList> alunos = new ArrayList<>();

        try {
            PreparedStatement preparador = conn.prepareStatement(query);
            preparador.setString(2, nome);

            ResultSet result = preparador.executeQuery();

            while (result.next()) {
                int codmatricula = result.getInt("codmatricula");
                String endereco = result.getString("endereco");
                boolean Situacao = result.getBoolean("Situacao");

                AlunoList aluno = new AlunoList(codmatricula, nome, endereco, Situacao);

                alunos.add(aluno);
            }

            preparador.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return alunos;
    }


public List<AlunoList> buscarTodosAlunos() {
    List<AlunoList> alunos = new ArrayList<>();
    String query = "SELECT * FROM alunos";

    try {
        PreparedStatement preparador = conn.prepareStatement(query);
        ResultSet result = preparador.executeQuery();

        while (result.next()) {
            int codmatricula = result.getInt("codmatricula");
            String nome = result.getString("nome");
            String endereco = result.getString("endereco");
            boolean Situacao = result.getBoolean("Situacao");

            AlunoList aluno = new AlunoList(codmatricula, nome, endereco, Situacao);

            alunos.add(aluno);
        }

        preparador.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    return alunos;
}
}