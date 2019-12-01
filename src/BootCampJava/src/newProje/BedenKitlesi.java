package newProje;

import java.util.Scanner;

public class BedenKitlesi {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Lutfen Boyunuzu Girin (Ornek = 1.72):");
double boy =scanner.nextDouble();
System.out.println("Lutfen Kilolunuzu Girin :");
int kilo = scanner.nextInt();
double bki = (kilo)/(boy*boy);
System.out.println("Kilo Boy Endeksiniz: " + bki);
if (bki<18.5) {
    System.out.println("Zayif...");
}
else if (bki>18.5 && bki<25) {
    System.out.println("Normal");
}
else if (bki>25 && bki<30) {
    System.out.println("Fazla Kilolu...");
}
else {
    System.out.println("Obez...");
}




    }
}