package lesson_21_Return_Type;

public class Main {

    public static void main(String[] args) {
        Info obj = new Info();

        obj.show();
        System.out.println(obj.message());
        System.out.println(obj.age());
        System.out.println(obj.data("mgmg@gmail.com", "222", 5.43));


        // String rec = obj.message();
        // System.out.println(rec);
    }
    
}
