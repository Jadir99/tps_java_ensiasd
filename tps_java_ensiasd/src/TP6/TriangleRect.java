package TP6;

public class TriangleRect extends Triangle{ 
    public TriangleRect(double b, double h) {
        super(b, h);
    }
    // méthode pour calculer et retourner le périmètre
    public double perimetre(){
        return hauteur + base +
        Math.sqrt(hauteur*hauteur + base*base);
    }
    // méthode pour calculer et retourner la surface
    public double surface() {
        return super.surface();
    }
    public String toString() {
        return super.toString() + " \n\t\t(triangle rectangulaire)";
    }
}
