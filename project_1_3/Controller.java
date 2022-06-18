package project_1_3;

import javax.swing.JOptionPane;

public class Controller {


    public void calculate(){

        View vi = new View();
        Model mod = vi.show();


        if(mod.getOpt().equals("+")){
            
            vi.result(mod.getNum1()+mod.getNum2());

        }else if(mod.getOpt().equals("-")){
            vi.result(mod.getNum1()-mod.getNum2());
        }


    }

    
}
