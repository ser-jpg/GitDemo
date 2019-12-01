package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AsalSayiBulma {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){

        System.out.println("Please eneter a number:");

        int number=scanner.nextInt();
        System.out.println(asalsayibul(number));
        }

    }
    public static int asalsayibul(int number){

        for(int i=2;i<number;i++){

            if(number%i==0){
                System.out.println("Asal sayi degil");
                break;
            }
            else {
                System.out.println("Asal sayi");
                break;


            }
        }
        return number;
    }
}
