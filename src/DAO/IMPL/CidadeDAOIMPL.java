
package DAO.IMPL;

import DAO.CidadeDAO;
import DAO.UTIL.Conexao;
import DAO.UnidadeFederativaDAO;
import MODEL.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CidadeDAOIMPL implements CidadeDAO{

    @Override
    public void inserir(Cidade cidade) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into cidade value(?, ?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, cidade.getCodigo());
            stmt.setString(2, cidade.getNome());
            stmt.setInt(3, cidade.getUnidadeFederativa_codigo().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Cidade cidade) {
        Connection con = new Conexao().criarConexao();
        String sql = "update cidade set nome = ?, unidadeFederativa_codigo = ?"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cidade.getNome());            
            stmt.setInt(2, cidade.getUnidadeFederativa_codigo().getCodigo());
            stmt.setInt(3, cidade.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(Cidade cidade) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from cidade"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cidade.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            
        }
    }

    @Override
    public Cidade buscaPorId(Integer codigo) {
        Cidade cidade = null;
        UnidadeFederativaDAO unidadeFederativaDao = new UnidadeFederativaDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from cidade"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                cidade = new Cidade();
                cidade.setCodigo(rs.getInt("codigo"));
                cidade.setNome(rs.getString("nome"));
                cidade.setUnidadeFederativa_codigo(unidadeFederativaDao.buscarPorCodigo(rs.getInt("unidadeFederativa_codigo")));
            }
            
        } catch (SQLException ex){
            
        }
        return cidade;
    }

    @Override
    public List<Cidade> buscarTodos() {
     List<Cidade> cidades = new ArrayList<Cidade>();
        UnidadeFederativaDAO unidadeFederativaDao = new UnidadeFederativaDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from cidade";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Cidade cidade = new Cidade();
                cidade.setCodigo(rs.getInt("codigo"));
                cidade.setNome(rs.getString("nome"));
                cidade.setUnidadeFederativa_codigo(unidadeFederativaDao.buscarPorCodigo
                        (rs.getInt("unidadeFederativa_codigo")));
                cidades.add(cidade);
            }
            
        } catch (SQLException ex){
            
        }
        return cidades;
    }

    @Override
    public List<Cidade> buscaCidades(Integer unidadeFederativa_codigo) {
        List<Cidade> cidades = new ArrayList<Cidade>();
        UnidadeFederativaDAO unidadeFederativaDao = new UnidadeFederativaDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from cidade where unidadeFederativa_codigo = ?";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, unidadeFederativa_codigo);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Cidade cidade = new Cidade();
                cidade.setCodigo(rs.getInt("codigo"));
                cidade.setNome(rs.getString("nome"));
                cidade.setUnidadeFederativa_codigo(unidadeFederativaDao.buscarPorCodigo
                        (rs.getInt("unidadeFederativa_codigo")));
                cidades.add(cidade);
            }
            
        } catch (SQLException ex){
            
        }
        return cidades;
    
    }
    
}
