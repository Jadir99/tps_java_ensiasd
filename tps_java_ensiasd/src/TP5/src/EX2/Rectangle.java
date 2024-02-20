package EX2;

public class Rectangle extends Parallelogramme{
	
	

	public Rectangle(double c1, double c2) {
		super(c1, c2);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	protected  double surface() {
		return super.cote1*super.cote2;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
