package lab4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTestsExtra {

	@Test
	void testValidSquare() {
	    Point p1 = new Point(0, 0);
	    Point p2 = new Point(0, 1);
	    Point p3 = new Point(1, 1);
	    Point p4 = new Point(1, 0);
	    
	    Square square = new Square(p1, p2, p3, p4);
	    
	    assertNotNull(square);
	    assertEquals(p1, square.A);
	    assertEquals(p2, square.B);
	    assertEquals(p3, square.C);
	    assertEquals(p4, square.D);
	}
	
	@Test
	void testInvalidSquareDifferentSidesFirstCheck() {
	    Point p1 = new Point(0, 0);
	    Point p2 = new Point(0, 2);
	    Point p3 = new Point(1, 1);
	    Point p4 = new Point(1, 0);
	    
	    try {
	        new Square(p1, p2, p3, p4);
	        fail("Expected IllegalArgumentException for invalid square with unequal sides in first check.");
	    } catch (IllegalArgumentException e) {
	        assertEquals("Entered points do not make a square.", e.getMessage());
	    }
	}
	
	@Test
	void testInvalidSquareDifferentSidesSecondCheck() {
	    Point p1 = new Point(0, 0);
	    Point p2 = new Point(1, 0);
	    Point p3 = new Point(2, 1);
	    Point p4 = new Point(1, 2);
	    
	    try {
	        new Square(p1, p2, p3, p4);
	        fail("Expected IllegalArgumentException for invalid square with unequal sides in second check.");
	    } 
	    catch (IllegalArgumentException e) {
	        assertEquals("Entered points do not make a square.", e.getMessage());
	    }
	}
	
	@Test
	void testInvalidSquareDifferentSidesThirdCheck() {
	    Point p1 = new Point(0, 0);
	    Point p2 = new Point(0, 1);
	    Point p3 = new Point(2, 1);
	    Point p4 = new Point(2, 0);
	    
	    try {
	    	new Square(p1, p2, p3, p4);
	        fail("Expected IllegalArgumentException for invalid square with unequal sides in third check.");
	    } 
	    catch (IllegalArgumentException e) {
	        assertEquals("Entered points do not make a square.", e.getMessage());
	    }
	}
	
	@Test
	void testPerimeter() {
	    Point p1 = new Point(0, 0);
	    Point p2 = new Point(0, 1);
	    Point p3 = new Point(1, 1);
	    Point p4 = new Point(1, 0);
	    Square square = new Square(p1, p2, p3, p4);
	    
	    double perimeter = square.perimeter();
	    
	    assertEquals(4.0, perimeter);
	}

}
