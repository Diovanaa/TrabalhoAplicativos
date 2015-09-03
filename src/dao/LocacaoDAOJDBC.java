package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Locacao;
import conexao.ConexaoUtil2;

public class LocacaoDAOJDBC implements LocacaoDAO{
private Connection con;
	
	public LocacaoDAOJDBC(){
		con = ConexaoUtil2.getCon();
	}
	
	
	//todos os métodos
	
	public void inserir(Locacao locacao) {
		String sql = "insert into Locacao (qtd,valorTotal) values(?,?)";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, locacao.getQtd());
			pstmt.setDouble(2, locacao.getValorTotal());

			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	 
	public void alterar(Locacao locacao) {
		String sql = "update Locacao where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, locacao.getQtd());
			pstmt.setDouble(2, locacao.getValorTotal());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	
	public void excluir(Locacao locacao) {
		String sql = "delete from Locacao where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, locacao.getCodigo());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}


	public Locacao buscar(Integer id) {
		Locacao locacao = null;
		
		String sql = "select  * from Locacao where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				locacao = new Locacao();
				locacao.setCodigo(rs.getInt("codigo"));
				}
			
			pstmt.executeUpdate();
			
			} 
			catch (SQLException e){
			e.printStackTrace();
		}
		return locacao;
	
	
	}
	
	public List<Locacao> todos() {
         List<Locacao> locacoes= new ArrayList<>();
        
		String sql = "select  * from Locacao";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Locacao locacao = new Locacao();
				locacao.setCodigo(rs.getInt("codigo"));
				locacao.setQtd(rs.getDouble("qtd"));
				locacao.setValorTotal(rs.getDouble("valorTotal"));

				locacoes.add(locacao);
				}
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return locacoes;

	}
	
}
