package project_1_3;

import javax.swing.JOptionPane;

public class View {

    public Model show(){

        Model model = new Model();
        model.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Num1")));
        model.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Num2")));
        model.setOpt(JOptionPane.showInputDialog(null, "Opt"));

        return model;
        
    }

    public void result(double result){
        JOptionPane.showMessageDialog(null,result);
    }

}
