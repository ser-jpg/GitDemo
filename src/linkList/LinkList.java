package linkList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {
    public static void main(String[] args) {

        LinkedList<String> gidilecek_yerler=new LinkedList<String>();
        /*gidilecek_yerler.add("Postahane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Kutuphane");
        gidilecek_yerler.add("Spor salonu");
        gidilecek_yerler.add("Ev");
        listeyi_bastir(gidilecek_yerler);
        System.out.println("-------------------------------");
        //gidilecek_yerler.add(4,"Alis veris merkezi");
        gidilecek_yerler.remove(3);
        listeyi_bastir(gidilecek_yerler);*/
        sirali_ekle(gidilecek_yerler,"postahane");
        sirali_ekle(gidilecek_yerler,"Market");
        sirali_ekle(gidilecek_yerler,"ev");
        listeyi_bastir(gidilecek_yerler);


    }

    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler){

        /*for(String s:gidilecek_yerler){
        System.out.println(s);
        }*/
        ListIterator<String> iterator=gidilecek_yerler.listIterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }


    }
    public static void sirali_ekle(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator<String> iterator=gidilecek_yerler.listIterator();
        while (iterator.hasNext()){
            int karsilastir=iterator.next().compareTo(yeni);
            if(karsilastir==0){
                System.out.println("Listenizde bu eleman zaten var");
                return;
            }
            else if(karsilastir<0){
                //Yeni deger daha iterator.next ten daha buyuk
            }
            else if (karsilastir>0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }


        }
        iterator.add(yeni);


    }
}
