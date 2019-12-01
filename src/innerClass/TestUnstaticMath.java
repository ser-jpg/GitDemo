package innerClass;

import java.util.Scanner;

public class TestUnstaticMath {
    public static void main(String[] args) {

          UnstaticMath.Faktoriyel faktoriyel=new UnstaticMath().new Faktoriyel();
          UnstaticMath.Asal asal=new UnstaticMath().new Asal();
          UnstaticMath.Alan alan=new UnstaticMath().new Alan();
          UnstaticMath.Alan.DaireAlan daireAlan=new UnstaticMath().new Alan().new DaireAlan();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=scanner.nextInt();

        if(asal.asalmi(sayi)){
            System.out.println("Bu sai asaldir.");
        }
        else{
            System.out.println("Bu sayi asal degildir.");
        }

        faktoriyel.faktoriyel();
        //alan.daire(5);
        daireAlan.daire(3);
    }
}
