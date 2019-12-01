package BootCampJava.CesitliBasitOrnekler;
/* Cut in a half any given integer array with even number length and create 2 array
Sample: array={1,2,3,4,5,6,7,8,9}
{1,2,3,4,5}
{6,7,8,9}
 */

public class ArrayHalf {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};

        int array1[]={};
        int array2[]={};

        for(int i=0;i<array.length;i++){

            if(i<array.length/2){

                array1[i]=array[i];

            }
            else{
                array2[i]=array[i];

            }


        }
        for(int i=0;i<array.length/2;i++){
            System.out.println(array1[i]);
        }
        System.out.println();
        for(int j=0;j<array.length/2;j++){
            System.out.println(array2[j]);
        }




    }
}
