
package DAO.IMPL;

import DAO.UTIL.Conexao;
import DAO.UnidadeFederativaDAO;
import MODEL.UnidadeFederativa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UnidadeFederativaDAOIMPL implements UnidadeFederativaDAO{

    @Override
    public void inserir(UnidadeFederativa unidadeFederativa) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into unidadeFederativa value(?, ?, ?)";
        try {

            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, unidadeFederativa.getCodigo());
            stmt.setString(2, unidadeFederativa.getNome());
            stmt.setString(3, unidadeFederativa.getSigla());
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(UnidadeFederativa unidadeFederativa) {
        Connection con = new Conexao().criarConexao();
        String sql = "update unidadeFederativa set nome = ?, sigla = ? where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, unidadeFederativa.getNome());
            stmt.setString(2, unidadeFederativa.getSigla());
            stmt.setInt(3, unidadeFederativa.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(UnidadeFederativa unidadeFederativa) {
          Connection con = new Conexao().criarConexao();
        String sql = "delete from unidadeFederativa"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, unidadeFederativa.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            
        }
    }

    @Override
    public UnidadeFederativa buscarPorCodigo(Integer codigo) {
        UnidadeFederativa unidadeFederativa = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select * from unidadeFederativa where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, codigo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                unidadeFederativa = new UnidadeFederativa();
                unidadeFederativa.setCodigo(rs.getInt("codigo"));
                unidadeFederativa.setNome(rs.getString("nome"));
                unidadeFederativa.setSigla(rs.getString("sigla"));
            }
        } catch (SQLException ex) {
        }
        return unidadeFederativa;
    }

    @Override
    public List<UnidadeFederativa> buscarTodos() {
        List<UnidadeFederativa> unidadeFederativas = new ArrayList<UnidadeFederativa>();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from unidadeFederativa";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
                unidadeFederativa.setCodigo(rs.getInt("codigo"));
                unidadeFederativa.setNome(rs.getString("nome"));
                unidadeFederativa.setSigla(rs.getString("sigla"));
                

                unidadeFederativas.add(unidadeFederativa);
            }
            
        } catch (SQLException ex){
            
        }
        return unidadeFederativas;
    }
    
}
