package BootCampJava.CesitliBasitOrnekler;
/*
write a java methods to find common elements given 2 array
sample:{1,2,3,4,5,6,7,8,9}  {5,7,12,4,55,67,99}
output:5,7,4

iki farkli yolla cozuldu.
 */

public class ArrayCommon {

    public static void main(String[] args) {
        int array1[]={1,2,3,4,5,6,7,8,9};
        int array2[]={5,7,12,4,55,67,99};
        findcommonNumber(array1,array2);




        for(int i=0;i<array1.length;i++){

           for(int j=0;j<array2.length;j++){
               if(array1[i]==array2[j]){
                   System.out.println(array1[i]);

               }
           }

        }



    }
    public static void findcommonNumber(int array1[],int array2[]){
        for(int i=0;i<array1.length;i++){

            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.println(array1[i]);

                }
            }

        }



    }
}

