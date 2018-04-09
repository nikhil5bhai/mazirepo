package exception.handling;

import org.testng.annotations.Test;

public class Exe3 {
	
	public void aaa() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3() {
		aaa();
	}

}
