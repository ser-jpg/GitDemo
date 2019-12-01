package MentorQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Uniqueletters {

    public static void main (String[]args){
        Scanner letter = new Scanner(System.in);


        System.out.println("Please enter a word: ");
         String word= letter.nextLine();

        removeLetter(word);
    }

    public static void removeLetter(String test){
        String temp = "";
        for (int i = 0; i < test.length(); i++){
            if (temp.indexOf(test.charAt(i)) == - 1){
               temp = temp + test.charAt(i);

            }

        }

        System.out.println(temp + " ");

    }





}
