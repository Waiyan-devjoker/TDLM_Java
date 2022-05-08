package lesson_10_Array;

import java.util.Arrays;

public class Lesson_3 {

    public static void main(String[] args) {
        // Index 0 1 2 3 4
        int i[] = { 200, 500, 100, 800, 400 };
        // Length 1 2 3 4 5
        // System.out.println(i[2]);
        // System.out.println(i.length);
        int copyAry[] = Arrays.copyOfRange(i, 2, 6);

        int systemCopy[] = new int[4];

        int org[] = { 200, 500, 100, 800, 400, 600, 900, 1000 };
        System.arraycopy(org, 3, systemCopy, 2, 3);
        // sysCopy [0,0,800,500]

        System.out.println(Arrays.toString(systemCopy));

    }

}
