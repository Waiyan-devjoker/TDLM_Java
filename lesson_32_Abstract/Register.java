package lesson_32_Abstract;

public abstract class Register extends Login{

    public void create_user(){
       System.out.println("Hello");
    }

    public abstract void useremail_validate();
    public abstract void userpass_validate();
    public abstract void phone();
}
