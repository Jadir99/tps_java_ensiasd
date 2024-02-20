package EX2;

public class main {
	
	static double surfaceTotale(FigureGeometrique[] tableau) {
		double totSurface = 0.0;
		for (int i = 0 ; i < tableau.length ; i++)
		totSurface += tableau[i].surface();
		return totSurface;
		}
	public static void main (String[] args)
	{
		
	Rectangle rect1 = new Rectangle(10.0,6.5);
	System.out.println("Infos de rect1 :\n" + rect1);
	Cercle c1 = new Cercle(10.0);
	System.out.println("Infos du cercle c1 :\n" + c1);
	FigureGeometrique[] tabFG =
	{ new Rectangle(10.0, 4.0),
	new Cercle(5.0),
	new Rectangle(8.6, 4.4),
	new Rectangle(14.2, 10.8),
	new Carre(6.0)};
	
	System.out.println("Surface totale pour acheter " +
	"de la peinture: " +
	surfaceTotale(tabFG));
	}

}
