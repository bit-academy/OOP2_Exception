class Shape1 {
}

class Circle1 extends Shape1 {
}

public class UpcastingTest {
	public static void main(String[] args) {
		Shape1 s = new Circle1(); // Upcastring
		Circle1 c = new Circle1();
	}
}
