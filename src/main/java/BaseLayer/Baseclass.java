package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	Properties prop=new Properties();
//	FileInputStream fis=new FileInputStream("");
	//////////
//////////

	public static WebDriver driver;
	public static void initialization(){
		
			String browser = "edge";

			if (browser.equalsIgnoreCase("edge"))
			{
				// System.setProperty("webdriver.chrome.driver", "");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} 
			else if (browser.equalsIgnoreCase("chrome")) 
			{
				//System.setProperty("webdriver.edge.driver", "");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("opera"))
			{
				System.setProperty("webdriver.opera.driver", "");
				driver = new OperaDriver();
			} 
			else
			{
				System.err.println("Please Mention Validate browser name");
			}
		
	
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\java classes\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//	driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//driver.get("https://parabank.parasoft.com/parabank/register.htm");
    
		
	}
}
