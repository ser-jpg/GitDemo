package BootCampJava.CesitliBasitOrnekler;

public class ExceptionsMultipleCatch {
    public static void main(String[] args) {

        int []arr=new int[4];

        try{
            arr[5]=14/0;

        }
        catch (ArithmeticException e){
            System.out.println("Aritmatic Exception");



        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Array Index Issue");
        }
        catch (Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("You must shoe go on");
    }
}
