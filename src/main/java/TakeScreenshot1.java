
import java.io.File;
import java.io.IOException;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot1 {

	 static WebDriver driver;
	public  void  takescreenshot( String name) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;

		File src =ts.getScreenshotAs(OutputType.FILE); 

		File dist = new File(".\\screenshot\\"+ name +".png");

		FileHandler.copy(src, dist);
		
	}
	
	
	
	public static void main(String[] args) throws IOException  {
	//System.setProperty("webdriver.edge.driver","‪C:\\edgedriver\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.redbus.in/");

WebElement wb = driver.findElement(By.xpath("//input[@tabindex=\"1\"]"));
wb.sendKeys("pune");

//List<WebElement> ls= driver.findElements(By.xpath("//li[@data-id]"));
List<WebElement> ls= driver.findElements(By.xpath("//li"));

int city = ls.size();
System.out.println(city);

for(WebElement abc:ls)
{
	String d=abc.getText();
    System.out.println(d);	
}

TakeScreenshot1 asig=new TakeScreenshot1();
    asig.takescreenshot("ram");


	}

}
