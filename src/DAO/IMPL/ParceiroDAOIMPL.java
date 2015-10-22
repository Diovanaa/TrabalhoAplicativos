
package DAO.IMPL;

import DAO.ParceiroDAO;
import DAO.PessoaDAO;
import DAO.UTIL.Conexao;
import MODEL.Parceiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParceiroDAOIMPL implements ParceiroDAO{
    
    @Override
    public void inserir(Parceiro parceiro) {


        Connection con = new Conexao().criarConexao();
        String sql = "insert into parceiro value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, parceiro.getCodigo());
            stmt.setString(2, parceiro.getCpf());
            stmt.setString(3, parceiro.getRg());
            if (parceiro.getDataNascimento() != null) {  
                    stmt.setDate(4, new java.sql.Date(parceiro.getDataNascimento().getTime()));
                } else {  
                 stmt.setNull(4, Types.DATE);  
            }
            stmt.setDate(5, new java.sql.Date(parceiro.getDataCadastro().getTime()));
            stmt.setFloat(6, parceiro.getLimite());
            stmt.setFloat(7, parceiro.getSaldo());
            stmt.setInt(8, parceiro.getPessoa().getCodigo());
            stmt.setString(9, parceiro.getTipoPessoa());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Parceiro parceiro) {
        Connection con = new Conexao().criarConexao();
        String sql = "update parceiro set cpf = ?, rg = ?, dataNascimento = ?, dataCadastro = ?,"
                + "limite = ?, saldo = ?, pessoa_codigo = ?, tipoPessoa = ?"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, parceiro.getCpf());
            stmt.setString(2, parceiro.getRg());
            stmt.setDate(3, new java.sql.Date(parceiro.getDataNascimento().getTime()));
            stmt.setDate(4, new java.sql.Date(parceiro.getDataCadastro().getTime()));
            stmt.setFloat(5, parceiro.getLimite());
            stmt.setFloat(6, parceiro.getSaldo());
            stmt.setInt(7, parceiro.getPessoa().getCodigo());
            stmt.setString(8, parceiro.getTipoPessoa());
            stmt.setInt(9, parceiro.getCodigo());
            
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void remover(Parceiro parceiro) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from parceiro"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, parceiro.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public Parceiro buscaPorId(Integer codigo) {
        Parceiro parceiro = null;
        PessoaDAO pessoaDao = new PessoaDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from parceiro"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, codigo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                parceiro = new Parceiro();
                parceiro.setCodigo(rs.getInt("codigo"));
                parceiro.setCpf(rs.getString("cpf"));
                parceiro.setRg(rs.getString("rg"));
                parceiro.setDataNascimento(rs.getDate("dataNascimento"));
                parceiro.setDataCadastro(rs.getDate("dataCadastro"));
                parceiro.setLimite(rs.getFloat("limite"));
                parceiro.setSaldo(rs.getFloat("saldo"));
                parceiro.setPessoa(pessoaDao.buscarPorCodigo(rs.getInt("pessoa_codigo")));
                parceiro.setTipoPessoa(rs.getString("tipoPessoa"));
            }

        } catch (SQLException ex) {
        }
        return parceiro;
    }

    @Override
    public Integer buscaIdMaio() {
        Integer idmaior = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select max(codigo) as codigo from parceiro";
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
    public List<Parceiro> buscarTodos() {
        List<Parceiro> parceiros = new ArrayList<Parceiro>();
        PessoaDAO pessoaDao = new PessoaDAOIMPL();

        Connection con = new Conexao().criarConexao();
        String sql = "select * from parceiro";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Parceiro parceiro = new Parceiro();
                parceiro.setCodigo(rs.getInt("codigo"));
                parceiro.setCpf(rs.getString("cpf"));
                parceiro.setRg(rs.getString("rg"));
                parceiro.setDataNascimento(rs.getDate("dataNascimento"));
                parceiro.setDataCadastro(rs.getDate("dataCadastro"));
                parceiro.setLimite(rs.getFloat("limite"));
                parceiro.setSaldo(rs.getFloat("saldo"));
                parceiro.setPessoa(pessoaDao.buscarPorCodigo(rs.getInt("pessoa_codigo")));
                parceiro.setTipoPessoa(rs.getString("tipoPessoa"));

                parceiros.add(parceiro);
            }

        } catch (SQLException ex) {
        }
        return parceiros;
    }

    @Override
    public List<Parceiro> buscarPorNome(String nome) {
        List<Parceiro> parceiros = new ArrayList<Parceiro>();
        PessoaDAO pessoaDao = new PessoaDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from parceiro join pessoa using(codigo) where nome like ? ";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
               Parceiro parceiro = new Parceiro();
                parceiro.setCodigo(rs.getInt("codigo"));
                parceiro.setCpf(rs.getString("cpf"));
                parceiro.setRg(rs.getString("rg"));
                parceiro.setDataNascimento(rs.getDate("dataNascimento"));
                parceiro.setDataCadastro(rs.getDate("dataCadastro"));
                parceiro.setLimite(rs.getFloat("limite"));
                parceiro.setSaldo(rs.getFloat("saldo"));
                parceiro.setPessoa(pessoaDao.buscarPorCodigo(rs.getInt("pessoa_codigo")));
                parceiro.setTipoPessoa(rs.getString("tipoPessoa"));
                parceiros.add(parceiro);
            }

        } catch (SQLException ex) {
        }
        return parceiros;
    }

    
}
