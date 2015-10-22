package DAO.IMPL;

import DAO.ColaboradorDAO;
import DAO.GrupoColaboradorDAO;
import DAO.PessoaDAO;
import DAO.UTIL.Conexao;
import MODEL.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ColaboradorDAOIMPL implements ColaboradorDAO {

    @Override
    public void inserir(Colaborador colaborador) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into colaborador value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, colaborador.getCodigo());
            stmt.setString(2, colaborador.getCpf());
            stmt.setString(3, colaborador.getRg());          
            if (colaborador.getDataNascimento() != null) {  
                    stmt.setDate(4, new java.sql.Date(colaborador.getDataNascimento().getTime()));
                } else {  
                 stmt.setNull(4, Types.DATE);  
            }
            stmt.setDate(5, new java.sql.Date(colaborador.getDataContratacao().getTime()));
            if (colaborador.getDataDemissao() != null) {  
                    stmt.setDate(6, new java.sql.Date(colaborador.getDataDemissao().getTime()));
                } else {  
                 stmt.setNull(6, Types.DATE);  
            }
            stmt.setLong(7, colaborador.getGrupoColaborador().getCodigo());
            stmt.setFloat(8, colaborador.getSalario());
            stmt.setInt(9, colaborador.getPessoa().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void alterar(Colaborador colaborador) {
        Connection con = new Conexao().criarConexao();
        String sql = "update colaborador set cpf = ?, rg = ?, dataNascimento = ?, dataContradacao = ?, dataDemissao = ?"
                + "grupoColaboradores_codigo = ?, salario = ?, pessoa_codigo = ?"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);


            stmt.setString(1, colaborador.getCpf());
            stmt.setString(2, colaborador.getRg());
            if (colaborador.getDataNascimento() != null) {  
                    stmt.setDate(3, new java.sql.Date(colaborador.getDataNascimento().getTime()));
                } else {  
                 stmt.setNull(3, Types.DATE);  
            }
            stmt.setDate(4, new java.sql.Date(colaborador.getDataContratacao().getTime()));
            if (colaborador.getDataDemissao() != null) {  
                    stmt.setDate(5, new java.sql.Date(colaborador.getDataDemissao().getTime()));
                } else {  
                 stmt.setNull(5, Types.DATE);  
            }
            stmt.setLong(6, colaborador.getGrupoColaborador().getCodigo());
            stmt.setFloat(7, colaborador.getSalario());
            stmt.setInt(8, colaborador.getPessoa().getCodigo());
            stmt.setInt(9, colaborador.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
        }

    }

    @Override
    public void remover(Colaborador colaborador) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from colaborador"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, colaborador.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public Colaborador buscaPorId(Integer codigo) {
        Colaborador colaborador = null;
        GrupoColaboradorDAO grupoColaboradoresDao = new GrupoColaboradorDAOIMPL();
        PessoaDAO pessoaDao = new PessoaDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from colaborador"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, codigo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                colaborador = new Colaborador();
                colaborador.setCodigo(rs.getInt("codigo"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setRg(rs.getString("rg"));
                colaborador.setDataNascimento(rs.getDate("dataNascimento"));
                colaborador.setDataContratacao(rs.getDate("dataContradacao"));
                colaborador.setDataDemissao(rs.getDate("dataDemissao"));
                colaborador.setGrupoColaborador(grupoColaboradoresDao.buscaPorId(rs.getInt("grupoColaboradores_codigo")));
                colaborador.setSalario(rs.getFloat("salario"));
                colaborador.setPessoa(pessoaDao.buscarPorCodigo(rs.getInt("pessoa_codigo")));
            }

        } catch (SQLException ex) {
        }
        return colaborador;
    }

    @Override
    public List<Colaborador> buscarTodos() {
        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        GrupoColaboradorDAO grupoColaboradoresDao = new GrupoColaboradorDAOIMPL();
        PessoaDAO pessoaDao = new PessoaDAOIMPL();

        Connection con = new Conexao().criarConexao();
        String sql = "select * from colaborador";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Colaborador colaborador = new Colaborador();
                colaborador.setCodigo(rs.getInt("codigo"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setRg(rs.getString("rg"));
                colaborador.setDataNascimento(rs.getDate("dataNascimento"));
                colaborador.setDataContratacao(rs.getDate("dataContradacao"));
                colaborador.setDataDemissao(rs.getDate("dataDemissao"));
                colaborador.setGrupoColaborador(grupoColaboradoresDao.buscaPorId(rs.getInt("grupoColaboradores_codigo")));
                colaborador.setSalario(rs.getFloat("salario"));
                colaborador.setPessoa(pessoaDao.buscarPorCodigo(rs.getInt("pessoa_codigo")));

                colaboradores.add(colaborador);
            }

        } catch (SQLException ex) {
        }
        return colaboradores;
    }

    @Override
    public Integer buscaIdMaio() {
        Integer idmaior = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select max(codigo) as codigo from colaborador";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs1 = stmt.executeQuery();
            rs1.next();
            idmaior = rs1.getInt("codigo");

            rs1.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ColaboradorDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return idmaior;
    }

    @Override
    public List<Colaborador> buscarPorNome(String nome) {
        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        GrupoColaboradorDAO grupoColaboradoresDao = new GrupoColaboradorDAOIMPL();
        PessoaDAO pessoaDao = new PessoaDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from colaborador col join "
                + "pessoa pes on pes.codigo = col.pessoa_codigo"
                + " where pes.nome like ?;";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Colaborador colaborador = new Colaborador();
                colaborador.setCodigo(rs.getInt("codigo"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setRg(rs.getString("rg"));
                colaborador.setDataNascimento(rs.getDate("dataNascimento"));
                colaborador.setDataContratacao(rs.getDate("dataContradacao"));
                colaborador.setDataDemissao(rs.getDate("dataDemissao"));
                colaborador.setGrupoColaborador(grupoColaboradoresDao.buscaPorId(rs.getInt("grupoColaboradores_codigo")));
                colaborador.setSalario(rs.getFloat("salario"));
                colaborador.setPessoa(pessoaDao.buscarPorCodigo(rs.getInt("pessoa_codigo")));
                colaboradores.add(colaborador);

            }

        } catch (SQLException ex) {
        }
        return colaboradores;
    }

    @Override
    public List<Colaborador> buscarParametrosRelatorio(Integer grupoColaborador) {
        Colaborador colaborador = null;
        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        GrupoColaboradorDAO grupoColaboradoresDao = new GrupoColaboradorDAOIMPL();
        PessoaDAO pessoaDao = new PessoaDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from colaborador where grupoColaboradores_codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, grupoColaborador);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                colaborador = new Colaborador();
                colaborador.setCodigo(rs.getInt("codigo"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setRg(rs.getString("rg"));
                colaborador.setDataNascimento(rs.getDate("dataNascimento"));
                colaborador.setDataContratacao(rs.getDate("dataContradacao"));
                colaborador.setDataDemissao(rs.getDate("dataDemissao"));
                colaborador.setGrupoColaborador(grupoColaboradoresDao.buscaPorId(rs.getInt("grupoColaboradores_codigo")));
                colaborador.setSalario(rs.getFloat("salario"));
                colaborador.setPessoa(pessoaDao.buscarPorCodigo(rs.getInt("pessoa_codigo")));
                colaboradores.add(colaborador);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return colaboradores;
    
    }
    
}
