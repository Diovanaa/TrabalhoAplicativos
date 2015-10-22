package DAO.IMPL;

import DAO.CompraDAO;
import DAO.ProdutoDAO;
import DAO.ProdutoDaCompraDAO;
import DAO.UTIL.Conexao;
import MODEL.Compra;
import MODEL.ProdutosDaCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDaCompraDAOIMPL implements ProdutoDaCompraDAO {

    @Override
    public void inserir(ProdutosDaCompra produtosDaCompra) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into produtosdacompra value(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaCompra.getCompra().getCodigo());
            stmt.setInt(2, produtosDaCompra.getProduto().getCodigo());
            stmt.setFloat(3, produtosDaCompra.getQuantidade());
            stmt.setFloat(4, produtosDaCompra.getValorUnitario());
            stmt.setFloat(5, produtosDaCompra.getValorTotal());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!\nMotivo: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(ProdutosDaCompra produtosDaCompra) {
        Connection con = new Conexao().criarConexao();
        String sql = "update produtosdacompra set quantidade = ?,"
                + " valorUnitario = ?, valorTotal = ?"
                + " where produto_codigo = ? and compra_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setFloat(1, produtosDaCompra.getQuantidade());
            stmt.setFloat(2, produtosDaCompra.getValorUnitario());
            stmt.setFloat(3, produtosDaCompra.getValorTotal());
            stmt.setInt(4, produtosDaCompra.getProduto().getCodigo());
            stmt.setInt(5, produtosDaCompra.getCompra().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar!\nMotivo: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(ProdutosDaCompra produtosDaCompra) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from produtosdacompra "
                + "where produto_codigo = ? and codigo_compra = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaCompra.getProduto().getCodigo());
            stmt.setInt(2, produtosDaCompra.getCompra().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar!\nMotivo: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    @Override
    public ProdutosDaCompra buscarPorCodigo(Integer codigo) {
        ProdutosDaCompra produtoDaCompra = null;
        CompraDAO compraDao = new CompraDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdacompra where compra_codigo = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                produtoDaCompra = new ProdutosDaCompra();
                produtoDaCompra.setCompra(compraDao.buscarPorCodigo(rs.getInt("compra_codigo")));
                produtoDaCompra.setProduto(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtoDaCompra.setQuantidade(rs.getFloat("quantidade"));
                produtoDaCompra.setValorUnitario(rs.getFloat("valorUnitario"));
                produtoDaCompra.setValorTotal(rs.getFloat("valorTotal"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar!\nMotivo: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return produtoDaCompra;
    }

    @Override
    public List<ProdutosDaCompra> buscarTodos() {
        List<ProdutosDaCompra> produtosDaCompra = new ArrayList<ProdutosDaCompra>();
        CompraDAO compraDao = new CompraDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdacompra";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutosDaCompra produtoDaCompra = new ProdutosDaCompra();
                produtoDaCompra.setCompra(compraDao.buscarPorCodigo(rs.getInt("compra_codigo")));
                produtoDaCompra.setProduto(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtoDaCompra.setQuantidade(rs.getFloat("quantidade"));
                produtoDaCompra.setValorUnitario(rs.getFloat("valorUnitario"));
                produtoDaCompra.setValorTotal(rs.getFloat("valorTotal"));
                produtosDaCompra.add(produtoDaCompra);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar!\nMotivo: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return produtosDaCompra;
    }

    @Override
    public void removerAllProdutosDaCompra(ProdutosDaCompra produtosDaCompra) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from produtosdacompra where compra_codigo =?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaCompra.getCompra().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar!\nMotivo: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    @Override
    public List<ProdutosDaCompra> buscarPorCompra(Compra compra) {
        List<ProdutosDaCompra> produtosDaCompra = new ArrayList<ProdutosDaCompra>();
        CompraDAO compraDao = new CompraDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdacompra where compra_codigo =?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, compra.getCodigo());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutosDaCompra produtoDaCompra = new ProdutosDaCompra();
                produtoDaCompra.setCompra(compraDao.buscarPorCodigo(rs.getInt("compra_codigo")));
                produtoDaCompra.setProduto(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtoDaCompra.setQuantidade(rs.getFloat("quantidade"));
                produtoDaCompra.setValorUnitario(rs.getFloat("valorUnitario"));
                produtoDaCompra.setValorTotal(rs.getFloat("valorTotal"));
                produtosDaCompra.add(produtoDaCompra);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar!\nMotivo: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return produtosDaCompra;
    }

    @Override
    public List<ProdutosDaCompra> buscarParametrosRelatorio(Integer codigo) {
        CompraDAO compraDao = new CompraDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        List<ProdutosDaCompra> produtosdaCompras = new ArrayList<ProdutosDaCompra>();
        ProdutosDaCompra produtosdaCompra = null;

        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdacompra where compra_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, codigo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                produtosdaCompra = new ProdutosDaCompra();
                produtosdaCompra.setCompra(compraDao.buscarPorCodigo(rs.getInt("compra_codigo")));
                produtosdaCompra.setProduto(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtosdaCompra.setQuantidade(rs.getFloat("quantidade"));
                produtosdaCompra.setValorUnitario(rs.getFloat("valorUnitario"));
                produtosdaCompra.setValorTotal(rs.getFloat("valorTotal"));
                produtosdaCompras.add(produtosdaCompra);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar!\nMotivo: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return produtosdaCompras;


    }
}
