package lesson_40_FileWriter.path_1_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        String file_location = "lesson_40_FileWriter/path_1_3/info.txt";
        Controller con = new Controller();
        con.file_check(file_location);
        String email = JOptionPane.showInputDialog(null,"Email");
        String pass = JOptionPane.showInputDialog(null,"Password");
        con.file_write(email,pass);
        con.message("success");
        
    }
    
}

/*
Register
    - email = mgmg@gmail.com
    - pass = 12345

txt
mgmg@gmail.com:12345


App


Controller
- File_Check
- File_Write
- message



 */
