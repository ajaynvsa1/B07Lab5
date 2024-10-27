package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Squaretesting {
	
	@Test
    void testAreaSquare() {
        Point p11 = new Point(2.0, 0.0);
        Point p22 = new Point(2.0, 2.0);
        Point p33 = new Point(0.0, 2.0);
        Point p44 = new Point(0.0, 0.0);
        Square square = new Square(p11, p22, p33, p44);
        double expval = 4.0;
        assertEquals(expval, square.area());
    }
	
	@Test
	void testGetSideLength() {
		Point p11 = new Point(4.0, 0.0);
        Point p22 = new Point(4.0, 4.0);
        Point p33 = new Point(0.0, 4.0);
        Point p44 = new Point(0.0, 0.0);
        Square square = new Square(p11, p22, p33, p44);
        double expval = 4.0;
        assertEquals(expval, square.getSideLength());
	}
	
	@Test
	void testGetDiagonalLengthSquare() {
		Point p11 = new Point(6.0, 0.0);
        Point p22 = new Point(6.0, 6.0);
        Point p33 = new Point(0.0, 6.0);
        Point p44 = new Point(0.0, 0.0);
        Square square = new Square(p11, p22, p33, p44);
        double expval = 6 * Math.sqrt(2);
        assertEquals(expval, square.getDiagonalLength(), 0.01);
	}

}
