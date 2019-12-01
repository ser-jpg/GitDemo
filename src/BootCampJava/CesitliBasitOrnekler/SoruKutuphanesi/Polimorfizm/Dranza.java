package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;

public class Dranza extends Beyblade{

    private String kutsal_canavar;

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsal_canavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsal_canavar = kutsal_canavar;
    }

    @Override
    public void kutsalcanavarlarortyacikar() {
        System.out.println(getBeybladeci()+" "+kutsal_canavar+" i ortaya cikariyor...");
        System.out.println(getBeybladeci()+" in saldirisi:Alev kilici");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal canavar adi:"+kutsal_canavar);
    }
}
