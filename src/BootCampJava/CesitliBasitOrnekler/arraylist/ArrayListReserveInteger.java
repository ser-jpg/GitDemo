package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReserveInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(12,34,56,76,98,90,123,54,654));
        reverseInteger(list);

    }
    public static void reverseInteger(ArrayList<Integer> arr){

        System.out.println("Before ArrayList Reserve...");
        System.out.println(arr);
        System.out.println("*******************************");
        Collections.reverse(arr);
        System.out.println("After ArrayList Reserve.....");
        System.out.println(arr);

    }
}
