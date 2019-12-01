package BootCampJava.Composition;

public class Anakart {
    private String model;
    private String uretici;
    private int yuva_Sayisi;
    private String isletim_sistemi;

    public Anakart(String model,String uretici,int yuva_Sayisi,String isletim_sistemi) {
        this.setModel(model);
        this.setUretici(uretici);
        this.setYuva_Sayisi(yuva_Sayisi);
        this.setIsletim_sistemi(isletim_sistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuva_Sayisi() {
        return yuva_Sayisi;
    }

    public void setYuva_Sayisi(int yuva_Sayisi) {
        this.yuva_Sayisi = yuva_Sayisi;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
    public void bilgisayari_Ac(){
        System.out.println("Bilgisayari Ac");
    }
}
