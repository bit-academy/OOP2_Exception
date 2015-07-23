public class Exception3 {

	public void method1() {
		throw new RuntimeException();
	}

	public void method2() throws Exception {
		throw new Exception();
	}

	public void method3() throws Exception {
		throw new MyException();
	}

	public static void main(String[] args) {

	}
}

class Exception3_1 extends Exception3 {
	public void method3() {
	}
}

// class Exception3_3 extends Exception3_1 {
// public void method3() throws Exception {
// }
// }

class MyException extends RuntimeException {

}