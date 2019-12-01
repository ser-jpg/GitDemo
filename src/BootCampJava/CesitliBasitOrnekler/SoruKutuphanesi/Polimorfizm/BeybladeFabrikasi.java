package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;

public class BeybladeFabrikasi {

    public Beyblade beybladeuret(String beybladeTuru){

        if(beybladeTuru.equals("Dragon")){
            return new Dragon("Takao",800,400,"Mavi Ejdeha","Kutsal Canavarla Konusma");
        }
        else if(beybladeTuru.equals("Dranza")){
            return new Dranza("Kai",500,300,"Kirmizi Anka Kusu");
        }
        else if(beybladeTuru.equals("Drayga")){

            return new Drayga("Rei",800,250,"Beyaz Kaplan");
        }
        else if(beybladeTuru.equals("Dracial")){
            return new Dracial("Max",400,1000,"Kara Kamlumbaga");
        }
        else{

            return null;
        }
    }
}
