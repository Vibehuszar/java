package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        int tipp = 0;
        int szam = (int)(Math.random() * 101);
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Melyik számra gondoltam? (1-100): ");
            tipp = sc.nextInt();
            if (tipp < szam){
                System.out.println("A gondolt szám nagyobb");
            }
            else{
                System.out.println("A gondolt szám kisebb");
            }
        }while(tipp != szam);
        if (szam == tipp){
            System.out.printf("Talált");
        }
    }
}
