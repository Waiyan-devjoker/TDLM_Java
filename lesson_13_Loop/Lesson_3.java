package lesson_13_Loop;

public class Lesson_3 {

    public static void main(String[] args) {

        // int i = 0;

        // do {

        // System.out.println("Hello " + i);

        // i++;

        // } while (i < 5);

        /*
         * ST STM INC EN
         * i0 Hello 0 i0+1 true
         * i1 Hello 1 i1+1 true
         * .
         * .
         * i4 Hello 4 i4+1 true
         * i5 Hello 5 i5+1 false
         */

        String name = "mgmg";

        do {
            System.out.println("Hello");
        } while (name.equals("admin"));

    }

}

/*
 * ST
 * do{
 * 
 * // STM
 * 
 * INC
 * 
 * }while(EN)
 * 
 */
