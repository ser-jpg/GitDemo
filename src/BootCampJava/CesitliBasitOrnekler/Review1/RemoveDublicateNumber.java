package BootCampJava.CesitliBasitOrnekler.Review1;

public class RemoveDublicateNumber {

    public static void main(String[] args) {
        int []array={1,2,3,3,4,5,4,5};
        removeDuplicates(array);

    }

    public static void removeDuplicates(int[]arr){

        int[] emptyArr=new int[arr.length];
        boolean exist=true;

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<emptyArr.length;j++){

                if(arr[i]==emptyArr[j]){
                    exist=false;
                }
                if(exist){
                    emptyArr[i]=arr[i];
                }
            }


        }
        for(int element:emptyArr){

            System.out.println(element);
        }
    }




}
