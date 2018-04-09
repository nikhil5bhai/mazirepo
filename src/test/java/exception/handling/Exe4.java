package exception.handling;

import org.testng.annotations.Test;

public class Exe4 {

	String[] names = { "a", "b", "c" };

	@Test
	public void test5() throws Exception {
		System.out.println(names[6]);

	}

	@Test
	public void test6() {
		try {
			System.out.println(names[5]);
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
}
