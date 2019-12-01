package Fonksiyonlar;

import java.util.Scanner;

public class FonkIleObeb {

    public static int obebibul(int a,int b){
        int obeb=1;


        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                obeb=i;

            }

        }
        return (obeb);
    }
    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);


        for(int i=1;i<5;i++) {
            System.out.println("Birinci Sayiyi girin:");
            int a = scanner.nextInt();
            System.out.println("Ikinci sayiyi girin :");
            int b = scanner.nextInt();
            System.out.println("Obeb=" + obebibul(a, b));
        }
    }
}
