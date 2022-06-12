package lesson_24_variable_scope;

public class Info {

    String name = "admin"; // Global Variable - Class Variable

                        // Parm Variable
    public void about(String addres){
        int age = 20; // Local Variable
    }

    public void show(){
        System.out.println(name);
    }

    public void AA(){
        System.out.println(name);
    }

    
}
