package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi;

/*
Bir sayının Mükemmel bir sayı olup olmadığını bulan metod yaz.
Mükemmel sayı : Mükemmel sayı, sayılar teorisinde, kendisi hariç
pozitif tam bölenlerinin toplamı kendisine eşit olan sayı. Diğer bir ifadeyle, bir mükemmel sayı,
bütün pozitif tam bölenlerinin toplamının yarısına eşittir. 6=> 1 2 3 Mükemmel sayıdır.
 */

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<10;i++){
        System.out.println("Please enter a number:");
        int number=scanner.nextInt();
        perfectNumber(number);
        }

    }
    public static int perfectNumber(int number){
        int toplam=0;

        for(int i=1;i<number;i++){

            if(number%i==0) {
                toplam = toplam + i;

            }

        }
        if (number == toplam) {
            System.out.println("Girdiginiz bu " + number + " sayisi mukemmel bir sayidir");

        }
        else{
            System.out.println("Mukemmel sayi degil tekrar girin...");
        }

        return number;





    }
}
