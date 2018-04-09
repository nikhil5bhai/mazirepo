package HomeWork;

import static org.testng.Assert.assertTrue;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Jan12HW {
	public static WebDriver driver;
	String browser;
	int timeout;

	@BeforeSuite
	public void init() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void navigateToAmazonTest() {
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		driver.findElement(By.className("nav-input")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		WebElement all = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select allDropDown = new Select(all);
		allDropDown.selectByVisibleText("Books");
		allDropDown.selectByIndex(5);
		// allDropDown.selectByValue("Books");

	}

	@Test
	public void navigatingToNaukriTest() {
		driver.get("https://www.naukri.com/");
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			System.out.println("window handle is " + window);
			if (window.equals(mainWindow)) {
				System.out.println("current window is " + mainWindow);
			} else {
				driver.switchTo().window(window);
				driver.close();
				driver.switchTo().window(mainWindow);
			}
		}
		assertTrue(
				driver.getTitle().equals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"),
				"title not matching");
		driver.findElement(By.xpath("//div[contains(text(),'Recruiters')]")).click();
		String mainWindow1 = driver.getWindowHandle();
		Set<String> allWindows1 = driver.getWindowHandles();
		for (String window1 : allWindows1) {
			if (window1.equals(mainWindow1)) {
			} else {
				driver.switchTo().window(window1);
				assertTrue(
						driver.getTitle().equals("HR Manager - HR Executive - HR Recruiter Consultants - Naukri.com"),
						"title not matching");
			}

		}

	}

	@DataProvider(name = "search")
	public Object[][] feilds() {
		Object[][] dataSearch = { { "vin" }, { "google maps" }, { "amazon" }, { "walmart" }, { "fruits" },
				{ "vegetables" }, { "macys" }, { "arrays" }, { "list" }, { "plants" }, { "trees" }, { "arts" },
				{ "books" }, { "baby" }, { "names" }, { "sofa" }, { "chair" }, { "tv" }, { "phone" }, { "ipad" } };
		return dataSearch;
	}

	@Test(dataProvider = "search")
	public void test3(String searchData) {
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys(searchData);
	}

	@AfterSuite
	public void teardown() {
		driver.close();
	}

}
