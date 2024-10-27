package lab4;
public class Test_circle{
@Test
public void test_perimeter(){
    Point p = new Point(0,0);
    Circle c = new Circle(p,1);
    assertEquals(c.perimeter(),2 * Math.PI * 1);
}

@Test
public void test_area(){
    Point p = new Point(0,0);
    Circle c = new Circle(p,2);
    assertEquals(c.area(),Math.PI * 4);
}  

@Test
public void test_contains_1(){
    Point p = new Point(0,0);
    Circle c = new Circle(p,2);
    assertNull(c.contains(null));
}

@Test
public void test_contains_2(){
    Point p = new Point(0,0);
    Circle c = new Circle(p,2);
    assertTrue(c.contains(new Point(1,1)));
}

@Test
public void test_contains_3(){
    Point p = new Point(0,0);
    Circle c = new Circle(p,2);
    assertFalse(c.contains(new Point(3,3)));
}