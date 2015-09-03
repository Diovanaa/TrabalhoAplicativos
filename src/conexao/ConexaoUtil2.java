package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil2 {
	private static Connection connection;

	static {
		String endereco = "jdbc:mysql://localhost:3306/locadorajdbc";
		String usuario = "root";
		String senha = "171096";
		try {
			connection = DriverManager.getConnection(endereco, usuario, senha);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar no banco de dados");
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		return connection;
	}
}
