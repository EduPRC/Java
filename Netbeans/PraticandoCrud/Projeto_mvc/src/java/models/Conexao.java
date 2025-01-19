
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    
    private final String claasDriver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/projeto_mvc";
    private final String user = "postgres";
    private final String pass = "123456";
    
    public Connection conexao (){
        Connection con = null;
        
        try {
            //Carregar o driver
            Class.forName(claasDriver);
            
            //obter a ligação
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("e.getMessage()");
            
        }
        return con;
    }
    
    public void desligarConexao(Connection con){
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("e.getMessage()");
        }
    }
}
