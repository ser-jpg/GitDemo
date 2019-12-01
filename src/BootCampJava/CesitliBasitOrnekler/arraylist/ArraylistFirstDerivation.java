package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistFirstDerivation {

    public static void fistDerivation(ArrayList<Integer> arr){

        ArrayList<Integer> newArr=new ArrayList<>();

        for(int i=0;i<arr.size()-1;i++){

            newArr.add(arr.get(i)-arr.get(i+1));
        }
        System.out.println(newArr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(10,50,30,40));
        fistDerivation(list);
    }
}
