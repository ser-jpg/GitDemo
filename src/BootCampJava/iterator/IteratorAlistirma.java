package BootCampJava.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAlistirma {

    //Java list iteratör collection elemanlarımızın arasında gezinmemize yarar. En önemli özelliklerinden biride
    // collection elemanlarını remove edebilmesidir yani belirtilen kriterler deki elamanı silmemizi sağlar.
    //next() : ileri doğru
    //previous(): geri doğru
    //hasNext(): ileride eleman varmı?
    //hasPrevious(): geride elaman varmı? true yada false


    public static void main(String[] args) {
        ArrayList<String> calisanlar=new ArrayList<String>();
        calisanlar.add("Ahmet");
        calisanlar.add("Memmet  ");
        calisanlar.add("Hande");
        calisanlar.add("Hüseyin");

        ListIterator<String> iterator=calisanlar.listIterator();
        System.out.println("Baştan sona doğru yazdıralım...");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nSondan başa doğru yazdıralım...");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }



    }

}
