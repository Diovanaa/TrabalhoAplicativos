
package DAO.IMPL;

import DAO.CidadeDAO;
import DAO.EnderecoDAO;
import DAO.UTIL.Conexao;
import MODEL.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoDAOIMPL implements EnderecoDAO{

    @Override
    public void inserir(Endereco endereco) {
        
        Connection con = new Conexao().criarConexao();
        String sql = "insert into endereco value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, endereco.getCodigo());
            stmt.setString(2, endereco.getRua());
            stmt.setString(3, endereco.getNumero());
            stmt.setString(4, endereco.getCep());
            stmt.setString(5, endereco.getBairro());
            stmt.setInt(6, endereco.getCidade_codigo().getCodigo());
            stmt.setString(7, endereco.getTelefone());
            stmt.setString(8, endereco.getCelular());
            stmt.setString(9, endereco.getEmail());
           
            stmt.executeUpdate();
        } catch (SQLException ex){
            Logger.getLogger(EnderecoDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void alterar(Endereco endereco) {
        Connection con = new Conexao().criarConexao();
        String sql = "update endereco set rua = ?, numero = ?, cep = ?, bairro = ?, cidade_codigo = ?"
                + ", telefone = ?, celular = ?, email = ?  where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, endereco.getRua());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getCep());
            stmt.setString(4, endereco.getBairro());
            stmt.setInt(5, endereco.getCidade_codigo().getCodigo());
            stmt.setString(6, endereco.getTelefone());
            stmt.setString(7, endereco.getCelular());
            stmt.setString(8, endereco.getEmail());
            stmt.setInt(9, endereco.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(Endereco endereco) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from endereco"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, endereco.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            Logger.getLogger(EnderecoDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Endereco buscarPorCodigo(Integer codigo) {
        Endereco endereco = null;
        CidadeDAO cidadeDao = new CidadeDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select codigo, rua, numero, cep, bairro, "
                + "cidade_codigo, telefone, celular, email from endereco"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, codigo);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                endereco = new Endereco();
                endereco.setCodigo(rs.getInt("codigo"));
                endereco.setRua(rs.getString("rua"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setCep(rs.getString("cep"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setCidade_codigo(cidadeDao.buscaPorId(rs.getInt("cidade_codigo")));
                endereco.setTelefone(rs.getString("telefone"));
                endereco.setCelular(rs.getString("celular"));
                endereco.setEmail(rs.getString("email"));

            
            
            } 
        }catch (SQLException ex){
           Logger.getLogger(EnderecoDAOIMPL.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return endereco;
    }

    @Override
    public List<Endereco> buscarTodos() {
        List<Endereco> enderecos = new ArrayList<Endereco>();
        CidadeDAO cidadeDao = new CidadeDAOIMPL();


        Connection con = new Conexao().criarConexao();
        String sql = "select codigo, rua, numero, cep, bairro, "
                + "cidade_codigo, telefone, celular, email from endereco";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Endereco endereco = new Endereco();
                endereco.setCodigo(rs.getInt("codigo"));
                endereco.setRua(rs.getString("rua"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setCep(rs.getString("cep"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setCidade_codigo(cidadeDao.buscaPorId(rs.getInt("cidade_codigo")));
                endereco.setTelefone(rs.getString("telefone"));
                endereco.setCelular(rs.getString("celular"));
                endereco.setEmail(rs.getString("email"));

                enderecos.add(endereco);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enderecos;
        
    }

    @Override
    public Integer buscarIdMaior() {
        Integer idmaior = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select max(codigo) as codigo from endereco";
        PreparedStatement stmt; 
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs2 = stmt.executeQuery(); 
            rs2.next(); 
            idmaior = rs2.getInt("codigo"); 

            rs2.close(); 
            stmt.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return idmaior;
    }
    
    
    
    
}
