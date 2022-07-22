package lesson_41_File_Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String file_location = "lesson_41_File_Reader/info.txt";
        File fl = new File(file_location);

        // File Read Method
        try {
            FileReader fr = new FileReader(fl);
            
            while(fr.ready()){
                System.out.print((char)fr.read());
            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




        // File Write Method

        // try {
        //     FileWriter fw = new FileWriter(fl,true);
        //     fw.write("Css");
        //     fw.write("\n");
        //     fw.close();

        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     System.out.println("File not found!");
        // }


    }
    
}
