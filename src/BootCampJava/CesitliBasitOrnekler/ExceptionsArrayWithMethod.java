package BootCampJava.CesitliBasitOrnekler;

import java.util.Scanner;

public class ExceptionsArrayWithMethod {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter rowIndex:");
        int rowIndex=scanner.nextInt();
        System.out.println("Please enter columnsIndex:");
        int columnsIndex=scanner.nextInt();
        System.out.println(giveMeValue(rowIndex,columnsIndex));
    }

    public static String giveMeValue(int rowIndex,int columnsIndex){
        String result="";
        int[][]myarray={
                {1,2,3,34,234,1234,15,},
                {1,2,3,4,5,6},
                {90,89,678,5678,456,34},
                {56,5678,34,12,120,},
        };
        try{
        result=result+myarray[rowIndex][columnsIndex];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index bound (s exceeded)");
        }

        return result;
    }
}
