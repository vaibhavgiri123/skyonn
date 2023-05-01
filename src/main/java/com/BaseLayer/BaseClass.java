package com.BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.UtilsLayer.JSMethods;

public class BaseClass {

	protected static WebDriver driver;
	protected static Properties prop;

	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src/main/java/com/ConfigLayer//config.properties");

			prop.load(fis);
		} catch (Exception e) {

		}
	}

	public static void iniliazation() {

		String browser = prop.getProperty("browsers");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//AllDrivers//chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {

		} else if (browser.equalsIgnoreCase("edge")) {

		} else if (browser.equalsIgnoreCase("edge")) {

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		
		JSMethods.openbrowser(prop.getProperty("url"));

	}

}
