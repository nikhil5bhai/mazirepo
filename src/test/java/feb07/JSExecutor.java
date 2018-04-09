package feb07;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JSExecutor {

	@Test
	public void a() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		
		// JavascriptExecutor is used when normal click doesn't work 
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        js.executeScript("arguments[0].click();", gmailLink);


	}

}
