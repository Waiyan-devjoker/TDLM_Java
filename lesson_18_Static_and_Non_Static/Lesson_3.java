package lesson_18_Static_and_Non_Static;

public class Lesson_3 {

    // Non Static method call
    /*

     Static
       - Non Static (Create Obj)
     
     Non Static
       - Static

    */
    public static void main(String[] args) {
        //show();

        //String name = "mgmg";
        Lesson_3 obj = new Lesson_3();
        obj.car();
        // obj.testing();
        // new Lesson_3().car();
        // new Lesson_3().testing();

        //alert();

    }

    public static void show(){
        System.out.println("Show Method");
    }

    public void car(){
        System.out.println("Car Method");
        show();
    }

    public void testing(){
        System.out.println("Testing Method");
    }

    public static void alert(){
        System.out.println("Alert Method");
        // show();
        // new Lesson_3().car();
        
    }
    
}
