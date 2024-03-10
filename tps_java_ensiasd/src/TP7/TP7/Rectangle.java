package TP7;

public class Rectangle implements Comparable {
    // This class implements the Comparable interface, indicating that it can be compared to other objects.

    private double longueur;
    private double largeur;
    // These are private instance variables representing the length and width of the rectangle.

    public Rectangle(double longueur, double largeur) {
        // This is a constructor for the Rectangle class.
        // It takes the length and width as parameters and initializes the instance variables.
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur(){
        // This method returns the length of the rectangle.
        return longueur;
    }

    public double getLargeur(){
        // This method returns the width of the rectangle.
        return largeur;
    }

    public double getSurface() {
        // This method calculates and returns the surface area of the rectangle.
        return longueur * largeur;
    }

    @Override
    public boolean plusPetit(Object obj) {
        // This method is overridden from the Comparable interface.
        // It compares the surface area of the current rectangle with another object's surface area.

        if (obj.getClass().getName() == "TP7.Rectangle")
            // Checks if the object is an instance of the Rectangle class.

            return this.getSurface() < ((Rectangle) obj).getSurface();
            // If it is, it compares the surface area of the current rectangle with the other rectangle.

        return false;
        // If the object is not an instance of the Rectangle class, it returns false.
    }

    @Override
    public String toString() {
        // This method is overridden from the Object class.
        // It returns a string representation of the rectangle object.

        return "< Longueur : " + getLongueur() +", surface: " + getSurface() + ">";
        // The returned string contains the length and surface area of the rectangle.
    }
}