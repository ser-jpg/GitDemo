package kendiIterableSinifimiz;

import java.util.Scanner;

public class MainKumanda {

    public static void main(String[] args) {

        System.out.println("Kumanda programina hos geldiniz.");
        Scanner scanner=new Scanner(System.in);
        String islemler="islemler\n"
                        +"1. kanallari goster\n"
                        +"2. kanal ekle\n"
                        +"3.kanal sil\n"
                        +"4.kanal sayisi ogren\n"
                        +"cikis icin q ya basin...";

           Kumanda kumanda=new Kumanda();
         while (true){
             System.out.println(islemler);
             System.out.println("islem giriniz:");
             String islem=scanner.nextLine();

             if(islem.equals("q")){
                 System.out.println("programdan ciktiniz...");
                 break;
             }
             else if(islem.equals("1")){
                 kanallariGoster(kumanda);


             }
             else if(islem.equals("2")){

                 System.out.println("Eklenecek kanal ismi:");
                 String isim=scanner.nextLine();
                 kumanda.kanalEkle(isim);
             }
             else if(islem.equals("3")){

                 System.out.print("silinecek kanal ismi:");
                 String kanal=scanner.nextLine();
                 kumanda.kanalSil(kanal);
             }
             else if(islem.equals("4")){

                 System.out.println("Kanal sayisi="+ kumanda.kanalSayisi());

             }
             else{

                 System.out.println("Gecersiz islem.....");
             }

         }
    }
    public static void kanallariGoster(Kumanda kumanda){
        if(kumanda.kanalSayisi()==0){

            System.out.println("Gosterilecek kanal yok");
        }
        else {

            for(String kanal:kumanda){
                System.out.println("Kanal"+kanal);
            }
        }


    }


}
