package kendiIterableSinifimiz;

public class Main {
    public static void main(String[] args) {
        String [] kanallar={"alem FM","kral FM","Radyo viva","radyo Hacettepe","Irmak"};

        Radyo radyo=new Radyo(kanallar);

        for(String s:radyo){

            System.out.println(s);
        }
    }
}
