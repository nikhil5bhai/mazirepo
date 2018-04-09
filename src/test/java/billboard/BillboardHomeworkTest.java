package billboard;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BillboardHomeworkTest {
 WebDriver driver = new FirefoxDriver();

 @BeforeClass
 public void init() {
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("http://www.billboard.com/");
 }

 @Test
 public void getArtistNameTest() {
  driver.findElement(By.xpath("//div/a[contains(text(),'Hot 100')]")).click();
  List<WebElement> links = driver.findElements(By.xpath("//div//a[@class='chart-row__artist']"));
  List<WebElement> names = driver.findElements(By.xpath("//div//span[@class='chart-row__artist']"));
  System.out.println("Artst names are without link total is= " + names.size());
  System.out.println("Artists names WITH links= " + links.size());
  System.out.println("Total Artists = " + (links.size()+ names.size()));

  for (WebElement name : names) {
   System.out.println(name.getText());
  }
  for (WebElement alink : links) {
   System.out.println(alink.getText());
  }
 }

 @Test(dependsOnMethods = "getArtistNameTest")
 public void getTooltipTextTest() {
  WebElement archiver_serach = driver.findElement(By.xpath("//label[@class='archive-search__label']"));
  String actualTitle = archiver_serach.getText();
  System.out.println("Titles are= " + actualTitle);
  assertTrue(actualTitle.equals("Archive Search"), "Titles are not same");
 }

 @Test(dependsOnMethods="getArtistNameTest")
 public void mouseOverOnSubscriberTest() {
  Actions action = new Actions(driver);
  WebElement subcriber = driver
    .findElement(By.xpath("//span[@class='site-header__nav-link site-header__nav-link--subscribe']"));
  action.moveToElement(subcriber).perform();
  driver.findElement(By.xpath("//a[contains(text(),'Subscribe now')]")).click();
 }

 @DataProvider(name = "Account information")
 public Object[][] accountInformation() {
  Object[][] info = {
    { "Yogita", "Patil", "sr.QA", "Apple", "Sunnyvale", "Apt 214", "Sunnyvale", "California", "94087",
      "United States", "+125-4578-89", "abc@gmail.com", "abc@gmail.com" },

    { "Tushar", "Patil", "Tech lead", "cisco", "dhule", "Apt 214", "Sunnyvale", "California", "93573",
      "United States", "+125-4578-89", "abc@gmail.com", "abc@gmail.com" },

    { "Raj", "Patil", "QA", "Google", "Thane", "Apt 14", "Sunnyvale", "California", "12345",
      "United States", "+125-4578-89", "abc@gmail.com", "abc@gmail.com" }

  };
  return info;
 }

 @Test(dependsOnMethods = "mouseOverOnSubscriberTest", dataProvider = "Account information")
 public void accountDataTest(String firstName, String lastName, String jobTitle, String company,
   String deliveryAddress, String suite, String city, String state, String zip, String country,
   String telNumber, String email, String retypeEmail)

 {
  List<WebElement> all = driver.findElements(By.xpath("//table[@id='tbl_nameaddr']//input"));
  for (int i = 0; i < all.size(); i++) {
   all.get(i).clear();
  }
  driver.findElement(By.id("f_name")).sendKeys(firstName);
  driver.findElement(By.id("l_name")).sendKeys(lastName);
  driver.findElement(By.id("title")).sendKeys(jobTitle);
  driver.findElement(By.id("company")).sendKeys(company);
  driver.findElement(By.id("street")).sendKeys(deliveryAddress);
  driver.findElement(By.id("addr2")).sendKeys(suite);
  driver.findElement(By.id("city")).sendKeys(city);
  Select dropdown = new Select(driver.findElement(By.id("state")));
  dropdown.selectByVisibleText(state);
  Select dropdown2 = new Select(driver.findElement(By.id("country")));
  dropdown2.selectByVisibleText(country);
  driver.findElement(By.id("phone")).sendKeys(telNumber);
  driver.findElement(By.id("email")).sendKeys(email);
  driver.findElement(By.id("email2")).sendKeys(retypeEmail);

 }

}