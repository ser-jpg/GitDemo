package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Constructors;

import java.util.ArrayList;

public class Arraylist {


    public static void yazdir(ArrayList<String> a){
        for(int i=0;i<a.size();i++){

            System.out.println("Element"+i+1+":"+a.get(i));
        }
    }
    public static void main(String[] args) {




    ArrayList<String> arraylist=new ArrayList<String>();

    arraylist.add("Serkan");
    arraylist.add("Abbas");
    arraylist.add("Kazim");
    arraylist.add("Serkan");

      //arraylist.remove("Serkan");
      //arraylist.remove(1);
        //System.out.println(arraylist);
       // System.out.println(arraylist.get(0));
        //System.out.println(arraylist.size());
        //System.out.println(arraylist.indexOf("Serkan"));
        //System.out.println(arraylist.lastIndexOf("Serkan"));

        //arraylist.set(3,"tahsin");

       // for(int i=0;i<arraylist.size();i++){
            //System.out.println(arraylist.get(i));

        yazdir(arraylist);





    }
}
