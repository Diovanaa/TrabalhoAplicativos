package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import conexao.ConexaoUtil2;

public class ClienteDAOJDBC implements ClienteDAO {
	private Connection con;

	public ClienteDAOJDBC() {
		con = ConexaoUtil2.getCon();
	}

	public void inserir(Cliente cliente) {
		String sql = "insert into Cliente (nome,cpf,rg,endereco,telefone) values(?,?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, cliente.getNome());
			pstmt.setString(2, cliente.getCpf());
			pstmt.setString(3, cliente.getRg());
			pstmt.setString(4, cliente.getEndereco());
			pstmt.setString(5, cliente.getTelefone());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void alterar(Cliente cliente) {
		String sql = "update Cliente set nome =?,set cpf=?, set rg=?, set endereco=?,"
				+ "set telefone=?,  where codigo = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, cliente.getNome());
			pstmt.setString(2, cliente.getCpf());
			pstmt.setString(3, cliente.getRg());
			pstmt.setString(4, cliente.getEndereco());
			pstmt.setString(5, cliente.getTelefone());
			pstmt.setInt(6, cliente.getCodigo());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void excluir(Cliente cliente) {
		String sql = "delete from Cliente where codigo = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cliente.getCodigo());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Cliente buscar(Integer id) {
		Cliente cliente = null;

		String sql = "select  * from Cliente where codigo = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				cliente = new Cliente();

				cliente.setCodigo(rs.getInt("codigo"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRg(rs.getString("rg"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setTelefone(rs.getString("telefone"));
			}

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;

	}

	public List<Cliente> todos() {
		List<Cliente> clientes = new ArrayList<>();

		String sql = "select  * from Cliente";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getInt("codigo"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cfp"));
				cliente.setRg(rs.getString("rg"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setTelefone(rs.getString("telefone"));

				clientes.add(cliente);
			}
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;

	}

}
