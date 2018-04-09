package sta;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Aaa {
	int i =10;
	static String name = "vin";
	
	public void hello() {
		
		System.out.println("hello");
	}
	
	public static void hi() {   //private
		System.out.println("hi");
		System.out.println(name);
		//System.out.println(i);
	}
	
	static {
		System.out.println("I am in static");
	}
	
	static {
		System.out.println("I am in static 2");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
	
	@Test
	public void test1() {
		System.out.println(i);
	}

}
