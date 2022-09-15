package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a téglalap 'a' oldalát: ");
        double a = sc.nextDouble();
        System.out.print("Adja meg a téglalap 'b' oldalát: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Adjon meg az elvégzendő műveletet (K - kerület, T - terület): ");
        String muvelet = sc.nextLine();
        if (muvelet.equals("K")){
            double kerulet = 2*(a+b);
            System.out.printf("A téglalap kerülete %f cm", kerulet);
        }
        else if (muvelet.equals("T")){
            double terulet = a * b;
            System.out.printf("A téglalap területe %f cm^2", terulet);
        }
        else{
            System.out.println("Rossz műveletet adott meg");
        }
        if (a ==b){
            System.out.println("Ez egy négyzet");
        }

    }
}
