package pf;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	WebDriver driver = new FirefoxDriver();
	
	@FindBy(id = "lst-ib")
	 WebElement searchBox;
	@FindBy(name="btnK")
	WebElement searchButton;
	@FindBy(id ="resultStats")
	WebElement resultTxt;
	
	
	@Test
	public void searchTest() throws InterruptedException {	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		  driver.get("http://www.google.com");
		  assertTrue(isElementPresent(searchBox), "search box isn't available");
		  searchBox.sendKeys("vin");
		  Thread.sleep(3000);
		  searchButton.click();	
		  assertTrue(isElementPresent(searchButton), "search box isn't available");
	}
	
	public boolean isElementPresent(WebElement element) {
		  boolean b = false;

		  try {
		   b = element.isDisplayed();

		  } catch (NoSuchElementException e) {
		   System.out.println(" Element is not found on the page ");

		  }
		  return b;
		 }
	
	@Test (dependsOnMethods="searchTest")
	public void test2() {
		assertTrue(isElementPresent(resultTxt), "search box isn't available");		
		
	}
	
	
}
