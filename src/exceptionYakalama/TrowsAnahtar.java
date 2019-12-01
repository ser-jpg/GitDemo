package exceptionYakalama;

import java.io.IOException;
import java.util.Scanner;

public class TrowsAnahtar { //throws sadece checked exception da gerekli olur.

    public static void mekanKontrol(int yas)throws IOException  {

        if (yas < 18) {

            throw new IOException();
        } else {
            System.out.println("Mekana Hosheldiniz...");
        }


    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz:");
        int yas = scanner.nextInt();

          try {
              mekanKontrol(yas);
          }
          catch (IOException e){

              System.out.println("IOException olustu...");
          }




    }
}



