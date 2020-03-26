package uz.isd.begin;

import java.util.Scanner;

public class begin003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadrat a tomonini kiriting: ");
        double a = scanner.nextDouble();
        System.out.print("Kvadrat b tomonini kiriting: ");
        double b = scanner.nextDouble();
        double S = a*b;
        double P = 2 * (a + b);
        System.out.println("Kvadrat  perimetri:" + P);
        System.out.println("Kvadrat  kvadrat yuzi:" + S);
    }
}
