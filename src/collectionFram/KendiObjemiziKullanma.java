package collectionFram;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class KendiObjemiziKullanma {

    public static void main(String[] args) {
        Set<Player> hashSet=new HashSet<Player>();

        Player player1= new Player("Serkan",1);
        Player player2= new Player("Abbas",5);
        Player player3= new Player("Kazim",10);
        Player player4= new Player("Serkan",1);

        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);

        for(Player p:hashSet) {
            System.out.println(p);


        }
    }
}


    class  Player{

        private String isim;
        private int id;

        public Player(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }

        @Override
        public String toString() {
            return "||||ID :"+id+"Isim: "+isim+"||||";
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Player)) return false;
            Player player = (Player) o;
            return id == player.id &&
                    isim.equals(player.isim);
        }

        @Override
        public int hashCode() {
            return Objects.hash(isim, id);
        }
    }




