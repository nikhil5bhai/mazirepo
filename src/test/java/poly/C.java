package poly;

import org.testng.annotations.Test;

public class C extends B{
	
	@Test
	public void test3() {
		super.getFullName("", ""); // method from parent class B, not grandparent A as visibility is gone
	}
}
