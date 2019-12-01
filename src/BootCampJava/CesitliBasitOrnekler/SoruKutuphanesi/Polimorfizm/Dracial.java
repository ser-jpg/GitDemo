package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;

public class Dracial extends Beyblade{
    private String kutsalCanavar;

    public Dracial(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalcanavarlarortyacikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" i ortaya cikariyor...");
        System.out.println(getBeybladeci()+" in saldirisi:Kale Savunmasi...");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal canavar adi:"+kutsalCanavar);

    }

}
