package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Constructors;

import java.util.ArrayList;

public class ArraylistSarkici{

    private ArrayList<String> sarkici_listesi=new ArrayList<String>();

    public  void sarkicilari_bastir(){
        System.out.println("Sarkici Listesinde"+sarkici_listesi.size()+"kadar sarkici var");
        for(int i=0;i<sarkici_listesi.size();i++){

            System.out.println((i+1)+"Sarkici:"+sarkici_listesi.get(i));
        }

    }
    public void sarkici_ekle(String isim){

        sarkici_listesi.add(isim);
        System.out.println("Sarkici Listesi guncellendi...");
    }
    public void sarkici_guncelle(int position,String yeni_isim){
        sarkici_listesi.set(position,yeni_isim);
        System.out.println("Sarkici listesi guncellendi...");
    }
    public void sarkici_sil(int posizyon){
        String isim=sarkici_listesi.get(posizyon);
        sarkici_listesi.remove(posizyon);
        System.out.println(isim+" isimli sarkici listeden silindi");
    }
    public void sarkici_ara(String sarkici_ismi){
        int posizyon=sarkici_listesi.indexOf(sarkici_ismi);
        if(posizyon>=0){
            System.out.println("Sarkici bulundu...");
            System.out.println(sarkici_ismi+" isimli sarkici"+(posizyon+1)+".ci pozisyonda");
        }
        else{
            System.out.println("Sarkici bulunamadi...");
        }

    }
}
