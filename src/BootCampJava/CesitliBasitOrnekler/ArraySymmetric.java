package BootCampJava.CesitliBasitOrnekler;
/* write a java methods to check whether given array symmetric or not
sample: {1,2,3,3,2,1}
Array is symmetric
{1,2,3,4,2,3}

array is not symmetric

 */


public class ArraySymmetric {
    public static boolean findSymmetric(int array[]){
        boolean result=true;
        int index=array.length-1;

        for(int i=0;i<array.length;i++){
        if (array[i] ==array[index]) {
            result =true;

        }
        else{
            result=false;

        }
        index--;

        }
        return result;



    }

    public static void main(String[] args) {
        int myarray[]={1,2,3,2,1};
        boolean symmetric=findSymmetric(myarray);
        System.out.println(symmetric);
    }

}
