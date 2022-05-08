package lesson_10_Array;

import java.util.Arrays;

public class Lesson_2 {

    public static void main(String[] args) {

        String st[] = new String[4];

        st[0] = "Java";
        st[1] = "Python";
        st[2] = "Python";

        // st[4] = "PYthon";

        System.out.println(st[3]);

        // Index 0 1 2 3
        String st2[] = { "mgmg", "kyawkyaw", "susu", "tuntun" };

        System.out.println(st2[2]); // One Index
        System.out.println(st2.length); // Array Length
        System.out.println(Arrays.toString(st2)); // Array toString

    }

}
