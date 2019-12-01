package BootCampJava.CesitliBasitOrnekler;

/* 1-create an integer 10x10 array and put values from 1 to 100.
   2-print sum of all rows
   3-print sum of all columns
   4-print visiable by 4
   5-print number as triangle

 */

public class ArrayTenbyTen {
    public static void main(String[] args) {
        int numbers[][]=new int[10][10];
        int number=1;
        int sumrows=0;
        int sumcolumns=0;

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                numbers[i][j]=number;
                number++;
                sumrows=sumrows+numbers[i][j];

                System.out.printf("%4d",numbers[i][j]);





            }
            System.out.print("  Sumrows="+sumrows);
            System.out.println();
        }







    }
}


