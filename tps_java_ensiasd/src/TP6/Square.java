package TP6;

public class Square extends FigureGeometrique{ // attributs (champs de données, membres de données)
    private double cote;
    public Square() { }
    public Square(double c) {
        cote = c ;
    }
    // méthode pour calculer et retourner le périmètre
    public double perimetre(){
        return 4 * cote ;
    }
    // méthode pour calculer et retourner le pétimètre
    public double surface() {
        return cote*cote;
    }
    public String toString() {
    return "Carre avec cote " + cote ;
    }
}
