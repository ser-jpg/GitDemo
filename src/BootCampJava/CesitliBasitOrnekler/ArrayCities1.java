package BootCampJava.CesitliBasitOrnekler;

public class ArrayCities1 {
    public static void main(String[] args) {
        String cities[]={"Ankara","Istanbul","Bursa"};
        int arraycities=cities.length-1;
        for(int i=0;i<cities.length;i++){
            //System.out.println(cities[i]);
            System.out.println(cities[arraycities]);
            arraycities--;

        }
    }
}
