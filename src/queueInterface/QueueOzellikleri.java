package queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOzellikleri {
    public static void main(String[] args) {



        // queue interface ni implement eden LinkedList class i FIFO kurali vardir(once giren once cikar) pide kuyrugu gibi
        // add(Eleman) kuyruga ekler
        // offer(Eleman): Elemani kuyriga ekler. Eklerse true ekleyemesse false doner.
        // remove() : kuyrugun en basindaki elemani kuyruktan cikarir.Kuyruk bossa hata verir
        // poll: kuyrugun en basindaki elmani cikarir kuyruk bossa null doner.
        // element: kuyrugun en basindaki elemani donr kuyruk bossa hata firlatir.
        // peek:  kuyrugun en basindaki elenmani dner kuyruk bossa null firlatir

        Queue<String> queue=new LinkedList<String >();
        queue.offer("java");
        queue.offer("Phayton");
        queue.offer("go");
        queue.offer("c++");
        queue.offer("c");

        for(String e:queue){

            System.out.println(e);
        }

        System.out.println("Kuyrugun en basindaki eleman:"+queue.peek());
        System.out.println("en bastaki elemani cikar :"+queue.poll());
        for(String e:queue){

            System.out.println(e);
        }
        System.out.println("*************************************");
        while(!queue.isEmpty()){

            System.out.println("Elemani cikar: "+queue.poll());
        }
    }
}
