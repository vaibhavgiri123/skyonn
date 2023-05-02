

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxesAndScrolling {

	
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.edge.driver", "‪‪‪C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation"); // opend URL    
		
		Thread.sleep(3000);
		
		//SCROLLING OPERATIONS
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,2000)");
		
//		 js.executeScript("window.scroll(0,-500)");
		
		
		// CLICKING MULTIPLE CHECKBOXES
  List<WebElement>check=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		for(WebElement clickAll:check)
		{
			clickAll.click();
			
		}

	
		 

		 
	}

}