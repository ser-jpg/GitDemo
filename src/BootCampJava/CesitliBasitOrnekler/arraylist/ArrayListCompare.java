package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCompare {

    public static boolean compare (ArrayList<Integer>arr1,ArrayList<Integer>arr2){

            boolean equal=true;

            if(arr1.size()!=arr2.size()){
                equal=false;

            }
            else{
                for(int i=0;i<arr1.size();i++){

                    if(!arr2.contains(arr1.get(i))){

                        equal=false;
                    }
                }
            }
            return equal;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(1,2,3));
        System.out.println(compare(list1,list));
    }
}
