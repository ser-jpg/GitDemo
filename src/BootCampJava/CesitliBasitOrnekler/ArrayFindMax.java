package BootCampJava.CesitliBasitOrnekler;

public class ArrayFindMax {
    public static int findmaxvalue(int array[]){
        int container=array[0];

        for(int i=1;i<array.length;i++){
            if(container<array[i]){

                container=array[i];

            }
        }
        return container;

    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,1235874,54,65,6676,98076};
        int max=findmaxvalue(array);
        System.out.println(max);
    }
}
