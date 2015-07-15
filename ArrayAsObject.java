public class ArrayAsObject {
	public static void main(String[] args) {
		print(args);
	}

	static void print(Object args) {
		System.out.println(args);

		Object[] argsObj = (Object[]) args;
		System.out.println("Object[] 의 길이 : " + argsObj.length);

		String[] argsStr = (String[]) args;
		for (int i = 0, len = argsStr.length; i < len; i++) {
			System.out.println("String[" + i + "] : " + argsStr[0]);
		}
	}
}
