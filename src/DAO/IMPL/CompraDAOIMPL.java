package DAO.IMPL;

import DAO.ColaboradorDAO;
import DAO.CompraDAO;
import DAO.FornecedorDAO;
import DAO.UTIL.Conexao;
import MODEL.Compra;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompraDAOIMPL implements CompraDAO {

    @Override
    public void inserir(Compra compra) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into compra(codigo, dataCompra, valorCompra,"
                + " fornecedor_codigo, colaborador_codigo)"
                + " values (?, ?, ?, ?, ?);";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, compra.getCodigo());
            if (compra.getDataCompra() != null) {
                stmt.setDate(2, new java.sql.Date(compra.getDataCompra().getTime()));
            } else {
                stmt.setNull(2, Types.DATE);
            }
            stmt.setFloat(3, compra.getValorCompra());
            stmt.setInt(4, compra.getFornecedor().getCodigo());
            stmt.setInt(5, compra.getColaborador().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public void alterar(Compra compra) {
        Connection con = new Conexao().criarConexao();
        // String sql = "update compra set dataCompra = ?, valorCompra = ?, "
        //         + "fornecedor_codigo = ?, colaborador_codigo = ?"
        //         + " where codigo = ?";

        String sql = "update compra set dataCompra = ?, valorCompra = ?,"
                + " fornecedor_codigo = ?, colaborador_codigo = ? where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            if (compra.getDataCompra() != null) {
                stmt.setDate(1, new java.sql.Date(compra.getDataCompra().getTime()));
            } else {
                stmt.setNull(1, Types.DATE);
            }
            stmt.setFloat(2, compra.getValorCompra());
            stmt.setInt(3, compra.getFornecedor().getCodigo());
            stmt.setInt(4, compra.getColaborador().getCodigo());
            stmt.setInt(5, compra.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public void remover(Compra compra) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from compra"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, compra.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public Compra buscarPorCodigo(Integer codigo) {
        Compra compra = null;
        FornecedorDAO fornecedorDao = new FornecedorDAOIMPL();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select codigo, dataCompra, valorCompra, fornecedor_codigo,"
                + " colaborador_codigo from compra"
                + " where codigo =?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                compra = new Compra();
                compra.setCodigo(rs.getInt("codigo"));
                compra.setDataCompra(rs.getDate("dataCompra"));
                compra.setValorCompra(rs.getFloat("valorCompra"));
                compra.setFornecedor(fornecedorDao.buscaPorId(rs.getInt("fornecedor_codigo")));
                compra.setColaborador(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
            }
        } catch (SQLException ex) {
        }
        return compra;
    }

    @Override
    public List<Compra> buscarTodos() {
        List<Compra> compras = new ArrayList<>();
        FornecedorDAO fornecedorDao = new FornecedorDAOIMPL();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from Compra";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setCodigo(rs.getInt("codigo"));
                compra.setDataCompra(rs.getDate("dataCompra"));
                compra.setValorCompra(rs.getFloat("valorCompra"));
                compra.setFornecedor(fornecedorDao.buscaPorId(rs.getInt("fornecedor_codigo")));
                compra.setColaborador(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
                compras.add(compra);
            }
        } catch (SQLException ex) {
        }
        return compras;
    }

    @Override
    public List<Compra> buscarCampoPesquisa(String parametro) {
        List<Compra> compras = new ArrayList<>();
        FornecedorDAO fornecedorDao = new FornecedorDAOIMPL();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "SELECT * FROM compra com"
                + " join fornecedor forn on forn.codigo = com.fornecedor_codigo "
                + "join pessoa p on p.codigo = forn.pessoa_codigo "
                + "join colaborador col on col.codigo = com.colaborador_codigo "
                + "join pessoa pes on pes.codigo = col.pessoa_codigo "
                + "where (com.codigo = ? or p.nome like ? or pes.nome like ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, parametro);
            stmt.setString(2, "%" + parametro + "%");
            stmt.setString(3, "%" + parametro + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setCodigo(rs.getInt("codigo"));
                compra.setDataCompra(rs.getDate("dataCompra"));
                compra.setValorCompra(rs.getFloat("valorCompra"));
                compra.setFornecedor(fornecedorDao.buscaPorId(rs.getInt("fornecedor_codigo")));
                compra.setColaborador(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
                compras.add(compra);
            }
        } catch (SQLException ex) {
        }
        return compras;
    }

    @Override
    public List<Compra> buscarParametrosRelatorio(Integer fornecedor, Integer colaborador) {
        Compra compra = null;
        List<Compra> compras = new ArrayList<Compra>();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        FornecedorDAO fornecedorDao = new FornecedorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from compra where fornecedor_codigo = ? or colaborador_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            if (fornecedor == null) {
                stmt.setInt(1, 0);
            } else {
                stmt.setInt(1, fornecedor);
            }
            if (colaborador == null) {
                stmt.setInt(2, 0);
            } else {
                stmt.setInt(2, colaborador);
            }
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                compra = new Compra();
                compra.setCodigo(rs.getInt("codigo"));
                compra.setDataCompra(rs.getDate("dataCompra"));
                compra.setValorCompra(rs.getFloat("valorCompra"));
                compra.setFornecedor(fornecedorDao.buscaPorId(rs.getInt("fornecedor_codigo")));
                compra.setColaborador(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
                compras.add(compra);
            }

        } catch (SQLException ex) {
        }
        return compras;

    }

    @Override
    public List<Compra> buscarPorPeriodo(java.util.Date compraI, java.util.Date compraF) {
        List<Compra> compras = new ArrayList<>();
        FornecedorDAO fornecedorDao = new FornecedorDAOIMPL();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "SELECT * FROM 2rsitem.compra"
                + " where dataCompra between ? and ? order by dataCompra";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(compraI.getTime()));
            stmt.setDate(2, new java.sql.Date(compraF.getTime()));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setCodigo(rs.getInt("codigo"));
                compra.setDataCompra(rs.getDate("dataCompra"));
                compra.setValorCompra(rs.getFloat("valorCompra"));
                compra.setFornecedor(fornecedorDao.buscaPorId(rs.getInt("fornecedor_codigo")));
                compra.setColaborador(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
                compras.add(compra);
            }
        } catch (SQLException ex) {
        }
        return compras;
    }

   
}
