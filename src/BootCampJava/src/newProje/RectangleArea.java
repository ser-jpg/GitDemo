package newProje;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter edge of rectangle");
        System.out.print("edge1 :");
        int edge1 =scanner.nextInt();
        System.out.print("edge2 :");
        int edge2 =scanner.nextInt();
        int Area = edge1*edge2;
        System.out.print("Area of rectangle :" +Area);

    }
}
