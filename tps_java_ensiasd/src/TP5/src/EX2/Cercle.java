package EX2;

public class Cercle extends FigureGeometrique{
	
	private double r;
	
	public Cercle(double d) {
		this.r=d;
	}
	
	@Override
	protected  double surface() {
		return r*r*Math.PI;
	}
	@Override
	protected  double perimitre() {
		return r*2*Math.PI;
	}

}
