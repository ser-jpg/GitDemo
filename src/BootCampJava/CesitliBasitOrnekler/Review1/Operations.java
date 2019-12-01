package BootCampJava.CesitliBasitOrnekler.Review1;

public class Operations {
    public static void main(String[] args) {
        System.out.println(docalculations(3,4,"divide"));



    }
    public static double docalculations(int a,int b,String operation){
        double result=0;
        if(operation.equals("add")){

            result=a+b;
        }
        else if(operation.equals("subtract")){

            result =a-b;
        }
        else if(operation.equals("multiply")){
            result=a*b;
        }
        else if(operation.equals("divide")){
            try{
                result=a/b;
        }
            catch (ArithmeticException e){
                System.out.println("Division by zero");
            }

            }
        else{
            System.out.println("Operation is incorrect...");
        }


        return result;
    }
}
