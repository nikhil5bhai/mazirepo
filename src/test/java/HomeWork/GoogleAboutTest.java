package HomeWork;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GoogleAboutTest {

 WebDriver driver = new FirefoxDriver();
 @FindBy(id = "hplogo")
 WebElement googleLogo;
 // @FindBy(css = "//a[contains(text(),'About')]")
 @FindBy(how = How.XPATH, xpath = "//a[contains(text(),'About')]")
 WebElement aboutGoogle;
 @FindBy(xpath = "//a[@title='Our latest']")
 //@FindBy(how = How.LINK_TEXT, using="Our latest")  //working
 //@FindBy(how = How.TAG_NAME, using="Our latest")
 WebElement ourLatest;

 @Test
 public void googleAboutTest() {
  PageFactory.initElements(driver, this);
  driver.get("http://www.google.com");
  // assertTrue(googleLogo.isDisplayed(), "is not available");
  // assertTrue(isElementPresent(googleLogo), "GoogleLogo isn't present");
  assertTrue(isElementPresent(aboutGoogle), "About Tab isn't available");
  driver.manage().window().maximize();
  aboutGoogle.click();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  

 }

 @Test(dependsOnMethods = "googleAboutTest")
 public void verifyOurLatest() {
  assertTrue(isElementPresent(ourLatest), "Our Latest Tab isn't available");

 }

 public boolean isElementPresent(WebElement element) {
  boolean b = false;

  try {
   b = element.isDisplayed();

  } catch (NoSuchElementException e) {
   System.out.println("Element is not found on the page ");

  }
  return b;
 }

}