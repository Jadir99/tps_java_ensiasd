package EX2;

public class Carre extends Rectangle{
	
	
	public Carre(double c1 ) {
		super(c1,c1);
	}
	
	@Override
	public String toString() {
		return "le segment est : "+super.cote1+" la surface est :"+super.surface();
	}

}
