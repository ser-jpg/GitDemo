package innerClass;
// Static olmayan ve Static olan inner class lar CLASS imizin birer uyesiydi.
// Lokal class lar ise MEDTOD umuzun birer uyesi olacak.
// lokal inner class lara baska bir siniftan ulasamiyoruz.Cunku metod icerisinde tanimlanmis. Degisken gibi sadece metod a aiittir.
// public static gibi seyleri kullanamiyoruz Cunku onlar normal bir class in
public class LokalInner {

    public static void main(String[] args) {

        class Alan{// Class in basina public static gibi seyler kullanamassiniz.
            public  void direAlani(int yariCap){
                System.out.println("Dairenin alani:"+(yariCap*yariCap*Math.PI));

            }
        }
        Alan alan=new Alan();
        alan.direAlani(4);
    }

   /*public static void deneme(){
        UnstaticMath.Alan alan1=new UnstaticMath.Alan();
        // Hata verdi Cunku biz bir metodun icerisinde tanimlanmis innerclass i baska bir metotta kullanamayiz.
        //Degisken gibi
    }*/
}
