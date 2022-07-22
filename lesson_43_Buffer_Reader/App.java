package lesson_43_Buffer_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("lesson_43_Buffer_Reader/note.txt")));
            
            while(br.ready()){
                System.out.println(br.readLine());
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
    
}
