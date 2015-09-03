package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Funcionario;
import conexao.ConexaoUtil2;

public class FuncionarioDAOJDBC implements FuncionarioDAO{
private Connection con;
	
	public FuncionarioDAOJDBC(){
		con = ConexaoUtil2.getCon();
	}
	
	
	//todos os métodos
	
	public void inserir(Funcionario funcionario) {
		String sql = "insert into Funcionario (nome,cargo) values(?,?)";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, funcionario.getNome());
			pstmt.setString(2, funcionario.getCargo());

			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	 
	public void alterar(Funcionario funcionario) {
		String sql = "update Funcionario where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, funcionario.getNome());
			pstmt.setString(2, funcionario.getCargo());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	
	public void excluir(Funcionario funcionario) {
		String sql = "delete from Funcionario where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, funcionario.getCodigo());
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}


	public Funcionario buscar(Integer id) {
		Funcionario funcionario = null;
		
		String sql = "select  * from Funcionario where codigo = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				funcionario = new Funcionario();
				funcionario.setCodigo(rs.getInt("codigo"));
				}
			
			pstmt.executeUpdate();
			
			} 
			catch (SQLException e){
			e.printStackTrace();
		}
		return funcionario;
	
	
	}
	
	public List<Funcionario> todos() {
         List<Funcionario> funcionarios= new ArrayList<>();
        
		String sql = "select  * from Funcionario";
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Funcionario funcionario = new Funcionario();
				funcionario.setCodigo(rs.getInt("codigo"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setCargo(rs.getString("cargo"));

				funcionarios.add(funcionario);
				}
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return funcionarios;

	}
}
