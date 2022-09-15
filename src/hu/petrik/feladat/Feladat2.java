package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a terület szélességét (m): ");
        double szelesseg = sc.nextDouble();
        System.out.print("Adja meg a terület magasságát (m): ");
        double magassag = sc.nextDouble();
        double terulet = szelesseg * magassag;
        double csempe = terulet / 0.04 *1.1;

        System.out.printf("%f darab csempe szükséges", csempe);


    }
}
