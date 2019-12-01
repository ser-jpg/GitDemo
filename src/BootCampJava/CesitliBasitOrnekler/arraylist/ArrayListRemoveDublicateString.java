package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveDublicateString {

    public static void removeDublicateString(ArrayList<String> array){

        ArrayList<String > newArray=new ArrayList<>();

        for(int i=0;i<array.size();i++){

            if(!newArray.contains(array.get(i))){

                newArray.add(array.get(i));
            }
        }
        System.out.println(newArray);
    }

    public static void main(String[] args) {
        ArrayList<String> test=new ArrayList<String>(Arrays.asList("Serkan","Abbas","Kezban","Serkan","Ali"));
        removeDublicateString(test);
    }
}
