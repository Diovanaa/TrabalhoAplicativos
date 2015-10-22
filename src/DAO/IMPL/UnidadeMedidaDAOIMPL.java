package DAO.IMPL;

import DAO.UTIL.Conexao;
import DAO.UnidadeMedidaDAO;
import MODEL.UnidadeMedida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UnidadeMedidaDAOIMPL implements UnidadeMedidaDAO {

    @Override
    public void inserir(UnidadeMedida unidadeMedida) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into unidademedida value(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, unidadeMedida.getCodigo());
            stmt.setString(2, unidadeMedida.getDescricao());
            stmt.setString(3, unidadeMedida.getSigla());
            stmt.setBoolean(4, unidadeMedida.getFragmentaQtd());
            stmt.setFloat(5, unidadeMedida.getQuantidade());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(UnidadeMedida unidadeMedida) {
        Connection con = new Conexao().criarConexao();
        String sql = "update unidademedida set descricao = ?, sigla = ?,"
                + " fragmentaQtd = ?, quantidade = ? where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, unidadeMedida.getDescricao());
            stmt.setString(2, unidadeMedida.getSigla());
            stmt.setBoolean(3, unidadeMedida.getFragmentaQtd());
            stmt.setFloat(4, unidadeMedida.getQuantidade());
            stmt.setInt(5, unidadeMedida.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(UnidadeMedida unidadeMedida) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from unidademedida where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, unidadeMedida.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public UnidadeMedida buscarPorCodigo(Integer codigo) {
        UnidadeMedida unidadeMedida = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select * from unidademedida where codigo = ? ";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                unidadeMedida = new UnidadeMedida();
                unidadeMedida.setCodigo(rs.getInt("codigo"));
                unidadeMedida.setDescricao(rs.getString("descricao"));
                unidadeMedida.setSigla(rs.getString("sigla"));
                unidadeMedida.setFragmentaQtd(rs.getBoolean("fragmentaQtd"));
                unidadeMedida.setQuantidade(rs.getFloat("quantidade"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return unidadeMedida;
    }

    @Override
    public List<UnidadeMedida> buscaPorDescricao(String descricao) {
        List<UnidadeMedida> unidadesDeMedidas = new ArrayList<UnidadeMedida>();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from unidademedida where descricao like ? ";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + descricao + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                UnidadeMedida unidadeMedida = new UnidadeMedida();
                unidadeMedida.setCodigo(rs.getInt("codigo"));
                unidadeMedida.setDescricao(rs.getString("descricao"));
                unidadeMedida.setSigla(rs.getString("sigla"));
                unidadeMedida.setFragmentaQtd(rs.getBoolean("fragmentaQtd"));
                unidadeMedida.setQuantidade(rs.getFloat("quantidade"));
                unidadesDeMedidas.add(unidadeMedida);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return unidadesDeMedidas;
    }

    @Override
    public List<UnidadeMedida> buscarTodos() {
         List<UnidadeMedida> unidadesDeMedidas = new ArrayList<UnidadeMedida>();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from unidademedida";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                UnidadeMedida unidadeMedida = new UnidadeMedida();
                unidadeMedida.setCodigo(rs.getInt("codigo"));
                unidadeMedida.setDescricao(rs.getString("descricao"));
                unidadeMedida.setSigla(rs.getString("sigla"));
                unidadeMedida.setFragmentaQtd(rs.getBoolean("fragmentaQtd"));
                unidadeMedida.setQuantidade(rs.getFloat("quantidade"));
                unidadesDeMedidas.add(unidadeMedida);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return unidadesDeMedidas;
    }

    @Override
    public Integer buscaIdMaio() {
        Integer idmaior = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select max(codigo) as codigo from unidademedida";
        PreparedStatement stmt; 
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(); 
            rs.next(); 
            idmaior = rs.getInt("codigo"); 

            rs.close(); 
            stmt.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(GrupoItemDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return idmaior;
    }
}
