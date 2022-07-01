package lesson_33_Interface.addon_5_real_life;

public class Main implements Show{

    // public static void main(String[] args) {
    //     Main obj = new Main();
    //     obj.sms("SMS hello");
    // }

    // @Override
    // public void sms(String name) {
    //     System.out.println(name);
    //     System.out.println(1+2);
    //     System.out.println("Result");
        
    // }
    
    public static void main(String[] args) {

        Action obj = new Action(new Main());
        obj.result();
        
    }

    @Override
    public void sms(String name) {
        System.out.println(name);
        System.out.println(1+2);
        System.out.println("Result");
        
    }

}
