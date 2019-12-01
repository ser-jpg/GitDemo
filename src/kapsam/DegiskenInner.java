package kapsam;

public class DegiskenInner {

    private int privateDegisken=30;

    public DegiskenInner() {

    }

    public class DahiliKapsam{
        private int privateDegisken=20;

        public void onileCarp(){
            int privateDegisken=10;// en local bu oldugu icin degisken olarak "10" aldi.

            for(int i=1;i<6;i++){

                System.out.println(i+"*"+privateDegisken+"="+(i*privateDegisken));
                System.out.println(i+"*"+this.privateDegisken+"="+(i*this.privateDegisken));// "20" kullanir
                System.out.println(i+"*"+DegiskenInner.this.privateDegisken+"="+(i*DegiskenInner.this.privateDegisken));
                  // son durumda "30" kullanir.
            }
        }
    }
}
