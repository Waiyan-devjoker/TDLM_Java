package lesson_25_this_keyword;

public class Task {

    String name = "admin";
    String email = "admin@gmail.com";

    String age = "27";
    String address = "YGN";


    public void info(String name,String email){
        System.out.println(name);
        System.out.println(this.name);
    }

    public void about(String age, String address){
        System.out.println("Parm " +age);
        System.out.println("Parm "+address);

        System.out.println("Global "+this.age);
        System.out.println("Global "+this.address);
    }
    
}
