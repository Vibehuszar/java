package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fej vagy írás? (0 - fej, 1 - írás): ");
        int tipp = sc.nextInt();
        int gepdobas = (int)(Math.random() *2);
        /*
        Egész szám generálása 'min' és 'max' között:
        (int)(Math.random() * (max-min+1))+min
         */
        System.out.printf("Dobás eredménye: %s", gepdobas == 0 ? "fej" : "írás");
        /*
        Háromlábú operátor:
        (logikai_feltérel) ? érték_ha_igaz : érték_ha_hamis
         */
        if (gepdobas == tipp){
            System.out.println("Gratulálok ön nyert");
        }
        else {
            System.out.println("Most nem nyert, próbálkozzon újra");
        }

    }
}
