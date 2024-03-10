package TP7;

public class Tri {
    public static void trier(Comparable[] tableau) {

        int n = tableau.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (tableau[j].plusPetit(tableau[minIndex])) {
                    minIndex = j;
                }
            }

            Comparable temp = tableau[minIndex];
            tableau[minIndex] = tableau[i];
            tableau[i] = temp;
        }
    }
}