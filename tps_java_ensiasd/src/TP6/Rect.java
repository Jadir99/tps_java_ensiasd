package TP6; // Package declaration stating the package name

public class Rect extends FigureGeometrique { // Definition of a class named Rect which extends FigureGeometrique class

    // Attributes (data fields, members)
    private double longueur, largeur; // Declaration of private instance variables 'longueur' and 'largeur'

    // Default constructor
    public Rect() { 
        // Default constructor, does not initialize any values explicitly
    }

    // Parameterized constructor
    public Rect(double lo, double largeur) { 
        // Constructor with parameters 'lo' and 'largeur'
        longueur = lo; // Assigning the value of 'lo' to the instance variable 'longueur'
        this.largeur = largeur; // Assigning the value of 'largeur' to the instance variable 'this.largeur'
    }

    // Constructor with a single parameter (square)
    public Rect(double c) { 
        // Constructor with a single parameter 'c'
        this(c, c); // Invoking another constructor with both parameters set to 'c' using 'this' keyword
    }

    // Method to calculate and return the perimeter
    public double perimetre(){
        return 2 * (longueur + largeur); // Calculation of perimeter based on the length and width
    }

    // Method to calculate and return the surface area
    public double surface() {
        return longueur * largeur ; // Calculation of surface area based on the length and width
    }

    // toString method overriding
    public String toString() {
        return "Rectangle : <" + longueur + ", " + largeur + ">"; // Returns a string representation of the rectangle's dimensions
    }
}
