package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;

public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalcanavarlarortyacikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" i ortaya cikariyor...");
        System.out.println(getBeybladeci()+" in saldirisi:Hayalet saldirisi");
    }


    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal canavar adi:"+kutsalCanavar);
        System.out.println("Gizli Yetenek...");
    }

}
