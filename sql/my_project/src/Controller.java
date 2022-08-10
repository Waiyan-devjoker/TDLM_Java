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
            JOptionPane.showMessageDialog(null, "Register Success");

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
            int count = 0;
            
            while (rs.next()){
                count += 1;
                JOptionPane.showMessageDialog(null, "Login Success \nEmail: "+rs.getString("email") +"\nPass:"+rs.getString("phone"));
            }

            if(count == 0){
                JOptionPane.showMessageDialog(null, "Login Fail");
            }
                
            
            st.close();
            rs.close();
            con.close_connection();


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

    public void data_update(String email,String phone,String pass){
        String sql = "UPDATE register SET phone=?,pass=? WHERE email=?";
        try {
            PreparedStatement ps = con.db_connect().prepareStatement(sql);
            ps.setString(1, phone);
            ps.setString(2, pass);
            ps.setString(3, email);

            ps.executeUpdate();
            ps.close();
            con.close_connection();
            
            JOptionPane.showMessageDialog(null, "Update Success");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public void data_delete(String email){
        String sql = "DELETE FROM register WHERE email=?";
        try {
            PreparedStatement ps = con.db_connect().prepareStatement(sql);
            ps.setString(1, email);
            ps.executeUpdate();
            ps.close();
            con.close_connection();

            JOptionPane.showMessageDialog(null, "Delete Success "+email);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    
}
