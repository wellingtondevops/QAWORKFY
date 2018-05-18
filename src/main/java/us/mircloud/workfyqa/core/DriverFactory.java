package us.mircloud.workfyqa.core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver driver;
	private DriverFactory() {}
	public static WebDriver getDriver() {

		if (driver == null) {
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

}