class Shape2 {
}

class Circle2 extends Shape2 {
}

public class DowncastingTest {
	public static void main(String[] args) {
		Shape2 s1 = new Shape2();
		Circle2 c1 = (Circle2) s1; // Downcastring

		Shape2 s2 = new Circle2();
		Circle2 c2 = (Circle2) s2; // 객체를 바라보는 view 의 문제
	}
}
