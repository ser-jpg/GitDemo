package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemovingSpecial {

    public static void checkLetter(ArrayList<String> arr){



        for(int i=0;i<arr.size();i++){

            if(!arr.get(i).contains("a")&&!arr.get(i).contains("i")){
                System.out.println(arr.get(i));



            }
        }

    }
    public static boolean checkABI(String str){

       boolean check=false;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='a'||str.charAt(i)=='b'||str.charAt(i)=='i'){
               check=true;

           }
       }
       return check;

    }

    public static void checkWithoutABI(ArrayList<String> arr){

        for(String str:arr){
            if(!checkABI(str)){
                System.out.println(str);

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<String >(Arrays.asList("abc","klm","ids"));
        //checkLetter(list);
        checkWithoutABI(list);
    }
}
