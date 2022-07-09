package lesson_38_Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Info_2 {

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList();
        al.add("AA"); // 0 index
        al.add("Java"); // 0 index
        al.add("ZZ"); // 1
        al.add("HTML"); // 1
        al.add("Python"); // 2
        al.add("PHP"); // 3
        al.add("CC"); // 3

        // Collections.sort(al);
        al.clear();
        System.out.println(al.isEmpty());
        

        // for(String st : al){
        //     System.out.println(st);
        // }

    }
    
}
