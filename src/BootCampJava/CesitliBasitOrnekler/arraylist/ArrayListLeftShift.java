package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLeftShift {

    public static  void leftShift(ArrayList<Integer> arr,int left){

        for(int i=0;i<left;i++){

            arr.remove(i);
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(12,23,45,78,89,456,1235,45,12,78,96,36,2));
        leftShift(list,5);
    }
}
