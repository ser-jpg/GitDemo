package BootCampJava.CesitliBasitOrnekler;

import java.util.Scanner;

public class TesterShapes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number of line:");
        int line=scanner.nextInt();
        System.out.println("Please enter sembol:");
        String sembol=scanner.nextLine();
        Shapes.printPramit(10,"#");
    }
}
