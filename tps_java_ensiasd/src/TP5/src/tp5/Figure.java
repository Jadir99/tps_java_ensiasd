package tp5;

public class Figure {
		double x, y ;
		public Figure() {
		x = 0 ; y = 0 ;
		}
		public Figure(double x, double y) {
		this.x = x ; this.y = y ;
		}
		public String toString() {
		return "Position : (" + x + "," + y + ")" ;
		}
}
