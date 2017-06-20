package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

	public static Connection getConnection() {
		Connection con = null;
		
		try{
			con = DriverManager.getConnection ("jdbc:postgresql://localhost5432/Projeto Web 2",
											   "postgres", "root");
			System.out.println("Conectado com sucesso");
		} catch (SQLException e) {
			System.out.println ("Falha na conexão");
		}
			return con;
	}

}