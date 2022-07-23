package lesson_44_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        
        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(200, "Java");
        hm.put(100, "Python");
        hm.put(300, "CSS");

        // System.out.println(hm.get("aa"));

        for(Map.Entry<Integer,String> ent: hm.entrySet()){
            System.out.println(hm.get(ent.getKey()));
        }

    }
    
}
