package BootCampJava.CesitliBasitOrnekler;

public class ArrayFindMin {
    public static int findMinValue(int array[]){


        int container=array[0];
        for(int i=1;i<array.length;i++){

            if(container<array[i]){

                container=array[i];
            }
        }
        return container;
    }

    public static void main(String[] args) {
        int myarray[]={12,32,345,21,34,0,9};
        int min=findMinValue(myarray);
        System.out.println("Min Value="+min);
    }
}
