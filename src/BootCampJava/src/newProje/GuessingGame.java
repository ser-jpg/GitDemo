package newProje;
/* Number guessing game:
...creat a variable and assign any integer number
...Ask from users to guess that number
...if input number is larger than variable value than print "Larger try again"
...if input number is less than variable value than print " Smaller try again"
....if they are equal than print than print "Congrats"
*/

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[]args){
        System.out.println("************************");
        System.out.println("Welcome guessing game...");
        System.out.println("*************************");
        int keep_number=578;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please guess a number:");




        while(true) {
            int number =scanner.nextInt();

            if(number>keep_number){
                System.out.println("Larger try again");
            }
            else if(number<keep_number){
                System.out.println("Smaller try again");

            }
            else{
                System.out.println("Congrats");
                break;
            }






        }







    }
}
