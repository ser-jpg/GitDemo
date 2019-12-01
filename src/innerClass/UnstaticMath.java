package innerClass;

import java.util.Scanner;

public class UnstaticMath {

    private double PI=Math.PI;

    public class Faktoriyel{
        public void faktoriyel(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=scanner.nextInt();
        int fact=1;

        for(int i=2;i<=sayi;i++){
            fact*=i;

        }
        System.out.println("Faktoriyel="+fact);
        }
    }

    public class Asal{

        public boolean asalmi(int sayi){

            int i=2;
            while (i<sayi){

                if(sayi%i==0){
                    System.out.println("Sayi asal degildir");
                    return false;
                }
                i++;

            }
            return true;


        }
    }
    public class Alan{

        public class DaireAlan{
            public void daire(int yaricap){

                System.out.println("Dairenin alani="+(PI*yaricap*yaricap));
            }

        }

    }
}
