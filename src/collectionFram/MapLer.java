package collectionFram;

import java.util.HashMap;
import java.util.Map;

public class MapLer {

    public static void main(String[] args) {


        // HashMap ler degerleri key(anahtar) ve value(deger) seklinde depolar.Her key e karsilik bir tane deger buluner.
        // bir key sadece bir kez varolabilir. Ancak bir deger birden fazla bulunabilir.
        // Elementleri tipki HasSet sinifi gibi ekleme sirasina gore depolamaz.

        HashMap<Integer,String> hashMap=new HashMap<Integer, String>();

        hashMap.put(10,"java");
        hashMap.put(30,"phayton");
        hashMap.put(50,"php");
        hashMap.put(20,"php");  // key ler sadece bir tane olabilir tekrar edemez

        hashMap.put(20,"php"); // bu sekide tekrar yazarsam bunu bir daha eklemez.
        hashMap.put(50,"jaca scribt"); // java sikinti cikarmayacak ama 50 "php" cikarim bunu onun yerine koyacak.
       /* System.out.println(hashMap);
        System.out.println(hashMap.get(50));*/

       // for la nasil bastirabiliriz.
        for(Map.Entry<Integer,String> entry:hashMap.entrySet()){

            System.out.println("Anahtar:"+entry.getKey()+"--------> deger: "+entry.getValue());
        }

    }
}
