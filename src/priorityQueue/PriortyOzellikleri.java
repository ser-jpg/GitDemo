package priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;


 class Prayer implements Comparable<Prayer>{
     @Override
     public int compareTo(Prayer prayer) {
         if(this.id<prayer.id){
             return -1;
         }
         else if(this.id>prayer.id){
             return 1;
         }
         return 0;
     }

     private String isim;
     private int id;

     public Prayer (String isim, int id) {
         this.isim = isim;
         this.id = id;
     }

     @Override
     public String toString() {
         return "Prayer{" +
                 "isim='" + isim + '\'' +
                 ", id=" + id +
                 '}';
     }
 }
public class PriortyOzellikleri {
    public static void main(String[] args) {

        // oncelik sirasina gore siralanir
        // oncelik sirasi mesela integer larda kucuk olan one gecer.

        Queue<Prayer> queue=new PriorityQueue<Prayer>();

       /* queue.offer(1);
        queue.offer(5);
        queue.offer(100);
        queue.offer(2);
        // bunlari for each dongusuyle bastiramassiniz.
        System.out.println("kuyrugumuzun en basindaki eleman:"+queue.peek());
        System.out.println(queue.contains(10));// kuyrugumuzda 10 varsa true donecek yoksa false
        while (!queue.isEmpty()){

            System.out.println("elemanlar cikariliyor:"+queue.poll());


       // eger kendi olusturdugumuz bir siniftan degerleri buraya atmak istesem nasil taniyacak?
      // bunun icin comprable interface den bazi formulleri override  etmemiz gerekiyor



        }*/

       queue.offer(new Prayer("serkan",5));
       queue.offer(new Prayer("emre",1));
       queue.offer(new Prayer("abbas",25));
       while (!queue.isEmpty()){

           System.out.println("Elemanlari cikar:"+queue.poll());
       }


    }
}
