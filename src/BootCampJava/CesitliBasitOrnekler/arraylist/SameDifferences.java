package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SameDifferences {

    public static void sameDifferences(ArrayList<Integer> arr){

        ArrayList<Integer> differences=new ArrayList<>();

        for(int i=0;i<arr.size();i++){

            for(int j=i;j<arr.size();j++){
                if(i!=j){

                differences.add(arr.get(i)-arr.get(j));
                }
            }
        }
        System.out.println(differences);
        for(int i=0;i<differences.size();i++){
            for(int j=i;j< differences.size();j++){

                if(i!=j){
                    if(differences.get(i)==differences.get(j)){
                        System.out.println(differences.get(i));
                    }
                }
            }
        }


    }

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>(Arrays.asList(2,4,6));
        sameDifferences(list);
    }
}
