package lesson_33_Interface.addon_6_multi;

public interface Sms {

    public void smsAction(String sms);

    default void opt() {
        System.out.println("Send OTP");
    }

}
