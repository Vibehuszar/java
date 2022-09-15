package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy összeget 1 és 1000 között (Ft): ");
        double szam = sc.nextInt();
        double osszeg = Math.ceil(szam / 5) *5 ;
        System.out.println(osszeg);
        int ketszaz = 0;
        int szaz = 0;
        int otven = 0;
        int husz = 0;
        int tiz = 0;
        int ot = 0;

        while (osszeg > 200-1){
            if (osszeg % 200 >= 0 && osszeg >= 200){
                ketszaz++;
                osszeg = osszeg - 200;
            }
        }

        while (osszeg > 100-1){
            if (osszeg % 100 >= 0 && osszeg >= 100){
                szaz++;
                osszeg = osszeg - 100;
            }
        }

        while (osszeg > 50-1){
            if (osszeg % 50 >= 0 && osszeg >= 50){
                otven++;
                osszeg = osszeg - 50;
            }
        }

        while (osszeg > 20-1){
            if (osszeg % 20 >= 0 && osszeg >= 20){
                husz++;
                osszeg = osszeg - 20;
            }
        }

        while (osszeg > 10-1){
            if (osszeg % 10 >= 0 && osszeg >= 10){
                tiz++;
                osszeg = osszeg - 10;
            }
        }

        while (osszeg > 5-1){
            if (osszeg % 5 >= 0 && osszeg >= 5){
                ot++;
                osszeg = osszeg - 5;
            }
        }

        System.out.printf("%s forintot a legkevesebb érméből összeállítani " +
                "az alábbi módon lehet: %s db 200-as, %s db 100-as, %s db 50-es, %s db 20-as, %s db 10-es és %s db 5-ös",
                szam, ketszaz, szaz, otven, husz, tiz, ot);



    }
}
