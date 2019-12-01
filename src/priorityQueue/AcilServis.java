package priorityQueue;
// Hastalar acil onceliklerine gore one gececek.
// Apandisit on onde
// yanik orta oncelikli
// bas agrisi en dusuk

import java.util.PriorityQueue;
import java.util.Queue;

class Hasta implements Comparable<Hasta>{
     @Override
     public int compareTo(Hasta hasta) {
         if(this.oncelik>hasta.oncelik){
             return -1;
         }
         else if(this.oncelik<hasta.oncelik){
             return 1;
         }
         return 0;
     }

     private String isim;
     private String hastalik;
     private int oncelik;

     public Hasta(String isim, String hastalik) {
         this.isim = isim;
         this.hastalik = hastalik;
         if(this.hastalik.equals("apandisit")){
             this.oncelik=3;
         }
         else if(this.hastalik.equals("yanik")){
             this.oncelik=2;
         }
         this.oncelik=1;
     }

     @Override
     public String toString() {
         String bilgiler="Hasta adi"+isim
                          +"\nSikayet"+hastalik
                          +"\n oncelik"+oncelik;
         return bilgiler;

     }
 }
public class AcilServis {


    public static void main(String[] args) {

        Queue<Hasta> acilservis =new PriorityQueue<Hasta>();
        acilservis.offer(new Hasta("Abbas","apandisit"));
        acilservis.offer(new Hasta("mehmet","yanik"));
        acilservis.offer(new Hasta("kazim","basagrisi"));
        acilservis.offer(new Hasta("Ata","apandisit"));
        acilservis.offer(new Hasta("mahmut","yanik"));
        acilservis.offer(new Hasta("gun","basagrisi"));

        int i=1;

        while (!acilservis.isEmpty()){

            System.out.println(i+".nci sira");
            System.out.println(acilservis.poll());
          i++;
        }


    }
}
