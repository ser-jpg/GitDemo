package exceptionYakalama;

public class Propagation {

    public static void ucuncuFonksiyon(){
      try{
        int a=12/0;
      }catch (ArithmeticException e){
          System.out.println("bir sayi sifira bolunemez...");
      }
    }
    public static void ikinciFonksiyon(){

        ucuncuFonksiyon();
    }
    public static void birinciFonksiyon(){

        ikinciFonksiyon();
    }
    public static void main(String[] args) {
      birinciFonksiyon();
    }
}
