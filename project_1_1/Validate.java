package project_1_1;

public class Validate {

    public double Valid(double num1, double num2 , String opt){
        double result = 0;

        if(opt.equals("+")){
            result = num1 + num2;
        }else if(opt.equals("-")){
            result = num1 - num2;
        }

        return result;
    }
    
}
