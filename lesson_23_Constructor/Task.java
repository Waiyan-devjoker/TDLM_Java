package lesson_23_Constructor;

public class Task {

    Task(){
      
    }

    Task(String name){
        System.out.println("Constructor Run");
        System.out.println("Name : "+ name);
    }

    Task(String name,String email){
        System.out.println("Run Constructor");
        System.out.println("Name : "+ name);
        System.out.println("Email : "+email);
    }

    public void show(){
        System.out.println("Show Method");
    }

    public void todo(){
        System.out.println("ToDo Method");
    }

    
}
