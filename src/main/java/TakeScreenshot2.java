import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot2 {
	 static WebDriver driver;
	public void takesScreenShot( String name) throws IOException
	{
           TakesScreenshot ts = (TakesScreenshot)driver;
		
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		
		File dist=  new File ("C:\\Users\\vaibh\\eclipse-workspace\\Parabank\\screenshot\\"+ name +".png");
		
		FileUtils.copyFile(f, dist);
	}

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		
		driver.get("https://www.youtube.com/"); 
		
		TakeScreenshot2 t=new TakeScreenshot2();
		t.takesScreenShot("anuja");
		
	}

}
