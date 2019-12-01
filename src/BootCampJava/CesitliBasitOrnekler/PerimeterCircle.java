package BootCampJava.CesitliBasitOrnekler;

public class PerimeterCircle {
    public static void main(String[] args) {
        double circlePetmeter=calculateperimetercircle(3);
        if(circlePetmeter>20){

            System.out.println("Large Circle");
        }
        else{
            System.out.println("Small Circle");
        }
    }
    public static double calculateperimetercircle(int radius){
        double perimeter;
        perimeter=2*3.14*radius;
        return perimeter;



    }
}
