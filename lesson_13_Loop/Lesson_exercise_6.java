package lesson_13_Loop;

public class Lesson_exercise_6 {

    public static void main(String[] args) {
        
        String st[][] = {
                        {"Java","SE","EE"},
                        {"HTML"},
                        {"Odoo","Python"}
        };

        
        for(int i = 0; i < st.length ; i++){

            for(int j = 0; j < st[i].length ; j++){
                
                //System.out.println(st[i][j]);
                System.out.println("Row "+ i +" Cloumn "+ j);
            }
            
        }



    }
    
}


/*

API

PHP - web

Android - Mobile

*/
