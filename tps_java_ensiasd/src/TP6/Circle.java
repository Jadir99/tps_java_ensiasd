package TP6;

public class Circle extends FigureGeometrique{ // attributs (champs de données, membres de données)
    private double rayon;
    public Circle() { }
    public Circle(double r) {
        rayon = r ;
    }
    // méthode pour calculer et retourner le périmètre
    public double perimetre(){
        return 2 * Math.PI * rayon ;
    }
    // méthode pour calculer et retourner le pétimètre
    public double surface() {
        return Math.PI * rayon * rayon ;
    }
    public String toString() {
        return "Cercle de rayon " + rayon ;
    }
}