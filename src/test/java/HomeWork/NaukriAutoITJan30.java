package HomeWork;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NaukriAutoITJan30 {

	@Test
	public void test1() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String windowHandle : allWindowHandles) {
			if (windowHandle.equals(mainWindowHandle)) {
				// driver.switchTo().window(mainWindowHandle);
			} else {

				driver.switchTo().window(windowHandle);
				driver.close();
			}
		}
		driver.findElement(By.xpath("//input[@value='Upload CV']")).click();

		Runtime runtime = Runtime.getRuntime();
		String[] cmd = { "File Upload" };
		runtime.exec("NaukriFileUpload_Cancel.exe", cmd);
	}

	@Test
	public void fileDialogTest() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.naukri.com");
		driver.findElement(By.xpath("//input[@value='Upload CV']")).click();
		Runtime runtime = Runtime.getRuntime();
		String cmd[] = { "File Upload" };
		runtime.exec("NaukriFileUpload_Cancel.exe", cmd);
	}
}
