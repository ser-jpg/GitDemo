package BootCampJava.CesitliBasitOrnekler.arraylist;

import java.util.ArrayList;

public class ArraylistConvertArray {

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6};
            ArrayList<Integer> myArr = new ArrayList<Integer>();
            for(int num : arr){
                myArr.add(num);
            }
            System.out.println(myArr);
        }
}
