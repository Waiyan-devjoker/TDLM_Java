package lesson_33_Interface.addon_6_multi;

public class Show {
    Click cli;
    Sms sms;

    Show(Click cli, Sms sms) {
        this.cli = cli;
        this.sms = sms;
    }

    public void result() {
        cli.clickAction("Click Action");
        sms.smsAction("SMS Action");
        sms.opt();
    }

}
