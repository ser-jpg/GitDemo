package innerClass;
//Interface ve abstract bir sinifimizdan bir implemet etmeden baska bir sinifi onlar uzerindeki metotlari
//AnonimInner ile kullanabiliriz.

public class AnonimInner {
    public static void main(String[] args) {

        IOgrenci ogrenci=new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders calisiyorum");

            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum.");

            }
        };
        ogrenci.ders_calis();
        ogrenci.derse_gir();
        System.out.println("************************************");
        AOgrenci aOgrenci=new AOgrenci("serkan Sen",25) {
            @Override
            void kayit_yaptir() {
                System.out.println("Kayit Yapiliyor..."+"Isim"+ getIsim()+"Numara"+getNumara());

            }
        };
        aOgrenci.kayit_yaptir();


    }

    public static abstract class AOgrenci{
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }

        abstract void kayit_yaptir();
        public void selamla(){
            System.out.println("Selamlar...");
        }

    }

    public interface IOgrenci{

        void ders_calis();
        void derse_gir();
    }

}
