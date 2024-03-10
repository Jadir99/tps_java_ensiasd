package TP7;
public class Personne implements Comparable {
    // This class implements the Comparable interface, indicating that it can be compared to other objects.

    private char sexe;
    private double taille;
    private double pois;
    // These are private instance variables representing the sex, height, and weight of the person.

    public Personne(char sexe, double taille, double pois) {
        // This is a constructor for the Personne class.
        // It takes the sex, height, and weight as parameters and initializes the instance variables.
        this.sexe = sexe;
        this.taille = taille;
        this.pois = pois;
    }

    public char getSexe(){
        // This method returns the sex of the person.
        return sexe;
    }

    public double getTaille() {
        // This method returns the height of the person.
        return taille;
    }

    public double getPois(){
        // This method returns the weight of the person.
        return pois;
    }

    @Override
    public boolean plusPetit(Object obj) {
        // This method is overridden from the Comparable interface.
        // It compares the height of the current person with another object's height.

        if (obj instanceof Personne)
            // Checks if the object is an instance of the Personne class.

            return this.taille < ((Personne) obj).getTaille();
            // If it is, it compares the height of the current person with the other person's height.

        return false;
        // If the object is not an instance of the Personne class, it returns false.
    }

    @Override
    public String toString() {
        // This method is overridden from the Object class.
        // It returns a string representation of the person object.

        return getSexe()+ " mesure " + getTaille() + " metre et pese " + getPois() + " kgs";
        // The returned string contains the sex, height, and weight of the person.
    }
}