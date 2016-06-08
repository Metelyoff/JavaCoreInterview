package oop;

interface Shape {
	void draw();
	void draw(int x);
	int draw(int x,int y);
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Override draw() method in Circle");
	}
	public void draw(int x) {
		System.out.println("Overload draw() method with one argument");
		System.out.println("x="+x);
	}
	public int draw(int x, int y) {
		System.out.println("Overload draw() method with two argument and return value");
		System.out.println("x+y="+(x+y));
		return x+y;
	}
}

class Triangle implements Shape {
	public void draw() {
		System.out.println("Override draw() method in Triangle");
	}
	public void draw(int x) {
		System.out.println("Overload draw() method with one argument");
		System.out.println("x="+x);
	}
	public int draw(int x, int y) {
		System.out.println("Overload draw() method with two argument and return value");
		System.out.println("x+y="+(x*y));
		return x*y;
	}
}

public class TestPolimorphism {
	public static void main(String[] args) {
		Shape shape1 = new Circle();
		Shape shape2 = new Triangle();
		testPoly(shape1);
		testPoly(shape2);
		}

	public static void testPoly(Shape shape) {
		shape.draw();
		shape.draw(1);
		shape.draw(2, 3);
	}
}
