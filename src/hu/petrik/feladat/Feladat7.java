package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg hányadik hónapot írjuk: ");
        int honap = sc.nextInt();
        if (honap < 3 || honap == 12){
            System.out.printf("A jelenlegi évszak: Tél");
        }
        else if (honap < 6){
            System.out.printf("A jelenlegi évszak: Tavasz");
        }
        else if (honap < 9){
            System.out.printf("A jelenlegi évszak: Nyár");
        }
        else {
            System.out.printf("A jelenlegi évszak: Ősz");
        }
    }
}
