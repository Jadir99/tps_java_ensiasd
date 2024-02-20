package EX2;

public class TriangleRectangle extends Triangle{

	public TriangleRectangle(int l1, int l2, int l3,int h) {
		super(l1, l2, l3);
		this.h=h;
		// TODO Auto-generated constructor stub
	}


	private int h;
	
	
	@Override 
	public double surface() {
		return super.c1*h/2;
	}

}
