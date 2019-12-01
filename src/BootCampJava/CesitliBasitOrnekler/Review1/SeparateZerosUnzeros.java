package BootCampJava.CesitliBasitOrnekler.Review1;

public class SeparateZerosUnzeros {
    public static void main(String[] args) {
        int[]array={0,4,8,0,5,4,0,6,3,8,0};
        separateZerosUnzeros(array);

    }

    public static void separateZerosUnzeros(int[]array){



        int index=0;

        for(int i=0;i<array.length;i++){

            if(array[i]!=0){


                System.out.print(array[i]);
                index++;
            }
        }
        while (index<array.length){

            System.out.print(0);
            index++;
        }

    }

}
