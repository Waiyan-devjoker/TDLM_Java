package lesson_20_Method_And_Parameter;

public class Login {

    public void show(){
        System.out.println("Show Method");
    }


    public void login(String email,String pass){
        System.out.println("Email : "+email);
        System.out.println("Password : "+pass);
    }


    public void info(int age,String address,double num){
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
        System.out.println("Number : "+num);
    }
    
}
