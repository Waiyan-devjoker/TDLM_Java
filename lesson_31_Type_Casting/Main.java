package lesson_31_Type_Casting;

public class Main {
    
    public static void main(String[] args) {
        
        // Up Casting
        Girl obj_girl = (Girl) new Boy();
        Girl obj_girl2 = (Girl) new Boy();

        // Down Casting
        Student obj_stu = new Boy();
        Student obj_stu2 = new Girl();
    

    }

}
