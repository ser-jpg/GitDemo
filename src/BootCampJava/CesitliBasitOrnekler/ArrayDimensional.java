package BootCampJava.CesitliBasitOrnekler;
/*
data type [][] array name initialization example for integer 2 dimensional array
int arrint [][]={{1,2},{3,5}}
initialization for string 2 dimensional

String array [][]={{"a","b"},{"c","d"}}
 */

public class ArrayDimensional {

    public static void main(String[] args) {

        int mynumber[][]={{1,2,3,4},{5,6,7,}};
        for(int i=0;i<mynumber.length;i++){
            for(int j=0;j<mynumber[i].length;j++){

                System.out.println(mynumber[i][j]);
            }
        }
    }
}
