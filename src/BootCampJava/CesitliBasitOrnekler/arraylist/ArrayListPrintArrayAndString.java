package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrintArrayAndString {

    public static String reverseString(String str){

        String newStr="";
        for(int i=str.length()-1;i>=0;i--){

            newStr=newStr+str.charAt(i);
        }
        return newStr;
    }

    public static void reverseArrayList(ArrayList<String>arr){
        ArrayList<String> reverse=new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            reverse.add(reverseString(arr.get(i)));

        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<String >(Arrays.asList("abc","def","klm"));
        reverseArrayList(list);
    }
}
