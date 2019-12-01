package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Constructors;

public class Constructors {
    int year;
    String name;


    public static void main(String[] args) {
        Constructors myobj=new Constructors();
        System.out.println(myobj.name);
        System.out.println(myobj.year);

    }

    public Constructors(){
        year=1975;
        name="java";



    }
}
