package lesson_15;

import javax.swing.JOptionPane;

public class Lesson_2 {

    public static void main(String[] args) {
        
        String st = JOptionPane.showInputDialog("Email");

        if(st.endsWith("@gmail.com")){
            System.out.println("Is Gmail");
        }else{
            System.out.println("No Gmail");
        }

        //st.contains("@gmail.com")
        //st.endsWith("@gmail.com")

    }
    
}


/*
example4@yahoo.com
example3@google.com
example2@edu.com
example1@gmail.com



*/