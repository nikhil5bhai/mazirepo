package Jan31;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyClass2 {

	List<String> mountainList1 = null;
	List<String> prominenceList1;
	List<String> ascentList1;

	@Test
	public void test1() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_highest_mountains_on_Earth");
		List<WebElement> mountainsList = driver
				.findElements(By.xpath("//*[@id='mw-content-text']/div/table[3]/tbody/tr/td[2]"));
		List<WebElement> prominenceList = driver
				.findElements(By.xpath("//*[@id='mw-content-text']/div/table[3]/tbody/tr/td[5]"));
		List<WebElement> ascentList = driver
				.findElements(By.xpath("//*[@id='mw-content-text']/div/table[3]/tbody/tr/td[9]"));

		for (int i = 0; i < mountainsList.size(); i++) {
			String moutainListElement = mountainsList.get(i).getText();

			String prominenceListElement = prominenceList.get(i).getText().replaceAll(",", "");
			int prominenceListDataToNum = Integer.parseInt(prominenceListElement);
			// System.out.println(prominenceListElement);

			String ascentListElement = ascentList.get(i).getText();
			String ascentListElement1 = ascentListElement.replaceAll("unclimbed", "0");
			int ascentListDataToNum = Integer.parseInt(ascentListElement1);

			if (prominenceListDataToNum > 4000 && ascentListDataToNum > 1951) {
				System.out.println(i + " " + moutainListElement + " with prominence " + prominenceListElement
						+ " whose ascent year is " + ascentListDataToNum);

			}

		}

	}
}