package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a medence átmérőjét(m): ");
        double atmero = sc.nextDouble();
        System.out.print("Kérem adja meg a medence málységét(m): ");
        double melyseg = sc.nextDouble();
        double sugar = atmero/2;
        double terulet = sugar * sugar *Math.PI;
        double terfogat = terulet * melyseg;
        System.out.printf("A medencébe %.2f köbméter víz fér.", terfogat);

    }
}
