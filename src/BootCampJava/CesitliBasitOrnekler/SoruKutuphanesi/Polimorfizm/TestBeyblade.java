package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;

import java.util.Scanner;

public class TestBeyblade {
    public static void main(String[] args) {
        System.out.println("BeyBlade programina hos geldiniz...");
        System.out.println("Cikis icin q ya basiniz...");
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Hangi beyblade uretmek istiyorsun:");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Islemden cikariliyor");
                break;
            }
            else{

                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                Beyblade beyblade=fabrika.beybladeuret(islem);
                if(beyblade==null){

                    System.out.println("Gecerli bir beyblade girin..");
                }
                else{
                    beyblade.bilgilerigoster();
                    beyblade.saldir();
                    beyblade.kutsalcanavarlarortyacikar();
                }
            }




        }
    }

}
