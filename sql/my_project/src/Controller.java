import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Controller {

    DB_connection con = new DB_connection();

    public void data_insert(String email,String phone, String pass){
        String sql = "INSERT INTO register(email,phone,pass) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.db_connect().prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2,phone);
            ps.setString(3,pass);
            
            ps.executeUpdate();
            ps.close();
            con.close_connection();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public void data_login(String email,String pass){
        String sql = "SELECT * FROM register WHERE email='"+email+"' and pass='"+pass+"'";
        try {
            Statement st = con.db_connect().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
               
                JOptionPane.showMessageDialog(null, rs.getString("email") +" : "+rs.getString("phone"));
            }
            
            st.close();
            rs.close();
            con.close_connection();



        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

    
}
