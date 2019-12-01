package BootCampJava.CesitliBasitOrnekler;

import java.util.Scanner;

public class ArrayNumberOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number[]=new int[5];

        for(int i=0;i<number.length;i++){
            System.out.println("Enter array number:");
         number[i]=scanner.nextInt();

        }
        int numberodd=0;
        for(int i=0;i<number.length;i++){
            if(number[i]%2==1){

                numberodd++;
            }
        }
        System.out.println("There are" +numberodd+ "odd number of your array");
    }
}
