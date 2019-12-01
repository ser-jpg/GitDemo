package Vektor;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vektor {

    public static void main(String[] args) {
        Vector<String> vector=new Vector<String>();
        //vektor ler array lerden biraz daha performans olarak daha yavas.
        // treat lerle islem yapacaksaniz daha guvenli.

        vector.add("java");
        vector.add("php");
        vector.add("go");
        vector.add("c++");
        for(String s:vector){

            System.out.println(s);
        }
        System.out.println("*************************************");
        ListIterator<String> iterator=vector.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("***************************************");

        Enumeration<String> enumeration=vector.elements();

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("Ilk Element:"+vector.firstElement());
        System.out.println("Son eleman:"+vector.lastElement());

    }
}
