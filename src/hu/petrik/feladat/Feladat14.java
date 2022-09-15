package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy stringet: ");
        String szo = sc.nextLine();
        String valasz = "";
        do {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Mit szeretne a bekért szöveggel?" +
                    "\n a - Nagy betűssé alakítani" +
                    "\n b - Kisbetűssé alakítani" +
                    "\n c - Lekérdezni a hosszát" +
                    "\n d - Összehasonlítani egy másik stringel" +
                    "\n e - Egy részét kiiratni a stringnek" +
                    "\n f - Kilépni ");
            valasz = sc.nextLine();


        }while(valasz != "f");
    }
}
