import javax.swing.JOptionPane;

public class Delete {
    
    Delete(){
        Controller con = new Controller();
        String email = JOptionPane.showInputDialog(null, "Delete Email");
        con.data_delete(email);
    }

}
