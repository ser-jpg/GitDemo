package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayListRemoveDublicateNumber1 {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>(Arrays.asList("Java","C++","Phoyton","Java","C","JPS","C++"));

        System.out.print("ArrayList With Duplicate Elements :");

        System.out.println(list);
        HashSet<String> set=new HashSet<>(list);
        ArrayList<String> list1=new ArrayList<>(set);

        System.out.println(list1);



    }
}
