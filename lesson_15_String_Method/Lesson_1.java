package lesson_15_String_Method;

public class Lesson_1 {

    public static void main(String[] args) {
        
        // String st = "12/OoKaTa(N)223344";

        //String result_1 = st.substring(3);
        //String result_2 = st.substring(3,9);

        //String result_3 = st.toLowerCase();
        //String result_4 = st.toUpperCase();

        //String result_5 = st.replace("a", "i");
        //String result_6 = st.replaceFirst("a", "i");

        // String st1 = "DEV-002"; // ADV/2022/03/00235
        // // APL-012 , ORG-003
        // String result_7[] = st1.split("");

        // System.out.println("Dep : "+result_7[0]);
        // System.out.println("ID : "+result_7[1]);
        // System.out.println("Length : "+st1.length());


        // 0231-ADV-2022-04  SQ-TYPE-YEAR-Month
        String adv = "0231-ADV-2022-04";
        String result[] = adv.split("-");

        // System.out.println("SQ : "+ result[0]);
        // System.out.println("Year : "+ result[2]);
        // System.out.println("Month :" + result[3]);
        // System.out.println("Type : "+ result[1]);

        // 12/OoKaTa(N)222333 NRC number only
        String nrc = "12/OoKaTa(E)222333";
        String nrc_rec[] = nrc.split("\\(E\\)");
        // String nrc_2 [] = nrc_rec[0].split("/");
    
        //System.out.println(nrc_rec[1]);

        String name = " Hello World ";

        System.out.println(name.trim());








    }
    
}
