package lesson_13_Loop;

import javax.swing.JOptionPane;

public class Lesson_exercise {

    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Num1");
        String num2 = JOptionPane.showInputDialog("Num2");
        String opt = JOptionPane.showInputDialog("OPT");

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        if (opt.equals("*")) {
            JOptionPane.showMessageDialog(null, "Result :" + (n1 * n2));

        } else if (opt.equals("+")) {
            JOptionPane.showMessageDialog(null, "Result :" + (n1 + n2));
        }

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