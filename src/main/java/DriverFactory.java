

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {


	private static WebDriver driver;
	public DriverFactory() {


	}
	public static WebDriver getDriver() {

		if (driver ==null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;

	}

	public static void killDriver() {


		if (driver != null) {

			driver.quit();
			driver = null;
		}
	}
	//	System.setProperty("webdriver.chrome.driver","C:/webdrivers/chromedriver.exe");
	//driver = new ChromeDriver();
	//driver.manage().window().maximize();

}
