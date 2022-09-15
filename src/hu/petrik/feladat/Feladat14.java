package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy stringet: ");
        String szo = sc.nextLine();
        String valasz = "";
        while (!valasz.equals("f")){
            System.out.println("Mit szeretne a bekért szöveggel?" +
                        "\n a - Nagy betűssé alakítani" +
                        "\n b - Kisbetűssé alakítani" +
                        "\n c - Lekérdezni a hosszát" +
                        "\n d - Összehasonlítani egy másik stringel" +
                        "\n e - Egy részét kiiratni a stringnek" +
                        "\n f - Kilépni ");
                valasz = sc.nextLine();
                switch (valasz){
                    case "a" :
                        System.out.println(szo.toUpperCase());
                        break;
                    case "b" :
                        System.out.println(szo.toLowerCase());
                        break;
                    case "c" :
                        System.out.printf("A szöveg hossza %d karakter", szo.length());
                        break;
                    case "d" :
                        System.out.print("Kérem adja meg a másik szöveget: ");
                        String szo2 = sc.nextLine();
                        int osszehasonlitas = szo.compareTo(szo2);
                        if (osszehasonlitas == 0){
                            System.out.println("A két szöveg megegyezik");
                        } else if (osszehasonlitas < 0) {
                            System.out.println("Az első előrébb van az ABC-ben");
                        }
                        else {
                            System.out.println("A második előrébb van az ABC-ben");
                        }
                        break;
                    case "e" :
                        System.out.println("Kérem adja meg az első kiirandó karakter sorszámát: ");
                        int a = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Kérem adja meg az utolsó kiirandó karakter sorszámát: ");
                        int b = sc.nextInt();
                        sc.nextLine();
                        System.out.println(szo.substring( a- 1, b - 1));
                        break;
                    case "f" :
                        System.out.println("Viszlát!");
                        break;
                    default:
                        System.out.println("Nem létezik.");
                        break;
                }

        }

    }
}
