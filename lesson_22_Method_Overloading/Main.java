package lesson_22_Method_Overloading;

public class Main {

    public static void main(String[] args) {

        Task obj = new Task();
        obj.register();
        obj.register("admin@gmail.com","222");
        obj.register("admin@gmail.com","222","Yangon");

        
    }
    
}
