package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Filme;
import model.FilmeLocacao;
import conexao.ConexaoUtil2;

//classe ok
public class FilmeLocacaoDAOJDBC implements FilmeLocacaoDAO {
	private Connection con;

	public FilmeLocacaoDAOJDBC() {
		con = ConexaoUtil2.getCon();
	}

	public void inserir(FilmeLocacao filmeLocacao) {
		String sql = "insert into FilmeLocacao (valor,data, idFilme) values(?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, filmeLocacao.getValor());
			pstmt.setDate(2, Date.valueOf(filmeLocacao.getData()));
			pstmt.setInt(3, filmeLocacao.getFilme().getCodigo());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void alterar(FilmeLocacao filmeLocacao) {
		String sql = "update FilmeLocacao set data =?, valor=?, idFilme=? where codigo = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, Date.valueOf(filmeLocacao.getData()));
			pstmt.setDouble(2, filmeLocacao.getValor());
			pstmt.setInt(3, filmeLocacao.getFilme().getCodigo());
			pstmt.setInt(4, filmeLocacao.getCodigo());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void excluir(FilmeLocacao filmeLocacao) {
		String sql = "delete from FilmeLocacao where codigo = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, filmeLocacao.getCodigo());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public FilmeLocacao buscar(Integer id) {
		FilmeDAO filmeDao = new FilmeDAOJDBC();
		FilmeLocacao filmeLocacao = null;

		String sql = "select  * from FilmeLocacao where codigo = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				filmeLocacao = new FilmeLocacao();
				filmeLocacao.setCodigo(rs.getInt("codigo"));
				filmeLocacao.setData(rs.getDate("data").toLocalDate());
				filmeLocacao.setValor(rs.getDouble("valor"));
				filmeLocacao.setFilme(filmeDao.buscar(rs.getInt("idFilme")));
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filmeLocacao;
	}

	public List<FilmeLocacao> todos() {
		// tive que por esse metodo pois precisava mostrar o id do genero no
		// filme do filmelocacao
		GeneroDAO generoDao = new GeneroDAOJDBC();
		List<FilmeLocacao> filmesLocacao = new ArrayList<>();

		String sql = "select  * from FilmeLocacao fl"
				+ " join Filme f on fl.idFilme = f.codigo"
				+ "join Genero g on f.idGenero = g.codigo";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				FilmeLocacao filmelocacao = new FilmeLocacao();
				filmelocacao.setCodigo(rs.getInt("codigo"));
				Filme filme = new Filme();
				filme.setCodigo(rs.getInt("codigo"));
				filme.setNome(rs.getString("nome"));
				filme.setAno(rs.getDate("ano").toLocalDate());
				filme.setGenero(generoDao.buscar(rs.getInt("idGenero")));
				filmelocacao.setData(rs.getDate("data").toLocalDate());
				filmelocacao.setValor(rs.getDouble("valor"));
				filmesLocacao.add(filmelocacao);
			}
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filmesLocacao;

	}

}
