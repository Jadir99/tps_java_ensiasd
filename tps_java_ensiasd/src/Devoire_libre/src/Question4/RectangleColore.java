package Question4;

public class RectangleColore extends Rectangle{

		String colore;
		
		// constricteur 
	public RectangleColore(double c1, double c2,String a) {
		super(c1, c2);
		colore=a;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+" colore est :"+colore;
	}

}
