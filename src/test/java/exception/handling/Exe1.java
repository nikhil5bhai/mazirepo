package exception.handling;

import org.testng.annotations.Test;

public class Exe1 {
	
	String[] names = {"a", "b", "c"};
	
	@Test
	public void test1() throws InterruptedException {
		System.out.println("hi");
		Thread.sleep(8000);
		System.out.println(names[5]);
		
	}

}
