package BootCampJava.CesitliBasitOrnekler;

public class ExceptionArrayAndMath {
    public static void main(String[] args) {

        int [] myarray={1,2,3,4,5,6};

        try{
            myarray[9]=5/0;


        }
        catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Array index exceeded");
        }
        System.out.println("You must show or not");
    }
}
