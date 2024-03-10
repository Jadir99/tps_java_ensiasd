
package TP7;
// The code is part of the TP7 package.

public class Main {
    public static void main(String[] args) {
        // The main method is the entry point of the program.

        // Create arrays of different objects
        Comparable[] personnes = {
            new Personne('M', 1.75, 65.3),
            new Personne('F', 1.62, 69.1),
            new Personne('F', 1.89, 76.5),
            new Personne('M', 1.45, 50.3),
            new Personne('M', 1.77, 90.1)
        };
        // An array of Personne objects representing different people.

        Comparable[] rectangles = {
            new Rectangle(12, 5),
            new Rectangle(9, 6),
            new Rectangle(60, 12),
            new Rectangle(5, 12)
        };
        // An array of Rectangle objects representing different rectangles.

        Comparable[] pays = {
            new Pays("Paris"),
            new Pays("Berlin"),
            new Pays("Madrid"),
            new Pays("Rome")
        };
        // An array of Pays objects representing different countries.

        System.out.println("\nListe des PersInterfs avant le tri");
        // Print a message indicating the list of Personne objects before sorting.

        for (Comparable personne : personnes) {
            System.out.println(personne);
            // Iterate over the personnes array and print each Personne object.
        }

        Tri.trier(personnes);
        // Call the static method "trier" from the "Tri" class to sort the personnes array.

        System.out.println("\nListe des PersInterfs apres le tri");
        // Print a message indicating the list of Personne objects after sorting.

        for (Comparable personne : personnes) {
            System.out.println(personne);
            // Iterate over the personnes array and print each Personne object after sorting.
        }

        System.out.println("\nListe des RectInterfs avant tri selon la surface :");
        // Print a message indicating the list of Rectangle objects before sorting.

        for (Comparable rectangle : rectangles) {
            System.out.println(rectangle);
            // Iterate over the rectangles array and print each Rectangle object.
        }

        Tri.trier(rectangles);
        // Call the static method "trier" from the "Tri" class to sort the rectangles array.

        System.out.println("\nListe des RectInterfs apres tri selon la surface :");
        // Print a message indicating the list of Rectangle objects after sorting.

        for (Comparable rectangle : rectangles) {
            System.out.println(rectangle);
            // Iterate over the rectangles array and print each Rectangle object after sorting.
        }

        System.out.println("\nListe des Pays non trie selon leur capital :");
        // Print a message indicating the list of Pays objects before sorting.

        for (Comparable paysItem : pays) {
            System.out.println(paysItem);
            // Iterate over the pays array and print each Pays object.
        }

        Tri.trier(pays);
        // Call the static method "trier" from the "Tri" class to sort the pays array.

        System.out.println("\nListe des Pays trie selon leur capital :");
        // Print a message indicating the list of Pays objects after sorting.

        for (Comparable paysItem : pays) {
            System.out.println(paysItem);
            // Iterate over the pays array and print each Pays object after sorting.
        }
    }
}