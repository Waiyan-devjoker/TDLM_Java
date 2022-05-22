package lesson_13_Loop;

import javax.swing.JOptionPane;

public class Lesson_exercise_2 {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        String exit = null;
        do {

            String n1 = JOptionPane.showInputDialog("Num1");
            String n2 = JOptionPane.showInputDialog("Num2");
            String OPT = JOptionPane.showInputDialog("OPT (+ ,-,*,/,%)");

            if (!n1.equals("") && !n2.equals("")) {
                num1 = Integer.parseInt(n1);
                num2 = Integer.parseInt(n2);
            }
            // else {
            // JOptionPane.showMessageDialog(null, "Input Num1 is blank");
            // }

            if (OPT.equals("+")) {
                JOptionPane.showMessageDialog(null, "Result :" + (num1 + num2));
            } else if (OPT.equals("-")) {
                JOptionPane.showMessageDialog(null, "Result :" + (num1 - num2));
            } else if (OPT.equals("*")) {
                JOptionPane.showMessageDialog(null, "Result :" + (num1 * num2));
            } else {
                JOptionPane.showMessageDialog(null, "OPT Error");
            }

            exit = JOptionPane.showInputDialog("Exit (y/n)");

        } while (exit.equals("n"));

        // String usr = "mgmg";
        // String name = JOptionPane.showInputDialog("Name");

        // if (name.equals("mgmg")) {
        // System.out.println("Success");
        // } else {
        // System.out.println("Fail");
        // }

        // int num1 = Integer.parseInt(JOptionPane.showInputDialog("Num1"));
        // int num2 = Integer.parseInt(JOptionPane.showInputDialog("Num2"));

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
