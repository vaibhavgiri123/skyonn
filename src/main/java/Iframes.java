import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
	
		//driver.get("https://demo.automationtesting.in/Frames.html");
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
