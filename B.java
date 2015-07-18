class A {
	int f;

	void m() {
	}
}

public class B extends A {
	int f; // 상위클래스의 몀버변수명과 동일한 경우
	int f2;

	void m2() {
	}

	public static void main(String[] args) {
		A a = new A();
		a.f++; // A클래스의 f를 접근한 것일까? B클래스의 f를 접근한 것일까?
		a.m();
		// a.f2++; // 오류. 하위클래스의 변수를 상위클래스 객체에서 사용할 수 없다.
		// a.m2(); // 오류. 하위클래스의 변수를 상위클래스 객체에서 사용할 수 없다.

		B b = new B();
		b.f2++;
		b.m2();
		b.f++; // 상위클래스의 변수는 하위클래스 객체에 상속되었으므로 실행가능.
		b.m();
	}
}
