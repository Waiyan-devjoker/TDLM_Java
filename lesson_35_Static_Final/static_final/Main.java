package lesson_35_Static_Final.static_final;

public class Main {

    String name = "Admin";
    static int i = 200;
    final String db_name = "my_database";
    final String db_pass = "admin!@#";
    final String db_port = "8080";
    final String db_url = "http://waiyan.com:8080/db";

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.name);
    }

    Main() {
        System.out.println("Hello");
        // System.out.println(name);
        // System.out.println(i);
        System.out.println(db_name);
    }

}
