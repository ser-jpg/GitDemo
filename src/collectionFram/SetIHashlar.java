package collectionFram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIHashlar {
    public static void main(String[] args) {


        // Set interface i implement eden clas lar "HashSet,LinkedHashSet,TreeSet" bir elemani sadece bir kere  depolayabilir.
        // ancak bizim List interface mizi implement eden calass "ArrayList, linkedList" lar bir elementten bir den fazla depolayabilir
        // HashSet elementleri hashing sisteme gore (hash table a gore)depolar.(Her element belli bir key e gore depolanir.
        //HashSet bir elemani sadece bir defa depolar( Set interface)
        // elemanlari ekleme sirasina gore depolamaz.
        //LinkedHashSet: Hem Hash table hemde Set interface in LinkedList implemantasyonu gibi davranir.
        //LinkedHashSet elementlerimizi sirasiyla birbirinin referanslarini gostererek. Hem de hash table a gore depoluyorlar.
        //LinkedHashSet bir elemani birkez depoluyor.Ve elementleri ekleme sirasina gore depoluyor.
        //TreeSet: Elemanlari alfabetik siraya gore depolar.
        // HashSet, LinkedhHashSet,TeeSet arasindaki farklar:
        //HashSet te ekleme cikarma ve arama metotlari ayni zamanda yapilir.Cunku Hash Table  gore siralaniyor.

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();
        set1.add("java");
        set1.add("phaython");
        set1.add("C++");
        set1.add("JavaScribt");
        set1.add("phb");
        //HashSet
        set2.add("java");
        set2.add("phaython");
        set2.add("C++");
        set2.add("JavaScribt");
        set2.add("phb");
        //LinkedHashSet
        set3.add("java");
        set3.add("phaython");
        set3.add("C++");
        set3.add("JavaScribt");
        set3.add("phb");
        //TreeSet
        System.out.println("HashSet************************************************");

        for(String s:set1){
            System.out.println(s);
        }
        System.out.println("LinkedHashSet************************************************");

        for(String s:set2){
            System.out.println(s);

        }
        System.out.println("TreeSet************************************************");
        for(String s:set3){
            System.out.println(s);
        }
        //set1.contains("go") set de "go" var mi varsa true yoksa false
        //set1.isEmpty() set1 in ici bos mu diye soruyor bossa true degilse false*/

       /*Set<String > set1=new HashSet<String >();
       Set<String> set2=new HashSet<String>();

       set1.add("Java");
       set1.add("Phoython");
       set1.add("go");
       set1.add("javascribt");

       set2.add("Java");
       set2.add("C++");
       set2.add("Php");

       /*Set<String> fark=new HashSet<String>(set2);

        System.out.println(fark.removeAll(set1));
        System.out.println(fark);*/
       Set<String> kesisim=new HashSet<String >(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);




    }

}
