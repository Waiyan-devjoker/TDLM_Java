package lesson_10_Array;

import java.util.Arrays;

public class Lesson_4_HW {

    public static void main(String[] args) {

        // Python CSS HTML Odoo
        String org[] = { "Java", "Python", "CSS", "HTML", "Odoo", "Flutter" };
        String systemCopy[] = new String[4];

        System.arraycopy(org, 3, systemCopy, 0, 2);
        // sysCopy [0,Python,CSS,HTML,Odoo]

        System.out.println(Arrays.toString(systemCopy));

    }

}
