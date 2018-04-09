package jan17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertTest {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('Testing for USSSSSSS ');");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss(); //.accept();
	}
}
