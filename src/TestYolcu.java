public class TestYolcu {

    public static void main(String[] args) {

        System.out.println("Hava limanina hosgeldiniz...");

        String sartlar="Yurt disi cikis kurallari:\n"
                        +"Herhangi siyasi yasaginin bulunmamasi gerekiyor.\n"
                        +"15 TL harc bdelini tam olarak tam olarak yatirman grekiyor.\n"
                        +"Dideceginiz ulkeye vizenizin bulunmasi gerekir.";
        String mesaj="Yurt disi sartlariniz tamamini saglamaniz gerekiyor";

        while(true){

            System.out.println(sartlar);

            Yolcu yolcu= new Yolcu();
            System.out.println("Harc bedeli kontrol ediliyor...");
            if(yolcu.yurtDisiHarciKontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            if(yolcu.siyasiYasakKontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Vize durumu kontro ediliyor...");

            if(yolcu.vizeDurumuKontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Islemleriniz tamam yurt disina cikabilirsiniz...");
            break;

        }

    }
}
