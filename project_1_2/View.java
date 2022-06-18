package project_1_2;

import javax.swing.JOptionPane;

public class View {


    public Model register(){

        Model model = new Model();
        model.setEmail(JOptionPane.showInputDialog(null, "Email"));
        model.setPhone(JOptionPane.showInputDialog(null, "Phone"));
        model.setPass(JOptionPane.showInputDialog(null, "Pass"));

        return model;
    }
    
}
