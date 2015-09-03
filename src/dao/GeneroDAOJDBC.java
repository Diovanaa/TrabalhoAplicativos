package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Genero;
import conexao.ConexaoUtil2;

public class GeneroDAOJDBC implements GeneroDAO {
private Connection con;
	
	public GeneroDAOJDBC(){
		con = ConexaoUtil2.getCon();
	}
	
	
	//todos os métodos
	
	public void inserir(Genero genero) {
		String sql = "insert into Genero (tipo) values(?)";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, genero.getTipo());

			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	 
	public void alterar(Genero genero) {
		String sql = "update Genero where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, genero.getTipo());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	
	public void excluir(Genero genero) {
		String sql = "delete from Genero where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, genero.getTipo());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}


	public Genero buscar(Integer id) {
		Genero genero = null;
		
		String sql = "select  * from Genero where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				genero = new Genero();
				genero.setCodigo(rs.getInt("codigo"));
				}
			
			pstmt.executeUpdate();
			
			} 
			catch (SQLException e){
			e.printStackTrace();
		}
		return genero;
	
	
	}
	
	public List<Genero> todos() {
         List<Genero> generos= new ArrayList<>();
        
		String sql = "select  * from Genero";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Genero genero = new Genero();
				genero.setCodigo(rs.getInt("codigo"));
				genero.setTipo(rs.getString("tipo"));

				generos.add(genero);
				}
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return generos;

	}
}
