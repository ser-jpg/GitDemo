package abstractOlusturma;

import java.util.Scanner;

public class TestSekil1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String islemler="1. Karenin alani\n"
                        +"2.Ucgenin alani\n"
                        +"3.Dairenin alani\n"
                        +"Cikis icin q ye bas";
        while (true){

            ;
            System.out.println(islemler);
            System.out.println("Hangi seklin alanini istiyorsun?");
            String sekil_Turu=scanner.nextLine();
            Sekil1 sekil1=null;

            if(sekil_Turu.equals("q")){
                System.out.println("Sistemden cikiliyor...");
                break;
            }

            else if(sekil_Turu.equals("1")){
                 sekil1=new KareSekil1("kare",5);
                 sekil1.alanHesapla();

            }
            else if(sekil_Turu.equals("2")){

                sekil1=new UcgenSekil1("Ucgen",10,20,30);
                sekil1.alanHesapla();

            }
            else if(sekil_Turu.equals("3")){
                sekil1=new DaireSekil1("Daire",4);
                sekil1.alanHesapla();


            }
            else{
                System.out.println("Gecersiz islem...");
            }



        }
    }
}
