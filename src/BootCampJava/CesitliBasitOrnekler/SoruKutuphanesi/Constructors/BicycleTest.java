package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Constructors;

public class BicycleTest {
    public static void main(String[] args) {
        Biscyle mybike=new Biscyle(16,"red");
        System.out.println(mybike.color);
        System.out.println(mybike.size);
        mybike.goFast();
        mybike.goFaster();
        mybike.goSlow();
        mybike.slowDown();

    }

}
