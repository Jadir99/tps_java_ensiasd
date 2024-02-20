package tp5;

public class cylindre extends Cercle{
	
	private int h;
	private double volume ;
	// constricteur pardefaut
	public cylindre() {
		super();
	}
	
	// constricteur parametre 
	public cylindre(double x, double y, double r,int h) {
		super(x, y, r);
		this.h=h;
		// TODO Auto-generated constructor stub
	}

	// la methode volume 
	public double volume() {
		return super.surface()*h;
	}
	// to string 
	@Override
	public String toString() {
		return "cylindre [h=" + h + ", volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}
	
	
}
