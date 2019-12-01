package BootCampJava.CesitliBasitOrnekler.Review1;

public class CommenElement {
    public static void main(String[] args) {
        int []array1={1,2,3,4,5,6,7};
        int[]array2={3,4,5,6,7,8,9};
        commentElement(array1,array2);


    }

    public static void commentElement(int []array1,int[] array2){




        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){

                if(array1[i]==array2[j]){

                    System.out.print(array1[i]);
                }
            }

        }
    }
}
