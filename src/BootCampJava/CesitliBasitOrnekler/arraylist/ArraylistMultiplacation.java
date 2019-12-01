package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistMultiplacation {
    public static void main(String[] args) {
        ArrayList<Integer>array1=new ArrayList<Integer>(Arrays.asList(2,3,4,5,6));
        ArrayList<Integer>array2=new ArrayList<Integer>(Arrays.asList(3,4,5,6,7));
        multiplicationTwoArraylist(array1,array2);

    }
    public static void multiplicationTwoArraylist(ArrayList<Integer>arr1,ArrayList<Integer>arr2){

        for(int i=0;i<arr1.size();i++){

            System.out.print(arr1.get(i)*arr2.get(i));
        }


    }
}
