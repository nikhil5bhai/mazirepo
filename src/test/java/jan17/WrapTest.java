package jan17;

import org.testng.annotations.Test;

public class WrapTest {
	String num = "100";
	
	@Test
	
	public void test1() {
		 int i = Integer.parseInt(num);
		 String s = Integer.toString(i);
		 System.gc();
	}
}
