package uz.isd.begin;

import java.util.Scanner;

public class begin004 {
    public static void main(String[] args) {

        final float pi = (float) 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Aylanani diametrini kiriting:");
        //double a = 0, P = 0;
        float a = scanner.nextFloat();
        float L = pi * a;
        System.out.println("Aylanani uzunligi:" + L);
    }
}
