package comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Player> list=new ArrayList<Player>();

        list.add(new Player("Serkan",1));
        list.add(new Player("Yakup",2));
        list.add(new Player("Serdar",3));
        list.add(new Player("Ramazan",4));
       // Collections.sort(list,new KucuktenBuyuge());
        Collections.sort(list,new BuyuktenKucuge());

        for(Player p:list){

            System.out.println(p);
        }
    }
}
