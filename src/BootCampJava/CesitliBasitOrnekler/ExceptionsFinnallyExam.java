package BootCampJava.CesitliBasitOrnekler;
/* Write a methods to convert any 2 dimensional array rows as columns and columns as rows.Your code should be able to handle
with different size sub array
for every condition should be " Hello Word"
simple
input{{3,4,5},{1,2}}
 */

public class ExceptionsFinnallyExam {
    public static void main(String[] args) {
        int[][]myarray={
                {1,2},
                {3,4,5,6}
        };
        int[][]result=convertarray(myarray);
        for(int i=0;i<result.length; i++){

            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();

        }


    }

    public static int[][] convertarray(int array [][]){
        int [][] converted=new int[array[0].length][array.length];

        try {

        for(int i=0;i<array.length; i++){

            for(int j=0;j<array[i].length;j++){

                converted[j][i]=array[i][j];
            }
        }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception");

        }finally {
            return converted;
        }


    }

}
