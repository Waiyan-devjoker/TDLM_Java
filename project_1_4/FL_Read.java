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
            boolean bo = false;
            while(br.ready()){

                if(valid.toLowerCase().equals(br.readLine().toLowerCase())){
                    bo = true;
                    break;
                }

            }
            br.close();

            if(bo){
                JOptionPane.showMessageDialog(null,"Ok");
            }else{
                JOptionPane.showMessageDialog(null,"Fail");
            }

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
