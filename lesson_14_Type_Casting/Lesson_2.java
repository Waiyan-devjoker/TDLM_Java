package lesson_14_Type_Casting;

public class Lesson_2 {

    public static void main(String[] args) {

        String num1 = "100";
        String num2 = "200";

        int i1 = Integer.parseInt(num1);
        int i2 = Integer.parseInt(num2);

        double d1 = Double.parseDouble(num1);
        double d2 = Double.parseDouble(num2);

        int i = 100;

        double d4 = Double.parseDouble(i + "");

        String st1 = String.valueOf(i);

        // System.out.println(i + "");

    }

}
