package lesson_12_Control_Flow;

import javax.swing.JOptionPane;

public class Lesson_6 {

    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog("Email");
        String pass = JOptionPane.showInputDialog("Password");

        if (email.equals("mgmg@gmail.com") && pass.equals("12345")) {
            JOptionPane.showMessageDialog(null, "Success");
        } else {
            JOptionPane.showMessageDialog(null, "Fail");
        }

        /*
         * HW
         * email = mgmg@gmail.com / example@gmail.com
         * age = 25 ->
         * 
         * output : T- Success / F- Fail
         * 
         */

    }

}
