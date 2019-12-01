package BootCampJava.CesitliBasitOrnekler;

public class MethodsReview {
    public static void main(String[] args) {
        System.out.println("mehmet");
        printMyname();
        printMynameParemeter("mehmet");
        System.out.println(printMynameString());
        System.out.println(printMynameStringParemeter("mehmet"));
    }
    public static void printMyname(){
        System.out.println("mehnet");

    }
    public static void printMynameParemeter(String name){
        System.out.println(name);
    }
    public static String printMynameString(){
        return "mehmet(without paremeter)";
    }
    public static String printMynameStringParemeter(String name){

        return name;
    }
}
