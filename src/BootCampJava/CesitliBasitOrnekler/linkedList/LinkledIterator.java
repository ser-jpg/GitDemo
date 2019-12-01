package BootCampJava.CesitliBasitOrnekler.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkledIterator {

    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler){
       /* for(String srs:gidilecek_yerler){
            System.out.println(srs);
        }*/
        ListIterator<String> iterator=gidilecek_yerler.listIterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }


    }
    public static void sirali_ekle(LinkedList<String>gidilecek_yerler,String yeni){

        ListIterator<String> iterator=gidilecek_yerler.listIterator();

        while (iterator.hasNext()){
        int karsilastir=iterator.next().compareTo(yeni);

        if(karsilastir==0){
            // iki deger esit.
            System.out.println("listenizde bu eleman zaten var.");
            return;
        }
        else if(karsilastir<0){
            //yani yeni deger buyuk
        }
        else if(karsilastir>0){
            //iterator daha buyuk
            iterator.previous();
            iterator.add(yeni);
            return;
        }

        }
        iterator.add(yeni);

    }

    public static void main(String[] args) {
        LinkedList<String >gidilecek_yerler=new LinkedList<>();
        sirali_ekle(gidilecek_yerler,"postahane");
        sirali_ekle(gidilecek_yerler,"ev");
        sirali_ekle(gidilecek_yerler,"market");


       /* list.add("postahane");
        list.add("Market");
        list.add("Okul");
        list.add("Kutuphane");
        list.add("Spor Salonu");
        list.add("Ev");

        list.remove(1);
        list.add(4,"ise");
        listeyi_bastir(list);*/
       listeyi_bastir(gidilecek_yerler);
    }
}
