class Const_A {
	static void print(String msg) {
		System.out.println(msg);
	}

	public Const_A() {
		print("생성자 Const_A() 실행");
	}

	public Const_A(int i) {
		print("생성자 Const_A(int) 실행");
	}
}

class Const_B extends Const_A {
	public Const_B() {
		print("생성자 Const_B() 실행");
	}

	public Const_B(String s) {
		super(Integer.parseInt(s));

		print("생성자 Const_B(String) 실행");
	}
}

public class ConstTest2 {
	public static void main(String[] args) {
		new Const_B();
	}
}
