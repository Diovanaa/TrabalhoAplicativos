
package DAO.IMPL;

import DAO.ProdutoDAO;
import DAO.ProdutoDaVendaDAO;
import DAO.UTIL.Conexao;
import DAO.VendaDAO;
import MODEL.ProdutosDaVenda;
import MODEL.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDaVendaDAOIMPL implements ProdutoDaVendaDAO{

    @Override
    public void inserir(ProdutosDaVenda produtosDaVenda) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into produtosdavenda value(?, ?, ?, ?, ?)";
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
        String sql = "update produtosdavenda set quantidade = ?,"
                + " valorUnitario = ?, valorTotal = ?"
                + " where produto_codigo = ? and venda_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setFloat(1, produtosDaVenda.getQuantidade());
            stmt.setFloat(2, produtosDaVenda.getValorUnitario());
            stmt.setFloat(3, produtosDaVenda.getValorTotal());
            stmt.setInt(4, produtosDaVenda.getProduto_codigo().getCodigo());
            stmt.setInt(5, produtosDaVenda.getVenda_codigo().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(ProdutosDaVenda produtosDaVenda) {
       Connection con = new Conexao().criarConexao();
        String sql = "delete from produtosdavenda "
                + "where produto_codigo = ? and venda_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaVenda.getProduto_codigo().getCodigo());
            stmt.setInt(2, produtosDaVenda.getVenda_codigo().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void removerAllProdutosDaVenda(ProdutosDaVenda produtosDaVenda) {
         Connection con = new Conexao().criarConexao();
        String sql = "delete from produtosdavenda where venda_codigo =?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaVenda.getVenda_codigo().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProdutosDaVenda buscarPorCodigo(Integer codigo) {
        ProdutosDaVenda produtoDaVenda = null;
        VendaDAO vendaDao = new VendaDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdavenda where venda_codigo = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                produtoDaVenda = new ProdutosDaVenda();
                produtoDaVenda.setVenda_codigo(vendaDao.buscaPorId(rs.getInt("venda_codigo")));
                produtoDaVenda.setProduto_codigo(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtoDaVenda.setQuantidade(rs.getFloat("quantidade"));
                produtoDaVenda.setValorUnitario(rs.getFloat("valorUnitario"));
                produtoDaVenda.setValorTotal(rs.getFloat("valorTotal"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtoDaVenda;
    
    }

    @Override
    public List<ProdutosDaVenda> buscarTodos() {
        List<ProdutosDaVenda> produtosDaVendas = new ArrayList<ProdutosDaVenda>();
        VendaDAO vendaDao = new VendaDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdavenda";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutosDaVenda produtoDaVenda = new ProdutosDaVenda();
                produtoDaVenda.setVenda_codigo(vendaDao.buscaPorId(rs.getInt("venda_codigo")));
                produtoDaVenda.setProduto_codigo(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtoDaVenda.setQuantidade(rs.getFloat("quantidade"));
                produtoDaVenda.setValorUnitario(rs.getFloat("valorUnitario"));
                produtoDaVenda.setValorTotal(rs.getFloat("valorTotal"));
                produtosDaVendas.add(produtoDaVenda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtosDaVendas;
    
    }

    @Override
    public List<ProdutosDaVenda> buscarPorCompra(Venda venda) {
        List<ProdutosDaVenda> produtosDaVenda = new ArrayList<ProdutosDaVenda>();
        VendaDAO vendaDao = new VendaDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdavenda where venda_codigo =?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda.getCodigo());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutosDaVenda produtoDaVenda = new ProdutosDaVenda();
                produtoDaVenda.setVenda_codigo(vendaDao.buscaPorId(rs.getInt("venda_codigo")));
                produtoDaVenda.setProduto_codigo(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtoDaVenda.setQuantidade(rs.getFloat("quantidade"));
                produtoDaVenda.setValorUnitario(rs.getFloat("valorUnitario"));
                produtoDaVenda.setValorTotal(rs.getFloat("valorTotal"));
                produtosDaVenda.add(produtoDaVenda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtosDaVenda;
    }

    @Override
    public List<ProdutosDaVenda> buscarParametrosRelatorio(Integer codigo) {
        VendaDAO vendaDao = new VendaDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        List<ProdutosDaVenda> produtosdaVendas = new ArrayList<ProdutosDaVenda>(); 
        ProdutosDaVenda produtosDavenda = null;
        
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdavenda where venda_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, codigo);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                produtosDavenda = new ProdutosDaVenda();
                produtosDavenda.setVenda_codigo(vendaDao.buscaPorId(rs.getInt("venda_codigo")));
                produtosDavenda.setProduto_codigo(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtosDavenda.setQuantidade(rs.getFloat("quantidade"));
                produtosDavenda.setValorUnitario(rs.getFloat("valorUnitario"));
                produtosDavenda.setValorTotal(rs.getFloat("valorTotal"));
                produtosdaVendas.add(produtosDavenda);
            }

        } catch (SQLException ex) {
        }
        return produtosdaVendas;
    
    
        }

    @Override
    public List<ProdutosDaVenda> buscarParametroParaImpressao(Integer codigodavenda) {
        VendaDAO vendaDao = new VendaDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        List<ProdutosDaVenda> produtosdaVendas = new ArrayList<ProdutosDaVenda>(); 
        ProdutosDaVenda produtosDavenda = null;
        
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdavenda where venda_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, codigodavenda);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                produtosDavenda = new ProdutosDaVenda();
                produtosDavenda.setVenda_codigo(vendaDao.buscaPorId(rs.getInt("venda_codigo")));
                produtosDavenda.setProduto_codigo(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtosDavenda.setQuantidade(rs.getFloat("quantidade"));
                produtosDavenda.setValorUnitario(rs.getFloat("valorUnitario"));
                produtosDavenda.setValorTotal(rs.getFloat("valorTotal"));
                produtosdaVendas.add(produtosDavenda);
            }

        } catch (SQLException ex) {
        }
        return produtosdaVendas;
    
    }
    
    
}
