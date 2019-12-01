package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;


class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){

    return "Hayvan onusuyor...";
    }
}
class Kedi extends Hayvan{
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Miyavliyor...";
    }
}
class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Havliyor...";
    }
}
class At extends Hayvan{
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" Kisniyor...";
    }
}
public class Main {
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }



    public static void main(String[] args) {
        /*Hayvan hayvan=new Kedi("Tekir");     // Bir tane referans birden fazla obje gibi kullaniliyor.
        Hayvan hayvan1=new Kopek("Karabas");
        Hayvan hayvan2=new At("Kara");

        System.out.println(hayvan.konus());    //Yani siz bir objeyi birden fazla objeyle kullanabiliyorsunuz.
        System.out.println(hayvan1.konus());                                       // Fakat bunun icin inheritance gibi bir yapi lazim
        System.out.println(hayvan2.konus());*/
        //plymorfism in olusmasi icin bir tane ana sinif olmali ve digerleri alt class olacak.
        // Daha sonra alt class larin referansini ust clasin referansina esitliyebiliyoruz.
        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Karabas"));
        konustur(new At("Kara"));

    }



}

