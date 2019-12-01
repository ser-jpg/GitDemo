package kendiIterableSinifimiz;

import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String>{
    @Override
    public Iterator<String> iterator() {
        return kanallar_listesi.iterator();
    }

    private ArrayList<String> kanallar_listesi=new ArrayList<String>();

    public Radyo(String [] kanallar){
        for(String kanal:kanallar){
            kanallar_listesi.add(kanal);
        }


    }
}
