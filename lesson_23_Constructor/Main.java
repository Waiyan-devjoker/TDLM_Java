package lesson_23_Constructor;

public class Main {

    public static void main(String[] args) {
        
        Task obj = new Task("Admin","admin@gmail.com");
        // obj.show();
        // obj.todo();

        new Task("mgmg@email.com");

        Task obj2 = new Task();
        obj2.show();
        obj2.todo();

        new Task().show();
    }
    
}
