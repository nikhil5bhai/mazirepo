package Jan31;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyClass1 {
	@Test
	public void test1() throws IOException {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://en.wikipedia.org/wiki/List_of_highest_mountains_on_Earth");
//		List<WebElement> mountainsList = driver
//				.findElements(By.xpath("//*[@id='mw-content-text']/div/table[3]/tbody/tr/td[2]"));
//		List<WebElement> prominenceList = driver
//				.findElements(By.xpath("//*[@id='mw-content-text']/div/table[3]/tbody/tr/td[5]"));
//		List<WebElement> ascentList = driver
//				.findElements(By.xpath("//*[@id='mw-content-text']/div/table[3]/tbody/tr/td[9]"));
//	
		
		List <Integer> myList = new ArrayList<Integer>();
		String a = "unclimbed";
		String b = "5555";
		String c ="6666";
		
		int aNum = Integer.parseInt(a);
		int bNum = Integer.parseInt(b);
		int cNum = Integer.parseInt(c);
		
		System.out.println(aNum);
		System.out.println(bNum);
		System.out.println(cNum);
		
		
		
		
		
		
		
//
//		ArrayList<Integer> prominenceListData = new ArrayList<Integer>();
//		ArrayList<Integer> ascentListData = new ArrayList<Integer>();
//
//		prominenceList.addAll(prominenceList);
//		ascentList.addAll(ascentList);
//
//		for (int i = 0; i < prominenceListData.toArray().length - 1; i++) {
//			String prominence_List = prominenceList.get(i).getText().replaceAll(",", "");
//			int prominenceListDataToNum = Integer.parseInt(prominence_List);
//			// System.out.println(prominenceListDataToNum);
//
//			prominenceListData.add(prominenceListDataToNum);
//
//			String ascent_List = ascentList.get(i).getText().replaceAll(",", "");
//			int ascentListDataToNum = Integer.parseInt(ascent_List);
//			if (ascentListData != null) {
//				ascentListData.add(ascentListDataToNum);
//			}
//			System.out.println(ascentListData);
//
//			System.out.println(prominenceListData.size());
//
//			// System.out.println(count);
//			// System.out.println(ascentListNum.size());

			// System.out.println("mountain names with prominace is more than 4000 and first
			// ascent above 1950 are -");
			// for (int i=0; i<mountainsList.size();i++) {
			// if (prominenceListNum.get(i)>4000 && ascentListNum.get(i)>1950) {
			// System.out.println(mountainsList.get(i).getText());
			//
			// }
			// }

		}
	}

