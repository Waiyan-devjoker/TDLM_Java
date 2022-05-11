package lesson_12_Control_Flow;

public class Lesson_4 {

    public static void main(String[] args) {

        String email = "mgmg@gmail.com"; // mgmg@gmail.com

        if (email == "example@gmail.com") {

            System.out.println("Example Login success");

        } else if (email == "mgmg@gmail.com") {

            System.out.println("MgMg Login Success");

        } else if (email == "mgmg@gmail.com") {

            System.out.println("KyawKyaw Login Success");

        } else {
            System.out.println("Fail");
        }
    }

}

/*
 * 
 * if...else
 * 
 * if(con: true){
 * 
 * -- statement
 * 
 * }else{
 * 
 * -- statement
 * 
 * }
 * 
 * if...else if
 * 
 * con
 * 
 * if(con : false){
 * ---1
 * 
 * }else if(con2 : false){
 * --2
 * 
 * }else if(con3 : true){
 * --3
 * 
 * }else{
 * 
 * }
 * 
 * 
 * 
 * 
 */
