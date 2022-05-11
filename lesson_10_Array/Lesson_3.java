package lesson_10_Array;

import java.util.Arrays;

public class Lesson_3 {

    public static void main(String[] args) {
        // Index 0 1 2 3 4
        int i[] = { 200, 500, 100, 800, 400, 600 };
        // Length 1 2 3 4 5
        // System.out.println(i[2]);
        // System.out.println(i.length);
        int copyAry[] = Arrays.copyOfRange(i, 1, 5);

        // System.out.println(Arrays.toString(copyAry));

        int systemCopy[] = new int[5];

        int org[] = { 200, 500, 100, 800, 400, 600, 900, 1000 };
        System.arraycopy(org, 2, systemCopy, 0, 5);
        // sysCopy [0,100,800,400] [100,800,400,600]

        System.out.println(Arrays.toString(systemCopy));

        // st [007,008] -> [100,800,400] - [007,008,100,800,400]

    }

}
