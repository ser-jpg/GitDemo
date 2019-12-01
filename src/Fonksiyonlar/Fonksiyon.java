package Fonksiyonlar;

import java.util.Scanner;

public class Fonksiyon {

    public static void faktoriyel(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        double sayi=scanner.nextDouble();
        double faktoriyel=1;
        while ((sayi>0)){


            faktoriyel*=sayi;
            sayi--;

        }
        System.out.println(faktoriyel);
    }
    public static void main(String[]args){

        faktoriyel();
    }
}
