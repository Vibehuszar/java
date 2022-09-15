package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a dolgozat eredményét (0-100): " );
        int pontszam = sc.nextInt();
        if (pontszam < 43){
            System.out.printf("A dolgozat osztályzata: elégtelen");
        }
        else if (pontszam < 58) {
            System.out.printf("A dolgozat osztályzata: elégséges");
        }
        else if (pontszam < 73) {
            System.out.printf("A dolgozat osztályzata: közepes");
        }
        else if (pontszam < 88) {
            System.out.printf("A dolgozat osztályzata: jó");
        }
        else{
            System.out.printf("A dolgozat osztályzata: jeles");

        }
    }
}
