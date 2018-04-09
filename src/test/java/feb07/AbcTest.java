package feb07;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AbcTest {
	@Test
	public void test1() {
		System.out.println("I am in test1");		
	}
	
	@Test 
	public void test2() {
		System.out.println("I am in test2");		
	}
	
	@BeforeTest
	public void beforetestsample() {
		System.out.println("I am in beforetestsample");
	}
	
	@BeforeMethod
	public void beforemethodsample() {
		System.out.println("I am in beforemethodsample ");
	}
	
	public void hi() {
		System.out.println("hi");
	}

}
