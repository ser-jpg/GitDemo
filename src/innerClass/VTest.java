package innerClass;

import java.util.Scanner;

public class VTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik ve Fizik islemlerine hos geldiniz...");

        String islemler="Islemler: \n"
                        +"1.Daire alani hesaplama\n"
                        +"2.Ucgen cevresini hesaplama\n"
                        +"3. iki vektorun ic carpimi\n"
                        +" cikis icin q ye basin";
        while (true){
            System.out.println(islemler);
            System.out.println("Islemi secin: ");
            String islem=scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Islemden cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Dairenin yaricapi:");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                VProblem.Matematik.daireAlani(yaricap);

            }
            else if(islem.equals("2")){

                System.out.println("Kenar1= ");
                int kenar1=scanner.nextInt();
                System.out.println("Kenar2= ");
                int kenar2=scanner.nextInt();
                System.out.println("Kenar3= ");
                int kenar3=scanner.nextInt();
                scanner.nextLine();
                VProblem.Matematik.ucgenCevresi(kenar1,kenar2,kenar3);

            }
            else if(islem.equals("3")){
                Vector vec1=new Vector("vec1");
                Vector vec2=new Vector("vec2");
                VProblem.Fizik.icCarpim(vec1,vec2);


            }
            else{
                System.out.println("Gecersiz islem yaptiniz...");
            }
        }
    }
}
