package lesson_19_Class_And_Object;

public class Human {

    String name = "Mg Mg";
    String email = "mgmg@gmail.com";
    static String age = "29";

    public static void main(String[] args) {

        Boy obj = new Boy();
        obj.Eat();
        obj.Sleep();
        obj.show();


        Human obj2 = new Human();
        System.out.println(obj2.name);
        System.out.println(obj2.email);

        System.out.println(age);

    
        
    }


    
}
