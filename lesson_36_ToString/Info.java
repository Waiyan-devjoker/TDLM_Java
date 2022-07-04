package lesson_36_ToString;

public class Info {

    private String name;
    private String email;
    private String age;

    Info() {
        Show obj = new Show();
        obj.method_1();
        obj.method_2();
        obj.method_3();
        obj.method_4();
        obj.method_5();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        // Show obj = new Show();
        // obj.method_1();
        // obj.method_2();
        // obj.method_3();
        // obj.method_4();
        // obj.method_5();
        return "For login WYM 20220407" + "\ngetName -> " + name + "\ngetEmail -> " + email;
    }
}
