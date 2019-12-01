package BootCampJava.CesitliBasitOrnekler;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("Please enter a String word:");
            String word = scanner.nextLine();
            if (word.equals(returnReverse(word))) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }




    }
    public static String returnReverse(String word){

        String reserve="";
        for(int i=word.length()-1;i>=0;i--){
            reserve=reserve+word.charAt(i);

        }
        return reserve;
    }


}
