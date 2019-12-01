package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveDublicateNumber {
    public static void removedublicate(ArrayList<Integer> arr){

      ArrayList<Integer> newArr=new ArrayList<>();

      for(int i=0;i<arr.size();i++){


          if(!newArr.contains(arr.get(i))){

              newArr.add(arr.get(i));


          }
      }
        System.out.println(newArr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,6,5,5,9,8,7,10));
        removedublicate(arrayList);

    }
}
