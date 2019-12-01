package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMaxMinFind {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        double rand;
        for(int i=0;i<20;i++){
            rand=Math.random()*50;
            arr.add((int)rand);

        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(0));// minumum sayi
        System.out.println(arr.get(arr.size()-1));// max sayi
        System.out.println(arr.get(arr.size()/2));// midle sayi


        for(int i=arr.size()-3;i<arr.size();i++){

            System.out.println(arr.get(i));
        }



    }
}
