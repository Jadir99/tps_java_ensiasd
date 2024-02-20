package EX2;

public abstract class Parallelogramme extends FigureGeometrique{
	
	protected double cote1,cote2;
	
	// Parallelogramme
    public Parallelogramme(double c1,double c2) {
    	cote1=c1;
    	cote2=c2;
    }
    
    
	
	public double getCote1() {
		return cote1;
	}



	public void setCote1(double cote1) {
		this.cote1 = cote1;
	}



	public double getCote2() {
		return cote2;
	}



	public void setCote2(double cote2) {
		this.cote2 = cote2;
	}



	@Override
	protected abstract double surface();
	@Override
	protected double perimitre() {
		return 2*(cote1+cote2);
	}



	@Override
	public String toString() {
		return "Parallelogramme [cote1=" + cote1 + ", cote2=" + cote2 + "]";
	}
	
	

}
