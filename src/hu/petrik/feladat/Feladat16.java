package hu.petrik.feladat;

import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        int[] tomb = new int[5];
        int index = 1;
        for (int i = 0; i < tomb.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Adja meg a(z) %s. számot: ", index);
            tomb[i] = sc.nextInt();
            index++;
        }
        System.out.print("Elemek sorrendben: ");
        for (int element: tomb){
            System.out.print(element + ", ");
        }
        System.out.print("\nElemek visszafele: ");
        for (int i = tomb.length-1; i >=0 ; i--) {
            System.out.print(tomb[i] + ", ");
        }
        System.out.print("\nMinden második elem: ");
        for (int i = 0; i < tomb.length-1; i++) {
            i++;
            System.out.print(tomb[i] +", ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nAdjon meg egy számot 1 és 5 között: ");
        int index2 = sc.nextInt();
        System.out.printf("\nA(z) %s. elem: %s", index2, tomb[index2-1]);
    }
}
