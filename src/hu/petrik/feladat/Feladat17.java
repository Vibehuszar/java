package hu.petrik.feladat;

public class Feladat17 {

    public static void main(String[] args) {
        int[] tomb1 = new int[]{1, 2, 3, 4, 5};
        int[] tomb2 = new int[]{6, 7, 8, 9, 10};
        int[] tomb3 = new int[5];
        for (int i = 0; i < tomb1.length; i++) {
            tomb3[i] = tomb1[i] + tomb2[i];
            System.out.println(tomb3[i] + "\n");
    }
}
}