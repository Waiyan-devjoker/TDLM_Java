package lesson_17_Class_Attributes;


public class Lesson_1 {

    String name = "MgMg";
    String email = "mgmg@gmail.com";


    public static void main(String[] args) {
        String address = "Yangon";

        Lesson_1 obj = new Lesson_1();   

        System.out.println(address);
        System.out.println(obj.name);
        System.out.println(obj.email);
        
        Lesson_1 obj2 = new Lesson_1();
        System.out.println(obj2.name);
        System.out.println(obj2.email);
        
    }

    public static void show(){
        String address = "Yangon";
        Lesson_1 obj = new Lesson_1();   
        System.out.println(obj.name);
        System.out.println(address);
    }
    
}
