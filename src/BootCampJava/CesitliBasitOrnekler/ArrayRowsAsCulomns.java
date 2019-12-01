package BootCampJava.CesitliBasitOrnekler;

public class ArrayRowsAsCulomns {
    public static void main(String[] args) {
        int[][] inputarray={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int[][]outputarry=returncolumnsasrow(inputarray);
        for(int i=0;i<outputarry.length;i++){
            for(int j=0;j<outputarry[i].length;j++){
                System.out.print(outputarry[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int[][] returncolumnsasrow(int [][]array){
        int [][]result =new int[array[1].length][array.length];//array[].lenght paramtex icine ister 0 yaz ister 1 yaz farketmez.
        for(int i=0;i<array.length;i++){

            for(int j=0;j<array[i].length;j++){

                result[j][i]=array[i][j];

            }
        }
        return result;



    }
}
