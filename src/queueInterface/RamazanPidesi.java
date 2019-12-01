package queueInterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// firindan 1 den 10 a kadar pide cikacak 1 ve 10 dahil. Kuyruktakiler bunu alamaya calisacak.
public class RamazanPidesi {

    public static void main(String[] args) {
        System.out.println("Ramazan pidesi uygulamasina hosgeldiniz...");

        Queue<String> pide_kurugu=new LinkedList<String>();
        Random random=new Random();

        pide_kurugu.offer("serkan");
        pide_kurugu.offer("ayse");
        pide_kurugu.offer("seyma");
        pide_kurugu.offer("beyza");
        pide_kurugu.offer("yakup");
        pide_kurugu.offer("fatma");
        pide_kurugu.offer("serdar");
        pide_kurugu.offer("sultan");
        pide_kurugu.offer("ramazan");
        pide_kurugu.offer("songul");
        int pide_sayisi=1+random.nextInt(10);

        System.out.println("Pideler cikiyor... Cikan pideler:"+pide_sayisi);

        while (pide_sayisi!=0){

            System.out.println(pide_kurugu.poll()+": pideyi aldi");

            pide_sayisi--;



        }
        System.out.println("Pide kalmadi...");


    }
}
