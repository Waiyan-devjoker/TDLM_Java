package lesson_39_Try_Catch;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        

        System.out.println("App Finish");

        ArrayList<Integer> al = new ArrayList<>();

        al.add(100);
        al.add(500);
        al.add(400);
        al.add(800);
        al.add(200);

        System.out.println("Hello ------- 1");
        try{
            System.out.println(al.get(1));
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Num 1"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Num 2"));
        }catch(Exception c){
            System.out.println(c);
        }finally{
            System.out.println("Final");
        }
        
        // catch(IndexOutOfBoundsException e){
        //     System.out.println("Array Error Noti");
        // }
        // catch(NumberFormatException a){
        //     JOptionPane.showMessageDialog(null, "Number Error");
        // }
        
        System.out.println("Hello ------- 2");


        
    }
    
}
