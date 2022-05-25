package lesson_15;

public class Lesson_1 {

    public static void main(String[] args) {
        
        // String st = "12/OoKaTa(N)223344";

        //String result_1 = st.substring(3);
        //String result_2 = st.substring(3,9);

        //String result_3 = st.toLowerCase();
        //String result_4 = st.toUpperCase();

        //String result_5 = st.replace("a", "i");
        //String result_6 = st.replaceFirst("a", "i");

        String st1 = "DEV-002"; // ADV/2022/03/00235
        // APL-012 , ORG-003
        String result_7[] = st1.split("");

        System.out.println("Dep : "+result_7[0]);
        System.out.println("ID : "+result_7[1]);
        System.out.println("Length : "+st1.length());




    }
    
}
