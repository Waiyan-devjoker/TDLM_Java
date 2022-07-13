package lesson_40_FileWriter.path_1_2;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        
        Controller cont = new Controller();
        cont.create_file("lesson_40_FileWriter/path_1_2/info.txt");
        
        // cont.create_file("lesson_40_FileWriter/path_1_2/info.txt");
        // System.out.println("Success");

    }
    
}
