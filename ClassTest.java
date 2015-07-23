import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
	public int myInt = 10;

	public void printString(String string) {
		System.out.println(string);
	}

	public static void staticPrint(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) throws ClassNotFoundException {
		ClassTest classTest = new ClassTest();

		try {
			Class<?> clazz_ClassTest = Class.forName("ClassTest");

			Field field_myInt = clazz_ClassTest.getField("myInt");
			int fieldValue = field_myInt.getInt(classTest);

			Method method_printString = clazz_ClassTest.getMethod(
					"printString", String.class);
			method_printString.invoke(classTest, "field 값: " + fieldValue);

			Method method_staticPrint = clazz_ClassTest.getMethod(
					"staticPrint", String.class);
			method_staticPrint.invoke(null,
					"staticPrint() 호출할 때에는 instance 가 필요없음.");
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
		}

	}
}
