package jan17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		
	}
	
	WebDriver driver = new FirefoxDriver();
	
	@Test
	 @Parameters({ "url", "searchText" })
	 public void testParamTest(String url, String searchText) {
	  driver.get(url);
	  driver.findElement(By.id("lst-ib")).sendKeys(searchText);
	  System.out.println("Invoked testString for FUN ");
	 }

}
