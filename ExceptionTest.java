public class ExceptionTest {
	public void m(int i) {
		int j = 99 / i;

		System.out.println(String.format("99를 %d로 나눈 몫은 %d 입니다.", i, j));
	}

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		ExceptionTest t = new ExceptionTest();

		t.m(i);

		System.out.println("end of main");
	}
}
