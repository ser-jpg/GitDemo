package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSort {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(42);
        list.add(23);
        list.add(15);
        list.add(56);
        list.add(35);
        sort(list);
    }
    public static void sort(ArrayList<Integer> arr){

        System.out.println("Write array before sort... ");



        System.out.println(arr);

        Collections.sort(arr);
        System.out.println("Write array after sort...");

        System.out.println(arr);
    }
}
