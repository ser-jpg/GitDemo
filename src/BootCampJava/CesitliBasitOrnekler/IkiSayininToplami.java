package BootCampJava.CesitliBasitOrnekler;

import java.util.Scanner;

public class IkiSayininToplami {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");

        int sayi1=scanner.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz:");
        int sayi2=scanner.nextInt();
        int toplam=sayi1+sayi2;
        System.out.println("Toplam="+toplam);*/

        /*int toplam=0;

        for(int i=1;i<=100;i++){
            if(i%2==0){
            toplam+=i;
            }


        }
        System.out.println("Sayilarin Toplami="+toplam);*/

        Scanner scanner=new Scanner(System.in);
            System.out.print("Bir sayi giriniz:");
            int sayi = scanner.nextInt();
        /*int toplam=0; ;
        for(int i=1;i>0;i++){
            if(sayi!=0){
        toplam+=(sayi%10);
        sayi/=10;

            }


        }
        System.out.println(toplam);*/
            int faktoriyel = 1;

            while (sayi > 0) {

                faktoriyel = faktoriyel * sayi;
                sayi--;
            }

        System.out.println(faktoriyel);


    }


}
