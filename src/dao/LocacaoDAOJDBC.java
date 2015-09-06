package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.FilmeLocacao;
import model.Funcionario;
import model.Locacao;
import conexao.ConexaoUtil2;

//classe ok
public class LocacaoDAOJDBC implements LocacaoDAO {
	private Connection con;

	public LocacaoDAOJDBC() {
		con = ConexaoUtil2.getCon();
	}

	// todos os métodos

	public void inserir(Locacao locacao) {
		String sql = "insert into Locacao (qtd,valorTotal,idCliente,idFilmeLocacao,idFuncionario) values(?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, locacao.getQtd());
			pstmt.setDouble(2, locacao.getValorTotal());
			pstmt.setInt(3, locacao.getCliente().getCodigo());
			pstmt.setInt(4, locacao.getFilmeLocacao().getCodigo());
			pstmt.setInt(5, locacao.getFuncionario().getCodigo());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void alterar(Locacao locacao) {
		String sql = "update Locacao set qtd=?,valorTotal=?,idCiente?, idFilmeLocacao=?,idFuncionario=?"
				+ " where codigo = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, locacao.getQtd());
			pstmt.setDouble(2, locacao.getValorTotal());
			pstmt.setInt(3, locacao.getCliente().getCodigo());
			pstmt.setInt(4, locacao.getFilmeLocacao().getCodigo());
			pstmt.setInt(5, locacao.getFuncionario().getCodigo());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void excluir(Locacao locacao) {
		String sql = "delete from Locacao where codigo = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, locacao.getCodigo());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Locacao buscar(Integer id) {
		ClienteDAO clienteDao = new ClienteDAOJDBC();
		FuncionarioDAO funcionarioDao = new FuncionarioDAOJDBC();
		FilmeLocacaoDAO filmelocacaoDao = new FilmeLocacaoDAOJDBC();

		Locacao locacao = null;

		String sql = "select  * from Locacao where codigo = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				locacao = new Locacao();
				locacao.setCodigo(rs.getInt("codigo"));
				locacao.setQtd(rs.getDouble("qtd"));
				locacao.setValorTotal(rs.getDouble("valorTotal"));
				locacao.setCliente(clienteDao.buscar(rs.getInt("idCliente")));
				locacao.setFilmeLocacao(filmelocacaoDao.buscar(rs
						.getInt("filmeLocacao")));
				locacao.setFuncionario(funcionarioDao.buscar(rs
						.getInt("Funcionario")));
			}

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return locacao;

	}

	public List<Locacao> todos() {
		
		FilmeDAO filmeDao = new FilmeDAOJDBC();
		List<Locacao> locacoes = new ArrayList<>();

		String sql = "select  * from Locacao l"
				+ "join Cliente c on l.idCliente = c.codigo"
				+ "join Funcionario f on l.idFuncionario = f.codigo"
				+ "join FilmeLocacao fl on l.idFuncionario = fl.codigo";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Locacao locacao = new Locacao();
				locacao.setCodigo(rs.getInt("codigo"));
				locacao.setQtd(rs.getDouble("qtd"));
				locacao.setValorTotal(rs.getDouble("valorTotal"));
				FilmeLocacao filmeLocacao = new FilmeLocacao();
				filmeLocacao.setCodigo(rs.getInt("codigo"));
				filmeLocacao.setData(rs.getDate("data").toLocalDate());
				filmeLocacao.setValor(rs.getDouble("valor"));
				filmeLocacao.setFilme(filmeDao.buscar(rs.getInt("idFilme")));
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getInt("codigo"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRg(rs.getString("rg"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setTelefone(rs.getString("telefone"));
				Funcionario funcionario = new Funcionario();
				funcionario.setCodigo(rs.getInt("codigo"));
				funcionario.setNome(rs.getString("nome"));
				locacoes.add(locacao);
			}
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return locacoes;

	}

}
