package lesson_22_Method_Overloading;

public class Task {

    public void register(){
        System.out.println("Register Method");
    }

    public void register(String email,String pass){
        System.out.println(email+"\t"+pass);
    }


    public void register(String email,String pass,String address){
        System.out.println(email+"\t"+pass+"\t"+address);
    }
    // DOB 2-2-2022 - Age 
    
}

