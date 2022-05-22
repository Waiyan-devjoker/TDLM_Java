package lesson_13_Loop;

import javax.swing.JOptionPane;

public class Lesson_exercise {

    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Num 1");
        String num2 = JOptionPane.showInputDialog("Num 2");
        String OPT = JOptionPane.showInputDialog("OTP (+,-,*,/,%)");

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        if (OPT.equals("+")) {
            JOptionPane.showMessageDialog(null, "Result : " + (n1 + n2));
        } else if (OPT.equals("-")) {
            JOptionPane.showMessageDialog(null, "Result -1 : " + (n1 - n2));
        } else if (OPT.equals("*")) {
            JOptionPane.showMessageDialog(null, "Result -2 : " + (n1 * n2));
        }
        System.out.println("-----Finsish");

    }

}

/*
 * Num1 --- 5
 * Num2 --- 3
 * OPT --- * / + - %
 * 
 * Rueslt -- 15
 * 
 * 
 */