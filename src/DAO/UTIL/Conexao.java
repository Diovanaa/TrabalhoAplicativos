
package DAO.UTIL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
     private static Connection con;
     ResultSet resultado;

    static{
        String url = "jdbc:mysql://localhost/bancosistema?"
                + "autoReconnect=true";
        String user = "root";
        String password = "1234";

        try {
            con = DriverManager.getConnection(url, user,
                    password);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão");
            ex.printStackTrace();
        }
    }

    public Connection criarConexao(){
        return con;
    
    }
}
