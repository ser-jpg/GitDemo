package comparable;



import java.util.*;

public class TestOgrenci {

    public static void main(String[] args) {


       /* List<Ogrenci> list=new ArrayList<Ogrenci>();
        list.add(new Ogrenci("serkan",10));
        list.add(new Ogrenci("abbas",5));
        list.add(new Ogrenci("kazim",15));
        list.add(new Ogrenci("tarkan",1));

        Collections.sort(list);
        for(Ogrenci o: list){

            System.out.println(o);
        }*/
       Set<Ogrenci> treeSet=new TreeSet<Ogrenci>();


        treeSet.add(new Ogrenci("serkan",10));
        treeSet.add(new Ogrenci("abbas",5));
        treeSet.add(new Ogrenci("kazim",15));
        treeSet.add(new Ogrenci("tarkan",1));

        for(Ogrenci o:treeSet){
            System.out.println(o);
        }





    }
}
