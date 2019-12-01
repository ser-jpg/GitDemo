package BootCampJava.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arraylist=new ArrayList<>();

        for(int i=0;i<100;i++){

            arraylist.add(i);

        }
        System.out.print(arraylist);

        printElementOfArrayList(arraylist);

        printWithIterator(arraylist);
    }
    public static void printElementOfArrayList(ArrayList<Integer> arr){

        for(int i=0;i<arr.size();i++){

            System.out.print(arr.get(i));
        }
    }
    public static void printWithIterator(ArrayList<Integer> arr){

        Iterator iterator=arr.listIterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }

}
