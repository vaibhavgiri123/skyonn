import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicSearchBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("pune");
		Thread.sleep(3000);
		 List<WebElement> searchbox= driver.findElements(By.xpath("//div[@class=\"aajZCb\"]//li"));
		
		 int w=searchbox.size();
		 System.out.println(w);
		 
		for(WebElement values:searchbox )
		{
			
			String a=values.getText();
			
			if(a.contains("weather"))
			{
				values.click();
				break;
			}
		}

	}

}
