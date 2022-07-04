package lesson_35_Static_Final.static_pj;

public class Info {

    static int i = 0;

    Info() {
        i++;
    }

    public static void main(String[] args) {
        System.out.println(new Info().i);
        System.out.println(new Info().i);
        System.out.println(new Info().i);

    }

}
