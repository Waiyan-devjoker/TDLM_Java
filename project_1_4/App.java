package project_1_4;

import java.io.File;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        String file_loaction = "project_1_4/info.txt";
        File fl = new File(file_loaction);
        // String input = JOptionPane.showInputDialog(null, "Input");
        // new Fl_Write(fl, input);
        new FL_Read(fl);
        
    }
    
}
