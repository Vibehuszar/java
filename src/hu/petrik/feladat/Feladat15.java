package hu.petrik.feladat;

public class Feladat15 {
    public static void main(String[] args) {
        double tomb[] = new double[25];
        for (int i = 0; i < tomb.length; i++) {
            double rand = (double)Math.random() * 11;
            tomb[i] = rand;

        }
        /* kiiratás
        for (double element: tomb){
            System.out.println(element);
        }
        */
        for (int i = 1; i < tomb.length; i++) {
            System.out.println(Math.pow(tomb[i] , 2));
            i++;
        }

    }
}
