package newProje;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1;
        do {
            System.out.print("Please enter a year :");
            int year = scanner.nextInt();
            if (year % 4 == 0 && year % 400 == 0 && year != 100) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not Leap year");
            }
            i++;
        }while (i<=3);
        if(i>3){
            System.out.println("Yoruldum artik isleminizi yapmiyorum");
        }


    }
}

