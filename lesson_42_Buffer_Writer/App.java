package lesson_42_Buffer_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        File fl = new File("lesson_42_Buffer_Writer/note.txt");
        FileWriter fw;
        try {

            fw = new FileWriter(fl,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(JOptionPane.showInputDialog(null,"Input"));
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }
    
}

/*
 * !@#$%^&*
 * CSDDFSD
 * 
 * 
 */
