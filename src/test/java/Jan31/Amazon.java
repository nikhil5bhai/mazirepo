package Jan31;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazon {

	@Test
	public void test1() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/ref=nav_logo");
		List <WebElement> amazonLinks = driver.findElements(By.tagName("/a"));
		
		for (WebElement link: amazonLinks) {
			
			System.out.println(link.getAttribute("href"));
		}
}
}
