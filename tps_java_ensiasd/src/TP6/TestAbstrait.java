package TP6;


public class TestAbstrait {
    public static void main(String[] args) {
        // Instanciation des objets de sous-classes
        FigureGeometrique[] figure = {
            new Square(10),
            new Circle(2.4),
            new Square(5),
            new Rect(12, 8), 
            new Circle(3.5),
            new Square(4.5),
            new Rect(6, 4),
            new TriangleRect(12, 8)
        };

        int nbFigures = figure.length;
        System.out.println("Le nombre de figures : " + nbFigures);

        double sommeSurface = 0.0, sommePerimetre = 0.0;
        for (int i = 0; i < nbFigures; i++) {
            System.out.println("Figure indice " + i + " => " + figure[i]);
            sommeSurface += figure[i].surface();
            sommePerimetre += figure[i].perimetre();
        }

        System.out.println("\nTotal de surfaces : " + sommeSurface + "\n");
        System.out.println("Total de perimetre : " + sommePerimetre + "\n");
    }
}