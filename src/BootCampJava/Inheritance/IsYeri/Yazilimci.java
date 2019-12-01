package BootCampJava.Inheritance.IsYeri;

public class Yazilimci extends Calisan {

    private String diller;

    public Yazilimci(String ad,String soyad,int id,String diller){

        super(ad,soyad,id);
        this.diller=diller;
    }
    public void formatat(String isletim_sistemi){
        System.out.println(getAd()+""+isletim_sistemi+"ni yukluyor..." );
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Yazilimcinin bildigi diller:"+diller);

    }
}
