package exception.handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exe5 {
	
	WebDriver driver = new FirefoxDriver();
	
	String[] names = {"a","b","c"};
	
	@Test
	public void test1() {
		try {
			Thread.sleep(1000);
			System.out.println(names[5]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		try {
			Thread.sleep(3000);
			driver.get("1111111$$##@@");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Reached the catch block ");
		}
		  
	}

}
