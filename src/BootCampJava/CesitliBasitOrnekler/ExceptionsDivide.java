package BootCampJava.CesitliBasitOrnekler;

public class ExceptionsDivide {

    public static double dividetwonumber(int a,int b){

        double result=0;

      try {



        result=a/b;
      }catch (ArithmeticException e){
         System.out.println("Division by zero is not passible, Please try again..");

      }

        return result;

    }

       public static void main(String[] args) {

        System.out.println(dividetwonumber(8,0));
    }
}
