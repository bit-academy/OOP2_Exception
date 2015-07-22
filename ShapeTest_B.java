public class ShapeTest_B {

	public void m(Shape_B s) {
		s.makeArea();
		s.display();
	}

	public static void main(String[] args) {
		ShapeTest_B t = new ShapeTest_B();
		t.m(new Shape_B());
		t.m(new Circle_B(6));
		t.m(new Rectangle_B(4, 5));
	}
}

class Shape_B {
	protected double area;

	public void display() {
		System.out.println("면적은 " + this.area + "입니다.");
	}

	public void makeArea() {
	}

	public double getArea() {
		return area;
	}
}

class Circle_B extends Shape_B {
	private double radius;

	public Circle_B(int radius) {
		this.radius = radius;
	}

	public void makeArea() {
		area = Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class Rectangle_B extends Shape_B {
	private double width;
	private double height;

	public Rectangle_B(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public void makeArea() {
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
