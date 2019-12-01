package Fonksiyonlar;

import java.util.Scanner;

public class ObebBulma {
    public static void main(String[]args){


        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayiyi gir:");
        int birincisayi=scanner.nextInt();
        System.out.println("ikinci sayiyi gir:");
        int ikincisayi=scanner.nextInt();
        int obeb=1;
        for(int i=2;i<=birincisayi&&i<=ikincisayi;i++){
            if(birincisayi%i==0&&ikincisayi%i==0){


                obeb=i;

            }


        }
        System.out.println("Iki sayinin obebi :"+obeb+ " dir");

    }
}
