package EX2;

public abstract class FigureGeometrique {

	protected abstract double surface();
	protected abstract double perimitre();
	
	@Override
	public String toString() {
		return "Perimetre : " + perimitre() + "\n" +
		"Surface : " + surface() + "\n";
		}
}
