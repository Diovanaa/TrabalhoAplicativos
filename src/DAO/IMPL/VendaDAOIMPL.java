package DAO.IMPL;

import DAO.ColaboradorDAO;
import DAO.ParceiroDAO;
import DAO.UTIL.Conexao;
import DAO.VendaDAO;
import MODEL.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendaDAOIMPL implements VendaDAO {

    @Override
    public void inserir(Venda venda) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into venda(codigo, dataVenda, valorVenda,"
                + " cliente_codigo, colaborador_codigo)"
                + " values (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, venda.getCodigo());
            stmt.setDate(2, new java.sql.Date(venda.getDataVenda().getTime()));
            stmt.setFloat(3, venda.getValorVenda());
            stmt.setInt(4, venda.getCliente_codigo().getCodigo());
            stmt.setInt(5, venda.getColaborador_codigo().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Venda venda) {
        Connection con = new Conexao().criarConexao();
        String sql = "update venda set dataVenda = ?, valorVenda = ?, cliente_codigo = ?, colaborador_codigo = ?"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setDate(1, new java.sql.Date(venda.getDataVenda().getTime()));
            stmt.setFloat(2, venda.getValorVenda());
            stmt.setInt(3, venda.getCliente_codigo().getCodigo());
            stmt.setInt(4, venda.getColaborador_codigo().getCodigo());
            stmt.setInt(5, venda.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void remover(Venda venda) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from venda"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, venda.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public Venda buscaPorId(Integer codigo) {
        Venda venda = null;
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        ParceiroDAO parceiroDao = new ParceiroDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from venda"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, codigo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                venda = new Venda();
                venda.setCodigo(rs.getInt("codigo"));
                venda.setDataVenda(rs.getDate("dataVenda"));
                venda.setValorVenda(rs.getFloat("valorVenda"));
                venda.setCliente_codigo(parceiroDao.buscaPorId(rs.getInt("cliente_codigo")));
                venda.setColaborador_codigo(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
            }

        } catch (SQLException ex) {
        }
        return venda;
    }

    @Override
    public Integer buscaIdMaio() {
        Integer idmaior = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select max(codigo) as codigo from venda";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            idmaior = rs.getInt("codigo");

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ColaboradorDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return idmaior;
    }

    @Override
    public List<Venda> buscarTodos() {
        List<Venda> vendas = new ArrayList<Venda>();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        ParceiroDAO parceiroDao = new ParceiroDAOIMPL();

        Connection con = new Conexao().criarConexao();
        String sql = "select * from venda";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda();
                venda.setCodigo(rs.getInt("codigo"));
                venda.setDataVenda(rs.getDate("dataVenda"));
                venda.setValorVenda(rs.getFloat("valorVenda"));
                venda.setCliente_codigo(parceiroDao.buscaPorId(rs.getInt("cliente_codigo")));
                venda.setColaborador_codigo(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));

                vendas.add(venda);
            }

        } catch (SQLException ex) {
        }
        return vendas;
    }

    @Override
    public List<Venda> buscarCampoPesquisa(String parametro) {
        List<Venda> vendas = new ArrayList<>();
        ParceiroDAO parceiroDao = new ParceiroDAOIMPL();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from venda ven "
                + "join parceiro par on par.codigo = ven.cliente_codigo "
                + "join pessoa p on p.codigo = par.pessoa_codigo "
                + "join colaborador col on col.codigo = ven.colaborador_codigo "
                + "join pessoa pes on pes.codigo = col.pessoa_codigo "
                + "where (ven.codigo = ? or p.nome like ? or pes.nome like ?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, parametro);
            stmt.setString(2, "%" + parametro + "%");
            stmt.setString(3, "%" + parametro + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Venda venda = new Venda();
                venda.setCodigo(rs.getInt("codigo"));
                venda.setDataVenda(rs.getDate("dataVenda"));
                venda.setValorVenda(rs.getFloat("valorVenda"));
                venda.setCliente_codigo(parceiroDao.buscaPorId(rs.getInt("cliente_codigo")));
                venda.setColaborador_codigo(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
                vendas.add(venda);
            }
        } catch (SQLException ex) {
        }
        return vendas;
    }

    @Override
    public List<Venda> buscarParametrosRelatorio(Integer parceiro, Integer colaborador) {
        Venda venda;
        List<Venda> vendas = new ArrayList<Venda>();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        ParceiroDAO parceiroDao = new ParceiroDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from venda where cliente_codigo = ? or colaborador_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            if (parceiro == null) {
                stmt.setInt(1, 0);
            } else {
                stmt.setInt(1, parceiro);
            }
            if (colaborador == null) {
                stmt.setInt(2, 0);
            } else {
                stmt.setInt(2, colaborador);
            }
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                venda = new Venda();
                venda.setCodigo(rs.getInt("codigo"));
                venda.setDataVenda(rs.getDate("dataVenda"));
                venda.setValorVenda(rs.getFloat("valorVenda"));
                venda.setCliente_codigo(parceiroDao.buscaPorId(rs.getInt("cliente_codigo")));
                venda.setColaborador_codigo(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
                vendas.add(venda);
            }

        } catch (SQLException ex) {
        }
        return vendas;

    }

    @Override
    public List<Venda> buscarPorPeriodo(java.util.Date vendaI, java.util.Date vendaF) {
        List<Venda> vendas = new ArrayList<>();
        ParceiroDAO parceiroDao = new ParceiroDAOIMPL();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "SELECT * FROM 2rsitem.venda"
                + " where dataVenda between ? and ? order by dataVenda;";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(vendaI.getTime()));
            stmt.setDate(2, new java.sql.Date(vendaF.getTime()));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Venda venda = new Venda();
                venda.setCodigo(rs.getInt("codigo"));
                venda.setDataVenda(rs.getDate("dataVenda"));
                venda.setValorVenda(rs.getFloat("valorVenda"));
                venda.setCliente_codigo(parceiroDao.buscaPorId(rs.getInt("cliente_codigo")));
                venda.setColaborador_codigo(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
                vendas.add(venda);
            }
        } catch (SQLException ex) {
        }
        return vendas;

    }
}
