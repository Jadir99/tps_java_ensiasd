package tp5;

public class Cercle extends Figure {
	final static double PI = 3.141592564 ;
	private double rayon ;
	private double surface ;
	// les constricteurs 
	public Cercle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cercle(double x, double y,double r) {
		super(x, y);
		rayon=r;
		// TODO Auto-generated constructor stub
	}
	public double surface() {
		return rayon*rayon*PI;
	}
	// gettrayon
	public double getRayon() {
		return rayon;
	}
	//setrayon
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	// la methode tostring
	@Override
	public String toString() {
		return "le cyrcle contient rayon :"+rayon+" le x est "+x+" le y est :"+ y;
	}
	//la methode plusgrand
	public boolean PlusGrand(Cercle c) {
		return rayon>=c.rayon;
	}
	

}
