package BootCampJava.CesitliBasitOrnekler;

import java.util.Scanner;

public class ArrayEvenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number[]=new int[5];
        for(int i=0;i<number.length;i++){
            System.out.println("Enter numbers:");
            number[i]=scanner.nextInt();
        }
        int even_nember=0;
        for(int i=0;i<number.length;i++){
            if(number[i]%2==0){
                even_nember++;
            }


        }
        System.out.println("There are "+even_nember+" even number in your array");
    }
}
