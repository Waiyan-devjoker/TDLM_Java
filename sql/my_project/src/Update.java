import javax.swing.JOptionPane;

public class Update {

    Update(){
        Controller con = new Controller();
        String email = JOptionPane.showInputDialog(null, "Email");
        String phone = JOptionPane.showInputDialog(null, "Update Phone");
        String pass = JOptionPane.showInputDialog(null, "Update Pass");

        con.data_update(email, phone, pass);

    }
    
}
