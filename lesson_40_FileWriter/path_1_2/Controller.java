package lesson_40_FileWriter.path_1_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    public void create_file(String file_name) throws IOException{
        File file = new File(file_name);
        FileWriter fw = new FileWriter(file);
    }
    
}
