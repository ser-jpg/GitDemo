package finalOzel;

public class FinalTest {

    public final int obje_sayisi; // final objesine bir kere deger verilir. ya tanimlanirken veya constractor icinde;

    private static int say=0;
    public final String isim;
    public FinalTest(String isim){

        this.isim=isim;
        say++;
        obje_sayisi=say;
    }




    // Baska hehangi bir fonksiyonda da bu ozellige deger veremeyiz.
    // degistirilmesini istemediginiz alan varsa final anahtar kelimesini kullanabilirsiniz.
}
