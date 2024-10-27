package lab4;
public class Square {
	
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Square(Point one, Point two, Point three, Point four) {
		
		// Checking that a square is entered (equal side lengths).
		if(one.distance(three) == two.distance(four) && one.distance(two) == two.distance(three) && two.distance(three) == three.distance(four) && three.distance(four) == four.distance(one)) {
			this.A = one;
			this.B = two;
			this.C = three;
			this.D = four;
		}
		else {
			throw new IllegalArgumentException("Entered points do not make a square.");
		}
	}
	
	public double perimeter() {
		return 4*(A.distance(B));
	}
	
	public double area() {
		return (A.distance(B))*(B.distance(C));
	}
	
	public double getSideLength() {
		return A.distance(B);
	}
	
	public double getDiagonalLength() {
		return Math.sqrt(2*(A.distance(B))*(B.distance(C)));
	}
	
}
