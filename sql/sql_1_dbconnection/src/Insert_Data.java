import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Insert_Data {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Start Connection-----");
        String DB_Driver = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost/uat";
        String DB_USER = "root";
        String DB_PASS = "";
        
        Class.forName(DB_Driver);
        
        Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        System.out.println("Connection Success");

        String sql = "INSERT INTO user (email,name,pass) VALUES (?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);

        String email = JOptionPane.showInputDialog(null, "Email");
        String name = JOptionPane.showInputDialog(null, "Name");
        String pass = JOptionPane.showInputDialog(null, "Pass");


        ps.setString(1,email); // column email
        ps.setString(2, name); // column name
        ps.setString(3, pass); // column pass

        ps.executeUpdate();
        ps.close();
        con.close();

        System.out.println("Data Insert Success .......");

        
        
    }
}

//https://www.google.com
// 8.8.8.8


//http://localhost
//172.0.0.1

//https://facebook.com


/*
    Data Server

    - xampp


    1. Data Server
    2. Database
    3. Data Table / Column

    SQL (CRUD)

    - Create
    INSERT INTO user (email,name,pass) VALUES
    ('admin@gmail.com','admin','456') 


    - Read
    - Update
    - Delete 
 
 */