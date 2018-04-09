package exception.handling;

import org.testng.annotations.Test;

public class Exe2 {
	
	@Test
	public void test1() throws InterruptedException {		
		abc();
		
	}
	
	public void abc() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public void xyz() throws InterruptedException {
		test1();
	}
	
	public void mno() throws InterruptedException {
		xyz();
	}

}

