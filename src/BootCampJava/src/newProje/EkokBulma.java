package newProje;

import java.util.Scanner;

public class EkokBulma {
    public static int ekokbulma(int sayi1,int sayi2){
        int ekok=1;

        for(int i=10000;i>sayi1&&i>sayi2;i--){
            if(i%sayi1==0&&i%sayi2==0){
                ekok=i;
            }

        }
        return (ekok);
    }
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayiyi gir =");
        int sayi1=scanner.nextInt();
        System.out.println("ikinci sayiyi gir");
        int sayi2=scanner.nextInt();
        System.out.println("Bu iki sayinin ekoklari="+ekokbulma(sayi1,sayi2));
    }
}
