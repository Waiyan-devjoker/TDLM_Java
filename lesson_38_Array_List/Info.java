package lesson_38_Array_List;

import java.util.ArrayList;

public class Info {

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList();
        al.add("Java"); // 0 index
        al.add("HTML"); // 1
        al.add("Python"); // 2
        al.add("PHP"); // 3
        
        ArrayList<Integer> al2 = new ArrayList();
        al2.add(200);
        // al2.add('a');
        // al.add(2.5);
        // al.add(true);
        
        //System.out.println(al.get(6));

        // for(int i = 0 ; i < al.size() ; i++){
        //     System.out.println(al.get(i));
        // }

        for(String st : al){
            System.out.println(st);
        }


    }
    
}
