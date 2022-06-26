package lesson_29_Inheritance;

public class Main {

    public static void main(String[] args) {
        
        Boy obj_boy = new Boy();

        System.out.println(obj_boy.name);
        System.out.println(obj_boy.age);
        System.out.println(obj_boy.phone);
        obj_boy.sleep();
        obj_boy.play();
        obj_boy.info();

        Girl obj_girl = new Girl();

        System.out.println(obj_girl.name);
        System.out.println(obj_girl.age);
        System.out.println(obj_girl.email);
        obj_girl.eat();
        obj_girl.play();

    }

    
}
