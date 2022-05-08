package lesson_11_Array_Multi_Dimensional;

import java.util.Arrays;

public class Lesson_1 {

    public static void main(String[] args) {

        int i1 = 10;

        int i2[] = { 10, 20, 30 }; // i2[1]

        int i3[][] = {
                { 40, 50, 60 },
                { 70, 80, 90, 10 }, // i3[1][2] [row][column]
                { 20, 30 }
        };

        System.out.println(i3[0][1]); // OneIndex
        System.out.println(i3.length); // All Lenght
        System.out.println(i3[1].length); // row lenght
        System.out.println(Arrays.deepToString(i3));
    }

}
