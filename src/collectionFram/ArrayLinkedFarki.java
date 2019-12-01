package collectionFram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedFarki {

    public static void main(String[] args) {

        LinkedList<Integer> linkedlist=new LinkedList<Integer>();
        ArrayList<Integer> arraylist=new ArrayList<Integer>();
        zamanHesapla("LinkedList",linkedlist);
        zamanHesapla("ArrayList",arraylist);



    }

    public static void zamanHesapla(String veri,List<Integer>list){

        long baslangin;
        long bitis;
        baslangin=System.currentTimeMillis();

        for(int i=0;i<1000000;i++){

            list.add(i);
        }
        bitis=System.currentTimeMillis();
        System.out.println(veri+" Gecen Toplam sure= "+(bitis-baslangin));




    }
}
