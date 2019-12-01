package BootCampJava.CesitliBasitOrnekler;
/*Write a method to display max value of each row in a 2-dimensional array​
Write a method to display min value of each row in a 2-dimensional array​
Write a method to diplay  max difference of each row in a 2-dimensional array

 */

public class ArrayMinMaxDiffMax {
    public static void main(String[] args) {
        int[][] myArray = {
                {12,4324,23453,5345,436,46,456,4576,5475675,86,8768,4},
                {2,53,53,53,4534,543,654,654,65,756,756,7,46,567,8,7698},
                {456,457,576,8678,768,7689,789,8,909,9,322,87,56},
                {44,23423432,5345,46546756,75678,768,679,789,789,67856,78},
                {36,646,7567,567,5678,568,46,52452,35423,423,43,5435,435,43534,566}
        };
        int result[][]=maxminDiff(myArray);
        for(int i=0;i<myArray.length;i++){
            System.out.println("Max:"+result[i][0]+" Min:"+result[i][1]+" Max Different:"+result[i][2]);

        }

    }
    public static int[][] maxminDiff(int array[][]){

        int result[][]=new int[array.length][3];
       int maxvalue;
       int minvalue;
       int maxDiff;



        for(int i=0; i<array.length;i++){

            maxvalue=array[i][0];
            minvalue=array[i][0];

            for (int j=0;j<array[i].length;j++){
                if(array[i][j]>maxvalue){
                    maxvalue=array[i][j];
                }
                if(array[i][j]<minvalue){
                    array[i][j]=minvalue;
                }

            }
           maxDiff=maxvalue-minvalue;
            result[i][0]=maxvalue;
            result[i][1]=minvalue;
            result[i][2]=maxDiff;



        }
        return result;
    }
}
