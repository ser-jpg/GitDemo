package collectionFram;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cumleyi Giriniz:");
        String cumle=scanner.nextLine();
        Map<Character,Integer> frekans=new TreeMap<Character, Integer>();

        for( int i=0;i<cumle.length();i++){

            char c=cumle.charAt(i);
            if(frekans.containsKey(c)){
                System.out.println(frekans.get(c));

                frekans.replace(c,frekans.get(c)+1);
                frekans.get(c);
            }


        }
    }

}
