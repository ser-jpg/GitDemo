package BootCampJava.CesitliBasitOrnekler;

import java.util.Scanner;

public class StringExcersize {

    private static void writeToBottom(String word){
        for(int i=0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }

    }
    private static void writeBackward(String word){
        for(int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }



    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a String:");
        String inputString=scanner.nextLine();
        StringExcersize.writeBackward(inputString);

    }
}
