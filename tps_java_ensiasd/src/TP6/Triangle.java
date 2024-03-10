package TP6;

public abstract class Triangle extends FigureGeometrique{ // attributs (champs de données, membres de données)
    protected double base, hauteur;
    public Triangle() { }
    public Triangle(double b, double h) {
        base = b ;
        hauteur = h ;
    }
    // méthode pour calculer et retourner la surface
    public double surface() {
        return (hauteur * base) / 2.0 ;
    }
    public String toString() {
        return "Triangle : <hauteur : " + hauteur + ", base : " + base + "> ";
    }
}