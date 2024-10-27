package lab4;

public class Circle {
	Point C;
	int radius;
	
	public Circle(Point C, int r) {
		this.C = C;
		radius = r;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public boolean contains(Point A) {
		if(A == null){
			return false;
		}
		double dCA = C.distance(A);
		if(dCA <= radius){
			return true;
		}
		else{
			return false;
		}
	}
}
