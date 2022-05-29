package lesson_15_String_Method;

import javax.swing.JOptionPane;

public class Lesson_2 {

    public static void main(String[] args) {
        
        String st = JOptionPane.showInputDialog("Email");

        if(st.startsWith("12")){
            System.out.println("Is Gmail");
        }else{
            System.out.println("No Gmail");
        }

        //st.contains("@gmail.com")
        //st.endsWith("@gmail.com")
        //st.startWith("AC")

    }
    
}


/*
example4@yahoo.com
example3@google.com
example2@edu.com
example1@gmail.com



*/