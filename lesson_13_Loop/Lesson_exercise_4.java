package lesson_13_Loop;

import javax.swing.JOptionPane;

public class Lesson_exercise_4 {

    public static void main(String[] args) {
        
        boolean ext = true;
        
        while(ext){

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
    
    
            String exit = JOptionPane.showInputDialog("Exit y/n");

            if(exit.equals("y")){
                ext = false;
            }
    

        }


       



    }

    
}
