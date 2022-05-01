package lesson_6_Data_Type;

public class Lesson_1 {

    public static void main(String[] args) {

        // Number Only
        byte a = 127; // 8 Bit , 1 Bytes
        short b = 12345; // 16 Bit , 2 Bytes
        int c = 1234567890; // 32 Bit , 4 Bytes
        long d = 1234567890123456789L; // 64 Bit , 8 Bytes

        // Floating point number
        float e = 12345678901234567891234567890123456789.4F; // 32 Bit , 4 Bytes
        double du = 1234567890123456789123456789012345678912345678901234567891234567890123456789.52; // 64 Bit , 8 Bytes

        boolean boo = true; // (or false)

        char ch = 'a'; // One Character

        String st = "Hello Java";

        System.out.println(e);

    }

}

// System.out.println(Long.MAX_VALUE);
// System.out.println(Long.MIN_VALUE);
// System.out.println(Long.SIZE);
// System.out.println(Long.BYTES);