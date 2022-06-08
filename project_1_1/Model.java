package project_1_1;

import javax.swing.JOptionPane;

public class Model {

    public double InputNum1(){
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Num 1"));
        return num1;
    }

    public double InputNum2(){
        return Double.parseDouble(JOptionPane.showInputDialog(null, "Num 2"));
    }
    
    public String InputOPT(){
        return JOptionPane.showInputDialog(null, "OPT");
    }

    public void Result(){
        JOptionPane.showMessageDialog(null,new Validate().Valid(InputNum1(), InputNum2(), InputOPT()));
        // InputNum1();
        // InputNum2();
        // InputOPT();
    }
}
