package stack;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    // bir cumlenin plandrome olup olmadigini bulma. EX: kasaylabalyasak
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

       while(true) {
           System.out.println("Bir cumle giriniz:");
           String cumle = scanner.nextLine();


           Stack<Character> stack = new Stack<Character>();


           for (int i = 0; i < cumle.length() / 2; i++) {

               stack.push(cumle.charAt(i));
           }
           if (isPlondrome(cumle, stack)) {

               System.out.println("Bu cumlemiz plindrome dir...");
           } else {
               System.out.println("Bu cumlemiz plindrome degildir...");
           }

       }
    }
    public static boolean isPlondrome(String cumle,Stack<Character>stack){

        for(int i=cumle.length()/2+1;i<cumle.length();i++){

            if(cumle.charAt(i)!=stack.pop()){
                return false;
            }
        }
        return true;
    }
}
