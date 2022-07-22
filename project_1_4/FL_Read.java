package project_1_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FL_Read {


    FL_Read(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String valid = JOptionPane.showInputDialog(null, "Search");

            while(br.ready()){

                if(valid.equals(br.readLine())){
                    System.out.println("Ok");
                }else{
                    System.out.println("Fail");
                }

            }

            br.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // FL_Read(File file){

    //     try {
    //         FileReader fr = new FileReader(file);
    //         while(fr.ready()){
    //             System.out.print((char)fr.read());
    //         }
    //         fr.close();

    //     } catch (FileNotFoundException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     } catch (IOException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }



    // }
    
}
