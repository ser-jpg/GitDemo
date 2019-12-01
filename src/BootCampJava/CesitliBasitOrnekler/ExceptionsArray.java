package BootCampJava.CesitliBasitOrnekler;

public class ExceptionsArray {
    public static void main(String[] args) {

        int[] a={12,23,34,45,56,67,78,89,90};

        try {
            System.out.println(a[10]);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("you just exceeded the index bound.Try again...");

            for(int i:a){
                System.out.println(i);
            }


        }
    }
}
