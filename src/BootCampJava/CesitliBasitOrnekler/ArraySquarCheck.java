package BootCampJava.CesitliBasitOrnekler;

public class ArraySquarCheck {
    public static void main(String[] args) {

        int[][] myArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9,}
        };
        System.out.println(isSuquar(myArray));

    }

    public static boolean isSuquar(int array[][]){

        boolean square=true;
        for(int i=0;i<array.length;i++){
            if(array.length!=array[i].length){
                square=false;
            }
        }
        return square;

    }
}
