package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.FilmeLocacao;
import conexao.ConexaoUtil2;

public class FilmeLocacaoDAOJDBC implements FilmeLocacaoDAO {
private Connection con;
	
	public FilmeLocacaoDAOJDBC(){
		con = ConexaoUtil2.getCon();
	}
	
	
	//todos os métodos
	
	public void inserir(FilmeLocacao filmeLocacao) {
		String sql = "insert into FilmeLocacao (valor,data) values(?,?)";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, filmeLocacao.getValor());
			pstmt.setDate(2,Date.valueOf(filmeLocacao.getData()));
			
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	 
	public void alterar(FilmeLocacao filmeLocacao) {
		String sql = "update FilmeLocacao set data =?, where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDate(2,Date.valueOf(filmeLocacao.getData()));
			pstmt.setInt(2, filmeLocacao.getCodigo());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	
	public void excluir(FilmeLocacao filmeLocacao) {
		String sql = "delete from FilmeLocacao where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, filmeLocacao.getCodigo());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}


	public FilmeLocacao buscar (Integer id) {
		FilmeLocacao filmeLocacao = null;
		
		String sql = "select  * from FilmeLocacao where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				filmeLocacao = new FilmeLocacao();
				filmeLocacao.setCodigo(rs.getInt("codigo"));
				pstmt.setDate(2,Date.valueOf(filmeLocacao.getData()));
				}
			
			pstmt.executeUpdate();
			
			} 
			catch (SQLException e){
			e.printStackTrace();
		}
		return filmeLocacao;
	
	
	}
	
	public List<FilmeLocacao> todos() {
         List<FilmeLocacao> filmesLocacao= new ArrayList<>();
        
		String sql = "select  * from FilmeLocacao";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				FilmeLocacao filmeLocacao = new FilmeLocacao();
				filmeLocacao.setCodigo(rs.getInt("codigo"));
				pstmt.setDate(2,Date.valueOf(filmeLocacao.getData()));
				filmesLocacao.add(filmeLocacao);
				}
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return filmesLocacao;

	}
}
