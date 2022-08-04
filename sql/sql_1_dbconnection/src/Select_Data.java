import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Select_Data {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Start Connection-----");
        String DB_Driver = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost/uat";
        String DB_USER = "root";
        String DB_PASS = "";
        
        Class.forName(DB_Driver);
        
        Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        System.out.println("Connection Success");

        String sql = "SELECT email,pass FROM user";
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String pass = rs.getString("pass");

            System.out.println(id+" "+name+" "+email+" "+pass);

        }

        rs.close();
        stm.close();
        con.close();
        
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
    ('admin@gmail.com','admin','456');

    - Read
    SELECT id,email,name,pass FROM user;

    - Update
    - Delete 
 
 */