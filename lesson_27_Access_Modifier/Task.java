package lesson_27_Access_Modifier;

public class Task {
    // Access Modifier default public
    public String name = "mgmg";
    private String email = "mgmg@gmail.com";
    protected String address = "YGN";

    

    public void access_1(){
        System.out.println("Access 1 public");
    }

    private void access_2(){
        System.out.println("Access 2 Private");
    }

    protected void access_3(){
            System.out.println("Access 3 Protected");
    }

}
