package lesson_27_Access_Modifier;

public class Main {

   public static void main(String[] args) {
       
        Task obj = new Task();

        System.out.println(obj.name);
        //System.out.println(obj.email);
        System.out.println(obj.address);

        obj.access_1();
        //obj.access_2();
        obj.access_3();
   }
    
}
