package lesson_30_Multi_Inheritance;

public class Main {
    
    public static void main(String[] args) {
        
        Student obj_stu = new Student();

        obj_stu.play();
        obj_stu.stu_method();


        Boy obj_boy = new Boy();

        obj_boy.play();
        obj_boy.boy_method();
        obj_boy.stu_method();


        Girl obj_girl = new Girl();

        obj_girl.play();
        obj_girl.girl_method();
        obj_girl.boy_method();
        obj_girl.stu_method();


    }

}
