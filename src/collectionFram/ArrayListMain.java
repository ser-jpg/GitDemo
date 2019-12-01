package collectionFram;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

       // ArrayList<String>arrayList=new ArrayList<>();
        List<String> list=new ArrayList<>();

        list.add("java");
        list.add("c++");
        list.add("phayton");
       // System.out.println(list.get(0));
       // System.out.println(list.get(1));

        for(String s: list){

            System.out.println(s);
        }
        System.out.println("**************************");
        list.remove("java");
        for(String s: list){

            System.out.println(s);
        }
        System.out.println("*******************");
        list.set(1,"Serkan");
        for(String s :list){

            System.out.println(s);
        }

    }
}
