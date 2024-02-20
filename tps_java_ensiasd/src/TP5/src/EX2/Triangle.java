package EX2;

public abstract class Triangle extends FigureGeometrique{
	
	protected int c1,c2,c3;
	
	public Triangle(int l1,int l2,int l3) {
		c1=l1;
		c2=l2;
		c3=l3;
	}
	@Override
	protected abstract double surface();
	@Override
	protected  double perimitre() {
		return c1+c2+c3;
	}

}
