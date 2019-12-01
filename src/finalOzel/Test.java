package finalOzel;

public class Test {// sinifi final yapsaydik ondan hic bir alt sinif uretemeyiz.
    public static void main(String[] args) {
       /* FinalTest f1=new FinalTest("obje1");
        FinalTest f2=new FinalTest("oje2");

        System.out.println("Obje Sayisi="+f1.obje_sayisi);
        System.out.println("Obje Sayisi="+f2.obje_sayisi);*/

        System.out.println("Data base= "+DataBase.database);
        System.out.println("User name= "+DataBase.userName);
        System.out.println("Pass Word= "+DataBase.pasWord);

    }
    public static final void yazdir(){// metotda final kullanirsak bu bu sinifi extend eden bir sinif override edemez.

    }
}
