package temp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataTest2WebDriver {	

	String[] weblinks = { "http://www.google.com", 
			"http://www.yahoo.com", 
			"http://www.cnn.com",
			"http://www.youtube.com", 
			"http://www.hu.edu" };

	@DataProvider(name = "linkData")
	public Object[][] numbersData() {
		Object[][] data = { { "http://www.google.com" }, { "http://www.yahoo.com" }, { "http://www.cnn.com" }, { "http://www.yahoo.com", "http://www.cnn.com", "http://www.youtube.com" }, { "http://www.hu.edu" } };
		return data;
	}

	@Test(dataProvider = "linkData")
	public void test(String weblink) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get(weblink);
		Thread.sleep(5000);
		driver.quit();
	}

}
