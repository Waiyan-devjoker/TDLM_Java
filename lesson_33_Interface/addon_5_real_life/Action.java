package lesson_33_Interface.addon_5_real_life;

public class Action {
    
    Show sh;

    Action (Show sh){
        this.sh = sh;
    }

    public void result(){
        sh.sms("Hello SMS");
    }

}
