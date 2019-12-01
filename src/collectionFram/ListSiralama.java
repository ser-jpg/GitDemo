package collectionFram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSiralama {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();

        list.add("java");
        list.add("phayton");
        list.add("javascribt");
        list.add("C++");
        list.add("php");
        list.add("go");


        Collections.sort(list);

        for(String s:list){

            System.out.println(s);
        }
    }
}
