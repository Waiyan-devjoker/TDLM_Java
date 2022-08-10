import javax.swing.JOptionPane;

public class Login {

    Login(){

        Controller con = new Controller();
        String email = JOptionPane.showInputDialog(null, "Email");
        String pass = JOptionPane.showInputDialog(null, "Password");
        con.data_login(email, pass);


    }
    
}
