package project_1_2;

public class Controller {

    public static void main(String[] args) {
 
        View obj = new View();
        Model mod = obj.register();
        //Model mod = new View().register();
        
        System.out.println(mod.getEmail());
        System.out.println(mod.getPhone());
        System.out.println(mod.getPass());

        // View obj = new View();
        // Model mod = obj.register();
        // Model m1 = obj.register();

        // System.out.println("Mod : "+mod.getEmail());
        // System.out.println("Mod : "+mod.getPhone());
        
    }
    
}
