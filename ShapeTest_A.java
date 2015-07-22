public class ShapeTest_A {

	public void m(Shape_A s) {
		// s가 Circle타입의 객체라면
		if (s instanceof Circle_A) {
			Circle_A c = (Circle_A) s;
			c.makeAC();
		} // s 가 Rectangle타입의 객체라면
		else if (s instanceof Rectangle_A) {
			Rectangle_A r = (Rectangle_A) s;
			r.makeAR();
		}

		s.display();
	}

	public static void main(String[] args) {
		ShapeTest_A t = new ShapeTest_A();
		t.m(new Shape_A());
		t.m(new Circle_A(6));
		t.m(new Rectangle_A(4, 5));
	}
}

class Shape_A {
	protected double area;

	public void display() {
		System.out.println("면적은 " + this.area + "입니다.");
	}

	public double getArea() {
		return area;
	}
}

class Circle_A extends Shape_A {
	private double radius;

	public Circle_A(int radius) {
		this.radius = radius;
	}

	public void makeAC() {
		area = Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class Rectangle_A extends Shape_A {
	private double width;
	private double height;

	public Rectangle_A(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public void makeAR() {
		area = width * height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
