package lesson_40_FileWriter.path_1_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        String file_location = "lesson_40_FileWriter/path_1_1/info.txt";
        File file = new File(file_location);
        try {
            FileWriter fw = new FileWriter(file,true);
            fw.write("Python");
            fw.close();

        } catch (IOException e) {
            System.out.println("File Location Error");
        }
        System.out.println("Success");

        
    }

}
