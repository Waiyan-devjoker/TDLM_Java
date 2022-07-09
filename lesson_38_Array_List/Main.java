package lesson_38_Array_List;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        al.add("Java"); // 0 index
        al.add("HTML"); // 1
        al.add("Python"); // 2
        al.add("PHP"); // 3

        al.add(0,5.5f);// Index add value
        
        // System.out.println("Before "+al.size());
        //al.remove(2); // Array remove with index
        // al.remove("Python"); // Array remove with value
        // System.out.println(al.get(3)); // Value Get
        // System.out.println("After "+al.size()); // Array size

        for(int i = 0 ; i < al.size(); i++){
            System.out.println(al.get(i));
        }

    }
    
}
