package lesson_19_Class_And_Object;

public class Boy {

    public void Eat(){
        System.out.println("Eat Method");
    }

    public void Sleep(){
        System.out.println("Sleep Method");
        show();
    }

    public static void show(){
        System.out.println("Show Method");
        // Boy obj = new Boy();
        // obj.Eat();
        //Eat();
    }
    
}
