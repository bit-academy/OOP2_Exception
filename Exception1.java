public class Exception1 {
	public static void main(String[] args) {
		try {
			int i = 1 / 0;
		} catch (ArithmeticException ae) {
			System.out.println("수연산예외 : " + ae);
			ae.printStackTrace();
		} catch (Exception e) {
			System.out.println("기타 예외 : " + e);
		}
	}
}
