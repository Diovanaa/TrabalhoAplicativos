
package DAO.IMPL;

import DAO.EmpresaDAO;
import DAO.EnderecoDAO;
import DAO.UTIL.Conexao;
import MODEL.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpresaDAOIMPL implements EmpresaDAO{

    @Override
    public void inserir(Empresa empresa) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into empresa value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, empresa.getCodigo());
            stmt.setString(2, empresa.getRazaoSocial());
            stmt.setString(3, empresa.getNomeFantasia());
            stmt.setString(4, empresa.getCnpj());
            stmt.setString(5, empresa.getInscricaoEstadual());
            stmt.setString(6, empresa.getNomeProprietario());
            stmt.setString(7, empresa.getEmail());
            if (empresa.getDataFundacao() != null) {  
                    stmt.setDate(8, new java.sql.Date(empresa.getDataFundacao().getTime()));
                } else {  
                 stmt.setNull(8, Types.DATE);  
            }
            stmt.setInt(9, empresa.getEndereco_codigo().getCodigo());
           
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Empresa empresa) {
        Connection con = new Conexao().criarConexao();
        String sql = "update empresa set razaoSocial = ?, nomeFantasia = ?, cnpj = ?, inscricaoEstadual = ?,"
                + " nomeProprietario = ?"
                + ", email = ?, dataFundacao = ?, endereco_codigo = ?  where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);      
            stmt.setString(1, empresa.getRazaoSocial());
            stmt.setString(2, empresa.getNomeFantasia());
            stmt.setString(3, empresa.getCnpj());
            stmt.setString(4, empresa.getInscricaoEstadual());
            stmt.setString(5, empresa.getNomeProprietario());
            stmt.setString(6, empresa.getEmail());
            if (empresa.getDataFundacao() != null) {  
                    stmt.setDate(7, new java.sql.Date(empresa.getDataFundacao().getTime()));
                } else {  
                 stmt.setNull(7, Types.DATE);  
            }
            stmt.setInt(8, empresa.getEndereco_codigo().getCodigo());
            stmt.setInt(9, empresa.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(Empresa empresa) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from empresa"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, empresa.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            
        }
    }

    @Override
    public Empresa buscarPorCodigo(Integer codigo) {
        
        Empresa empresa = null;
        EnderecoDAO enderecoDao = new EnderecoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select codigo,razaoSocial,nomeFantasia,cnpj,inscricaoEstadual,"
                + "nomeProprietario,email,dataFundacao,endereco_codigo from empresa"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, codigo);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                empresa = new Empresa();
                empresa.setCodigo(rs.getInt("codigo"));
                empresa.setRazaoSocial(rs.getString("razaoSocial"));
                empresa.setNomeFantasia(rs.getString("nomeFantasia"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setInscricaoEstadual(rs.getString("inscricaoEstadual"));
                empresa.setNomeProprietario(rs.getString("nomeProprietario"));
                empresa.setEmail(rs.getString("email"));
                empresa.setDataFundacao(rs.getDate("dataFundacao"));
                empresa.setEndereco_codigo(enderecoDao.buscarPorCodigo(rs.getInt("endereco_codigo")));

            } 
        }catch (SQLException ex){
            
        }
        return empresa;
        
    }

    @Override
    public Integer buscarIdMaior() {
        
        Integer idmaior = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select max(codigo) as codigo from empresa";
        PreparedStatement stmt; 
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs2 = stmt.executeQuery(); 
            rs2.next(); 
            idmaior = rs2.getInt("codigo"); 

            rs2.close(); 
            stmt.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(ColaboradorDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return idmaior;
    }

    @Override
    public List<Empresa> buscarTodos() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        EnderecoDAO enderecoDao = new EnderecoDAOIMPL();

        Connection con = new Conexao().criarConexao();
        //String sql = "select codigo,razaoSocial,nomeFantasia,cnpj,inscricaoEstadual,"
        //        + "nomeProprietario,email,dataFundacao,endereco_codigo from empresa";
        String sql = "select * from empresa";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Empresa empresa = new Empresa();
                empresa.setCodigo(rs.getInt("codigo"));
                empresa.setRazaoSocial(rs.getString("razaoSocial"));
                empresa.setNomeFantasia(rs.getString("nomeFantasia"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setInscricaoEstadual(rs.getString("inscricaoEstadual"));
                empresa.setNomeProprietario(rs.getString("nomeProprietario"));
                empresa.setEmail(rs.getString("email"));
                empresa.setDataFundacao(rs.getDate("dataFundacao"));
                empresa.setEndereco_codigo(enderecoDao.buscarPorCodigo(rs.getInt("endereco_codigo")));

                empresas.add(empresa);
            }

        } catch (SQLException ex) {
        }
        return empresas;
    }

    @Override
    public Empresa buscarazaoSocial() {
        Connection con = new Conexao().criarConexao();
        Empresa empresa = null;
        String sql = "select razaoSocial from empresa";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                empresa = new Empresa();
                empresa.setRazaoSocial(rs.getString("razaoSocial"));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return empresa;
    
    }
    
}
