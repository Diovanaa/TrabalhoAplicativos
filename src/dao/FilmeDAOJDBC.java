package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import model.Filme;
import conexao.ConexaoUtil2;

public class FilmeDAOJDBC implements FilmeDAO {
private Connection con;
	
	public FilmeDAOJDBC(){
		con = ConexaoUtil2.getCon();
	}
	
	
	//todos os métodos
	
	public void inserir(Filme filme) {
		String sql = "insert into Filme (nome) values(?)";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, filme.getNome());
			
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	 
	public void alterar(Filme filme) {
		String sql = "update Filme set nome =?, where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, filme.getNome());
			pstmt.setInt(2, filme.getCodigo());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	
	public void excluir(Filme filme) {
		String sql = "delete from Filme where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, filme.getCodigo());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}


	public Filme buscar(Integer id) {
		Filme filme = null;
		
		String sql = "select  * from Filme where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				filme = new Filme();
				filme.setCodigo(rs.getInt("codigo"));
				filme.setNome(rs.getString("nome"));
				}
			
			pstmt.executeUpdate();
			
			} 
			catch (SQLException e){
			e.printStackTrace();
		}
		return filme;
	
	
	}
	
	public List<Filme> todos() {
         List<Filme> filmes= new ArrayList<>();
        
		String sql = "select  * from Filme";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Filme filme = new Filme();
				filme.setCodigo(rs.getInt("codigo"));
				filme.setNome(rs.getString("nome"));
				filmes.add(filme);
				}
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return filmes;

	}
	
	
}
