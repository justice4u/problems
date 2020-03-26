package uz.isd.begin;

import java.util.Scanner;

public class begin006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Paralellopiped tomonini kiriting: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double V = a * a * a;
        double S = 2 * (a * b + b * c + a * c);
        System.out.println("Paralellopiped hajmi: " + V);
        System.out.print("Paralellopiped to'la srti: " + S);
}
}
