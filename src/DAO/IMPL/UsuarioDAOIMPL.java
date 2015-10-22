package DAO.IMPL;

import FRAME.FramePrincipal;
import DAO.UTIL.Conexao;
import DAO.UsuarioDAO;
import MODEL.Endereco;
import MODEL.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAOIMPL implements UsuarioDAO {

    @Override
    public void inserir(Usuario usuario) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into usuario value(?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getCodigo());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getSenha());


            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Usuario usuario) {

        Connection con = new Conexao().criarConexao();
        String sql = "update usuario set usuario = ?, senha = ?  where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());
            stmt.setLong(3, usuario.getCodigo());


            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void remover(Usuario usuario) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from usuario"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setLong(1, usuario.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public Usuario buscarPorCodigo(Integer codigo) {

        Usuario usuario = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select * from usuario"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setLong(1, codigo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setSenha(rs.getString("senha"));

            }

        } catch (SQLException ex) {
        }
        return usuario;

    }

    @Override
    public List<Usuario> buscarTodos() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from usuario";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setSenha(rs.getString("senha"));

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
        }
        return usuarios;


    }

    @Override
    public Usuario buscarPorUsuarioeSenha(String usuario, String senha) {
        Usuario us = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select * from usuario"
                + " where usuario = ? and senha = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, 2);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                us = new Usuario();
                us.setUsuario(rs.getString("usuario"));
                us.setSenha(rs.getString("senha"));
            }
        } catch (SQLException ex) {
        }
        return us;
    }
}
