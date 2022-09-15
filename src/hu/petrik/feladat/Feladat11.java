package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy pozitív egész számot: ");
        int szam = sc.nextInt();
        int osszeg = 0;
        for (int i = 0; i < szam; i++) {
            if (i % 2 != 0){
                osszeg += i;
            }
        }
        System.out.printf("A(z) %d -nál/nél nem nagyobb pozitív páratlan számok összege: %d ", szam, osszeg);
    }
}
