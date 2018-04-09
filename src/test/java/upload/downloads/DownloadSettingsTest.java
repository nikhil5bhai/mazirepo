package upload.downloads;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadSettingsTest {

	@Test
	public void test1() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/view");
		driver.findElement(By.xpath(
				"//a[@href='https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/at_download/file']"))
				.click();

	}

	// With Auto IT
	@Test
	public void test2() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/view");
		driver.findElement(By.xpath(
				"//a[@href='https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/at_download/file']"))
				.click();
		Runtime runtime = Runtime.getRuntime();
		//runtime.exec("Cancel.exe");
		  String[] cmd = {"Opening QTL_Sample_data.xls"};
		  runtime.exec("Generic_Cancel.exe",cmd);
	}

	// With Auto IT
	@Test
	public void test3() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/view");
		driver.findElement(By.xpath(
				"//a[@href='https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/at_download/file']"))
				.click();
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("OK.exe");
	}

	// With Auto IT
	@Test
	public void test4() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://community.qlik.com/docs/DOC-8897");
		driver.findElement(By.xpath("//a[@href='/servlet/JiveServlet/downloadBody/8897-102-1-12397/sample.xlsx']"))
				.click();
		Runtime runtime = Runtime.getRuntime();
		String[] cmd = {"Opening sample.xls"};
		  runtime.exec("Generic_OK.exe",cmd);
	}
	
	@Test
	public void test5() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://community.qlik.com/docs/DOC-8897");
		driver.findElement(By.xpath("//a[@href='/servlet/JiveServlet/downloadBody/8897-102-1-12397/sample.xlsx']"))
				.click();
		Runtime runtime = Runtime.getRuntime();
		String[] cmd = {"Opening sample.xls"};
		  runtime.exec("Generic_Cancel.exe",cmd);
	}

}
