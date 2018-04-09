package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShoppingKartJan31 {

	// WebDriver driver = new FirefoxDriver();

	@Test
	public void launchingProductsTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mishoppingkart.com/ShoppingCart/");
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
		WebElement nextButton = driver.findElement(By.xpath("//a[@class='paginate_button next']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		List<WebElement> elements = new ArrayList<WebElement>();
		while (nextButton.isEnabled()) {
			System.out.println("Next button " + nextButton);
			// nextButton = driver.findElement(By.xpath("//a[@class='paginate_button
			// next']"));
			List<WebElement> products = driver.findElements(By.xpath("//table//td[2]"));
			elements.addAll(products);
			nextButton.click();
			if (driver.findElements(By.xpath("//a[@class='paginate_button next']")).size() > 0) {
				nextButton = driver.findElement(By.xpath("//a[@class='paginate_button next']"));
			} else {

				break;
			}
		}

	}
}
