import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start Connection-----");
        String DB_Driver = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost/ggg";
        String DB_USER = "root";
        String DB_PASS = "";
        
        Class.forName(DB_Driver);
        
        Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        System.out.println("Connection Success");
        
        
    }
}

//https://www.google.com
// 8.8.8.8


//http://localhost
//172.0.0.1