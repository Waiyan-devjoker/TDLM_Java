package lesson_21_Return_Type;

public class Info {

    public void show(){
        System.out.println("Show Method");
    }


    public String message(){
        return "Retrun Value";
    }

    public int age(){
        return 20;
    }

    
    public String data(String email,String pass,double num){
        return "Email : \t"+email+"\nPassword : "+ pass+"\nNum "+num;
    }


    
}
