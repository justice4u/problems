package uz.isd.begin;

import java.util.Scanner;

public class begin005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kubning tomonini kiriting: ");

        double a = scanner.nextDouble();
        double V = a * a * a;
        double S = 6 * a * a ;
        System.out.println("Kubning hajmi: " + V);
        System.out.print("Kubning to'la srti: " + S);

    }
}
