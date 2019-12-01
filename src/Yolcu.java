import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yatirdiginiz harc bedeli:");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Herhangi bir siyasi yasaginiz var mi?(evet yada hayir");
        String cevap=scanner.nextLine();
        if (cevap.equals("evet")){
            this.siyasiYasak=true;
        }
        else{
            this.siyasiYasak=false;
        }
        System.out.println("Vizeniz bulunuyor mu? (evet yada hayir");
        String cevap2=scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vizeDurumu=true;
        }
        else {
            this.vizeDurumu=false;
        }

    }

    @Override
    public boolean yurtDisiHarciKontrol() {
        if(harc<15){
            System.out.println("Lutfen harci tam yatirin");
            return false;
        }
        else{
            System.out.println("Yurt disi harci tamam");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {

        if(this.siyasiYasak==true){

            System.out.println("Yurt Disina Cikamazsin");
            return false;

        }
        else {
            System.out.println("Siyasi yasaginiz bulunmuyor..");
            return true;

        }

    }

    @Override
    public boolean vizeDurumuKontrol() {

        if(vizeDurumu==true){
            System.out.println("Vize islemleri tamam");
            return true;
        }
        else{
            System.out.println("Vizeniz yok...");
            return false;
        }


    }
}
