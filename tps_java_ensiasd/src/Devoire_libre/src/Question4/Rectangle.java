package Question4;

public class Rectangle {
	
	protected double c1,c2;
	public Rectangle(double c1, double c2) {
		this.c1=c1;
		this.c2=c2;
	}

	
	protected  double perimitre() {
		return 2*(c1+c2);
	}
	protected  double surface() {
		return c1*c2;
	}

	@Override
	public String toString() {
		return "les segements sont : "+c1+" et "+c2+" Perimitre : "+perimitre()+" surface: "+surface();
	}
}
