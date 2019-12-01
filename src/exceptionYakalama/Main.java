package exceptionYakalama;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        //int a=30/0;  //unchecked exception

       /* int[]a={1,2,3,4,5,6};
        System.out.println(a[6]);//unchecked exception*/

       try {
           int a=20/0;
       }
       catch (ArithmeticException e){

           System.out.println("Bir sayi sifira bolunumez");
       }











    }
}
