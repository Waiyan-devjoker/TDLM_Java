package lesson_7_Operators;

public class Lesson_3 {

    public static void main(String[] args) {
        // Logical Operators

        /*
         * Login
         * 
         * Phone or Email = info@gamil.com
         * Password = 12345
         * OTP = 1675
         */

        String email = "info@gmail.com";
        short sh = 12345;
        int in = 1675;

        boolean bo = email == "info@gmail.com" && sh == 12345 && in == 1675;

        System.out.println(bo);

        // Phone or Email = info@gmail.com / 0977788823

        String email_2 = "0977788823";

        boolean bol = email_2 == "info@gmail.com" || email_2 == "0977788823";

        System.out.println(bol);

        // boolean b1 = false;

        // if (!b1) {
        // System.out.println("OK");
        // }

    }

}
