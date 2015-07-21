class MyType {
	private String type;

	public MyType(String _type) {
		type = _type;
	}

	public String toString() {
		return "my type: " + type;
	}
}

class DefaultType {

}

public class PolymorphismTest1 {
	public void printObject(Object obj) {
		System.out.println(obj.toString());
	}

	public static void main(String[] args) {
		System.out.println(new MyType("my type"));
		System.out.println(new DefaultType());
		System.out.println(new PolymorphismTest1());
	}
}
