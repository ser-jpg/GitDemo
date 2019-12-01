package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>(Arrays.asList("Gold","Iron","Copper","Silver","Nickel","Cobalt","Zinc"));

        reverseString(list);
    }

    public static void reverseString(ArrayList<String> arr){


        System.out.println("Write ArrayList Before Reverse...");
        System.out.println(arr);
        //Reversing the list using Collections.reverse() method
        Collections.reverse(arr);
        //Printing list after reverse
        System.out.println("Write Arraylist After Reverse");
        System.out.println(arr);


    }


}
