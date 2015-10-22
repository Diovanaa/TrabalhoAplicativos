/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.IMPL;

import DAO.GrupoItemDAO;
import DAO.SubGrupoItemDAO;
import DAO.UTIL.Conexao;
import MODEL.GrupoItem;
import MODEL.SubGrupoItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardosassanovicz
 */
public class SubGrupoItensDAOIMPL implements SubGrupoItemDAO {

    @Override
    public void inserir(SubGrupoItem subGrupoItem) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into subgrupoitem value(?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, subGrupoItem.getCodigo());
            stmt.setString(2, subGrupoItem.getDescricao());
            stmt.setInt(3, subGrupoItem.getGrupoItem().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(SubGrupoItem subGrupoItem) {
        Connection con = new Conexao().criarConexao();
        String sql = "update subgrupoitem set descricao = ?,"
                + " grupoItem_codigo = ? where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, subGrupoItem.getDescricao());
            stmt.setInt(2, subGrupoItem.getGrupoItem().getCodigo());
            stmt.setInt(3, subGrupoItem.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(SubGrupoItem subGrupoItem) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from subgrupoitem where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, subGrupoItem.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public SubGrupoItem buscarPorCodigo(Integer codigo) {
        SubGrupoItem subGrupoItem = null;
        GrupoItemDAO grupoItemDao = new GrupoItemDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from subgrupoitem where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                subGrupoItem = new SubGrupoItem();
                subGrupoItem.setCodigo(rs.getInt("codigo"));
                subGrupoItem.setDescricao(rs.getString("descricao"));
                subGrupoItem.setGrupoItem(grupoItemDao.buscarPorCodigo(rs.getInt("grupoItem_codigo")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return subGrupoItem;
    }

    @Override
    public List<SubGrupoItem> buscarTodos() {
        List<SubGrupoItem> subGrupoItens = new ArrayList<SubGrupoItem>();
        GrupoItemDAO grupoItemDao = new GrupoItemDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from subgrupoitem";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                SubGrupoItem subGrupoItem = new SubGrupoItem();
                subGrupoItem.setCodigo(rs.getInt("codigo"));
                subGrupoItem.setDescricao(rs.getString("descricao"));
                subGrupoItem.setGrupoItem(grupoItemDao.buscarPorCodigo(rs.getInt("grupoItem_codigo")));
                subGrupoItens.add(subGrupoItem);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return subGrupoItens;
    }

    @Override
    public List<SubGrupoItem> buscarPorDescricao(String descricao) {
        List<SubGrupoItem> subGrupoItens = new ArrayList<SubGrupoItem>();
        GrupoItemDAO grupoItemDao = new GrupoItemDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from subgrupoitem where descricao like ? ";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + descricao + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                SubGrupoItem subGrupoItem = new SubGrupoItem();
                subGrupoItem.setCodigo(rs.getInt("codigo"));
                subGrupoItem.setDescricao(rs.getString("descricao"));
                subGrupoItem.setGrupoItem(grupoItemDao.buscarPorCodigo(rs.getInt("grupoItem_codigo")));
                subGrupoItens.add(subGrupoItem);
            }

        } catch (SQLException ex) {
        }
        return subGrupoItens;
    }

    @Override
    public List<SubGrupoItem> buscarPorGrupoItem(Integer codigo) {
        List<SubGrupoItem> subGrupoItens = new ArrayList<SubGrupoItem>();
        GrupoItemDAO grupoItemDao = new GrupoItemDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from subgrupoitem where grupoItem_codigo = ? ";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,codigo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                SubGrupoItem subGrupoItem = new SubGrupoItem();
                subGrupoItem.setCodigo(rs.getInt("codigo"));
                subGrupoItem.setDescricao(rs.getString("descricao"));
                subGrupoItem.setGrupoItem(grupoItemDao.buscarPorCodigo(rs.getInt("grupoItem_codigo")));
                subGrupoItens.add(subGrupoItem);
            }

        } catch (SQLException ex) {
        }
        return subGrupoItens;
    }

    @Override
    public Integer buscaIdMaio() {
        Integer idmaior = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select max(codigo) as codigo from subgrupoitem";
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
