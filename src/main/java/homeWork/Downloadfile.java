package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Downloadfile {

	@Test
	public void chromeDownload() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TimeMachine\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/view");
		driver.findElement(By.xpath("//*[@id='content']/div/p[2]/span/a")).click();
		//driver.close();
	}
	
	@Test
	public void firefoxDownload() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/view");
		driver.findElement(By.xpath("//*[@id='content']/div/p[2]/span/a")).click();
		//driver.close();
		}
	
	@Test
	public void ieDownload() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\TimeMachine\\Desktop\\IE\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/view");
		driver.findElement(By.xpath("//*[@id='content']/div/p[2]/span/a")).click();
		//driver.close();
	}

}