package comparator;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Serkan");
        list.add("Yakup");
        list.add("Serdar");
        list.add("Ramazan");

        Collections.sort(list, new BuyuktenKucuge());

        for (String s : list) {
            System.out.println(s);

        }
    }
}
