package upload.downloads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadTest {

	@Test
	public void test1() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.naukri.com/");
		
		  driver.get("https://my.naukri.com/account/register/basicdetails");
		  driver.findElement(By.xpath("//button[@value='exp']")).click();
		  driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\TimeMachine\\Desktop\\test.docx");
	}
}
