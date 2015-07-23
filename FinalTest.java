public class FinalTest {
}

class MySuper {
	final int a = 0;

	final void callMe() {
	}
}

final class MyChild extends MySuper {
	{
		// a = 5;
	}

	// void callMe() {
	// }
}

// class MyFinal extends MyChild {
// }
