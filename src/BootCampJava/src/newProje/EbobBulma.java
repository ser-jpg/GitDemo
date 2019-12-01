package newProje;

import java.util.Scanner;

public class EbobBulma {
    public static int ebobbulma(int sayi1,int sayi2){
        int ebob=1;

        for(int i=1;i<=sayi1&& i<=sayi2;i++){
            if(sayi1%i==0 &&sayi2%i==0){
                ebob=i;
                System.out.println(ebob);

            }
        }
        return (ebob);


    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayiyi gir =");
        int sayi1=scanner.nextInt();
        System.out.println("Ikinci sayiyi gir =");
        int sayi2=scanner.nextInt();
        System.out.println("Bu iki sayinin ebob lari="+ebobbulma(sayi1,sayi2));
    }

}
