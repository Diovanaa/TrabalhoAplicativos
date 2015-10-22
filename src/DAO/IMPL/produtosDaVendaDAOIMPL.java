
package DAO.IMPL;

import DAO.ProdutoDAO;
import DAO.UTIL.Conexao;
import DAO.VendaDAO;
import DAO.produtosDaVendaDAO;
import MODEL.ProdutosDaVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class produtosDaVendaDAOIMPL implements produtosDaVendaDAO{

    @Override
    public void inserir(ProdutosDaVenda produtosDaVenda) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into produtosDaVenda value(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaVenda.getVenda_codigo().getCodigo());           
            stmt.setInt(2, produtosDaVenda.getProduto_codigo().getCodigo());
            stmt.setFloat(3, produtosDaVenda.getQuantidade());
            stmt.setFloat(4, produtosDaVenda.getValorUnitario());
            stmt.setFloat(5, produtosDaVenda.getValorTotal());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(ProdutosDaVenda produtosDaVenda) {
        Connection con = new Conexao().criarConexao();
        String sql = "update produtosDaVenda set produto_codigo = ?, quantidade = ?, valorUnitario = ?, valorTotal = ?"
                + " where venda_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaVenda.getProduto_codigo().getCodigo());
            stmt.setFloat(2, produtosDaVenda.getQuantidade());
            stmt.setFloat(3, produtosDaVenda.getValorUnitario());
            stmt.setFloat(4, produtosDaVenda.getValorTotal());
            stmt.setInt(5, produtosDaVenda.getVenda_codigo().getCodigo()); 

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(ProdutosDaVenda produtosDaVenda) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from produtosDaVenda"
                + " where venda_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaVenda.getVenda_codigo().getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public ProdutosDaVenda buscaPorId(Integer venda_codigo) {
        ProdutosDaVenda produtosDaVenda = null;
        VendaDAO vendaDao = new VendaDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosDaVenda"
                + " where venda_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, venda_codigo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                produtosDaVenda = new ProdutosDaVenda();
                produtosDaVenda.setVenda_codigo(vendaDao.buscaPorId(rs.getInt("venda_codigo")));
                produtosDaVenda.setProduto_codigo(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtosDaVenda.setQuantidade(rs.getFloat("quantidade"));
                produtosDaVenda.setValorUnitario(rs.getFloat("valorUnitario"));
                produtosDaVenda.setValorTotal(rs.getFloat("valorTotal"));
            }

        } catch (SQLException ex) {
        }
        return produtosDaVenda;
    }

    @Override
    public Integer buscaIdMaio() {
        Integer idmaior = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select max(venda_codigo) as venda_codigo from produtosDaVenda";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            idmaior = rs.getInt("venda_codigo");

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ColaboradorDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return idmaior;
    }

    @Override
    public List<ProdutosDaVenda> buscarTodos() {
        List<ProdutosDaVenda> produtosDasVendas = new ArrayList<ProdutosDaVenda>();
        VendaDAO vendaDao = new VendaDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();

        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosDaVenda";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ProdutosDaVenda produtosDaVenda = new ProdutosDaVenda();
                produtosDaVenda.setVenda_codigo(vendaDao.buscaPorId(rs.getInt("venda_codigo")));
                produtosDaVenda.setProduto_codigo(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtosDaVenda.setQuantidade(rs.getFloat("quantidade"));
                produtosDaVenda.setValorUnitario(rs.getFloat("valorUnitario"));
                produtosDaVenda.setValorTotal(rs.getFloat("valorTotal"));

                produtosDasVendas.add(produtosDaVenda);
            }

        } catch (SQLException ex) {
        }
        return produtosDasVendas;
    }
    
}
