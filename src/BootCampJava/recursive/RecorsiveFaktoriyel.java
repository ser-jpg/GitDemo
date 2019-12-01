package BootCampJava.recursive;

import java.util.Scanner;

public class RecorsiveFaktoriyel {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while (true){
        System.out.println("Please enter a number:");
        int number=scanner.nextInt();

        System.out.println(number+"!="+fakt(number));
        }


    }
    public static int fakt(int x){
        if(x==1) return 1;

        return x*fakt(x-1);


    }
}
