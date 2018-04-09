package poly;

import org.testng.annotations.Test;

public class X {
	
	B b = new B();
	
	@Test
	public void test1() {
		b.getFullName("nikhil", "panchabhai");
	}

}
