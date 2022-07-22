package project_1_4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fl_Write {

    Fl_Write(File file,String input){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
            bw.write(input);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    // Fl_Write(File file,String input){

    //     try {
    //         FileWriter fw = new FileWriter(file,true);
    //         fw.write(input+"\n");
    //         fw.close();

    //     } catch (IOException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }

    // }

    
}
