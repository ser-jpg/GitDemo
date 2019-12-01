package collectionFram;

import java.util.*;

public class MapHashLinkedTree {

    public static void mapyazdir(Map<Integer,String> map){
        map.put(10,"java");
        map.put(30,"java scribt");
        map.put(50,"Php");
        map.put(100,"phaton");
        map.put(5,"c++");
        /*for(Map.Entry<Integer,String> entry:map.entrySet()){

            System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
        }*/
        // su sekidede bastirabiliriz eger istersek
        System.out.println(map.keySet()); // key leri bu sekilde bastirabiliyoruz.
       /* for(Integer key:map.keySet()){

            System.out.println("Key :"+key+" Value :"+map.get(key));
        }*/
        Collection<String> value= map.values();
        for(String s:value){

            System.out.println(s);
        }


    }
    public static void main(String[] args) {

        Map<Integer,String> hashMap=new HashMap<Integer, String>();
        Map<Integer,String> linkedhashMap=new LinkedHashMap<Integer, String>();
        Map<Integer,String> treeMap=new TreeMap<Integer, String>();

        mapyazdir(hashMap);
        System.out.println("**************************");
        mapyazdir(linkedhashMap);
        System.out.println("****************************");
        mapyazdir(treeMap);


    }
}
