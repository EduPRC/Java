
package dao;

import java.util.List;
import models.UserModel;
import java.sql.Connection; 
import models.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoUser {
    
    public List<UserModel> getAllUsers(){
        Connection con = null;
        Conexao conexao = new Conexao();
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from users";
        List lista = new ArrayList();
        try {
             con = conexao.conexao();
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
             while(rs.next()){
                 UserModel userModel = new UserModel();
                 userModel.setIdUser(rs.getInt("id_user"));
                 userModel.setUserName(rs.getString("user_name"));
                 userModel.setUserEmail(rs.getString("user_email"));
                 userModel.setCreatedAt(rs.getTimestamp("created_at"));
                 userModel.setUpdateAt(rs.getTimestamp("updated_at"));
                 userModel.setDeleteAt(rs.getTimestamp("deleted_at"));
                 lista.add(userModel);
             }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            conexao.desligarConexao(con);
        }
        return lista;
    }
    
    
}
