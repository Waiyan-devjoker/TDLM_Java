package lesson_37_Super;

public class Show extends Action{

    int cus_id = 100;
    int id = 600;

    public void todo(){
        int id = 400;
        // System.out.println(super.cus_id);
        // System.out.println(super.id);
        // System.out.println("ToDo");
        super.info();
        System.out.println(this.id);
    }
    
}
