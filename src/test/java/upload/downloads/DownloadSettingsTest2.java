package upload.downloads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownloadSettingsTest2 {

	@Test
	public void test1() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TimeMachine\\Desktop\\geckodriver\\geckodriver.exe");
		// 1 create firefox profile and provide the path
		FirefoxProfile firefoxProfile = new FirefoxProfile();

		// # 0 means to download to the desktop, 1 means to download to the
		// default "Downloads" directory, 2 means to use the directory you
		// specify in "browser.download.dir", 2 below

		// download window
		firefoxProfile.setPreference("browser.download.folderList", 2);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);

		//// firefox about:config
		firefoxProfile.setPreference("browser.download.dir", "C:\\Users\\TimeMachine\\Desktop");
		// allowed extension
		firefoxProfile.setPreference("browser.helperApps.neverAsk.openFile",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");

		// dont ask for these exten
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		firefoxProfile.setPreference("browser.helperApps.alwaysAsk.force", false);
		firefoxProfile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		firefoxProfile.setPreference("browser.download.manager.focusWhenStarting", false);
		firefoxProfile.setPreference("browser.download.manager.useWindow", false);
		firefoxProfile.setPreference("browser.download.manager.showAlertOnComplete", false);
		firefoxProfile.setPreference("browser.download.manager.closeWhenDone", false);

		// Create Options object to load preferences
		FirefoxOptions options = new FirefoxOptions();

		// add profile to Options
		options.setProfile(firefoxProfile);

		// create driver with FirefoxDriver - use Constructor with Options
		WebDriver driver = new FirefoxDriver(options);

		driver.get("https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/view");
		driver.findElement(By.xpath("//a[@href='https://mdcune.psych.ucla.edu/modules/bioinformatics/extras/QTL_Sample_data.xls/at_download/file']")).click();

	}

}
