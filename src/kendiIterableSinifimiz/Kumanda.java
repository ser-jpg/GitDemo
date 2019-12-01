package kendiIterableSinifimiz;

import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String>{

    private ArrayList<String> kanallar=new ArrayList<String>();

    public class KumandaItarotor implements Iterator<String>{

       int index=0;
        @Override
        public boolean hasNext() {
           if(index>=kanallar.size()){
               return false;

           }
           return true;
        }

        @Override
        public String next() {
            String kanal=kanallar.get(index);
            index++;
            return kanal;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new KumandaItarotor();
    }



   public void kanalEkle(String kanal){
       kanallar.add(kanal);


   }
   public void kanalSil(String kanal){
       if(kanallar.contains(kanal)){
           kanallar.remove(kanal);
       }
       else{
           System.out.println("Boyle bir kanal bulunmuyor...");
       }

   }
   public int kanalSayisi(){

       return kanallar.size();
   }


}
