import javax.swing.JOptionPane;

public class Register {



    Register(){

      Controller cont = new Controller();
      String email = JOptionPane.showInputDialog(null, "Email");
      String phone = JOptionPane.showInputDialog(null, "Phone");
      String pass = JOptionPane.showInputDialog(null, "Password");
      cont.data_insert(email, phone, pass);

      JOptionPane.showMessageDialog(null, "Register Success");

    }

    
}
