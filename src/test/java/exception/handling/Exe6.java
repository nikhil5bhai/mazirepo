package exception.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exe6 {
	WebDriver driver = new FirefoxDriver();
	String[] names = { "a", "b", "c" };

	@Test
	public void test1() {

		try {

			driver.get("http://www.google.com");
			driver.findElement(By.id("lst-ib"));
			System.out.println(names[2]);

		} catch (NoSuchElementException e) {
			System.out.println("nosuchelementexception");
			// e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("reached array index out of bound exception");
			// e.printStackTrace();

		} finally {
			System.out.println("reached finally");
			driver.close();

		}
	}

}