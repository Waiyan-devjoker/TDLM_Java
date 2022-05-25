package lesson_13_Loop;

import javax.swing.JOptionPane;

public class Lesson_exercise_3 {

    public static void main(String[] args) {
        String exit = null;

        do{

            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Num 1"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Num 2"));
            String opt = JOptionPane.showInputDialog("OPT");

            if(opt.equals("+")){
                JOptionPane.showMessageDialog(null, "Result "+ (num1+num2));

            }else if(opt.equals("-")){
                JOptionPane.showMessageDialog(null, "Result "+ (num1-num2));

            }else if(opt.equals("*")){

                JOptionPane.showMessageDialog(null, "Result "+ (num1*num2));
            }


            exit = JOptionPane.showInputDialog("Exit y/n");


        }while(!exit.equals("y"));

        

        
    }


    
}
/*
* 
* Num1 : 3
* Num2 : 2
* OPT : +
* 
* Result : 5
* Exit (y/n): n
* 
* Num1 : 3
* Num2 : 2
* OPT : -
* 
* Result : 1
* Exit (y/n): y
* 
* 
* 
*/