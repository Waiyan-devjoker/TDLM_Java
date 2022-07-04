package lesson_33_Interface.addon_6_multi;

public class Main implements Click, Sms {

    public static void main(String[] args) {

        Show obj = new Show(new Main(), new Main());
        // new Main().clickAction("Main Click Action");
        obj.result();
        // new Main().clickAction("Main Click Action");
        // new Main().smsAction("Main SMS Actiion");

    }

    @Override
    public void smsAction(String sms) {
        System.out.println(sms);

    }

    @Override
    public void clickAction(String click) {
        System.out.println(click);

    }

}
