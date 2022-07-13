package lesson_40_FileWriter.path_1_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Controller {

    FileWriter fw = null;

    public void file_check(String file_name){
        File file = new File(file_name);
        try {
            fw = new FileWriter(file,true);
        } catch (IOException e) {
           message("file_error");
        }
    }

    public void file_write(String email,String pass){

        try {

        if(fw != null){
            fw.write(email+":"+pass+"\n");
            fw.close();
        }else{
            message("null");
        }
            

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Null Ponter");
        }
       
        
    }

    public void message(String msg){
        if(msg.equals("file_error")){
            JOptionPane.showMessageDialog(null, "File Not Found !");
        }else if(msg.equals("null")){
            JOptionPane.showMessageDialog(null, "File null Error !");
        }else if(msg.equals("success")){
            JOptionPane.showMessageDialog(null, "Success");
        }
    }
    

    
    
}


 

        // JOptionPane.showMessageDialog(null, "File Not Found !!");