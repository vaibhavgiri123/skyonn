import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleWindowByList {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.cleanandclear.in/");
		
	//	String parent =driver.getWindowHandle();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[contains(@class,\"panel-pane pane-views pane-s\")]//li[1]")).click();      //Step : 1
		
		List<String> allwindow=new ArrayList(driver.getWindowHandles());                                              //Step : 2
		
	//	System.out.println(driver.getTitle());
		
		String parent=allwindow.get(0);                                                                               //Step : 3
		String facebook=allwindow.get(1);
		
		driver.switchTo().window(parent);                             //0                                             //Step : 4
		System.out.println( "parent Title =  " + driver.getTitle());      // PARENT                                   //Step : 5
	 
		
		Thread.sleep(3000);
		driver.switchTo().window(facebook);                          //1
		
		System.out.println( "facebook Title =  " + driver.getTitle());    // FACEBOOK
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//div[contains(@class,'panel-pane pane-views pane-social-media-links')]//li[2]")).click();
		
		 allwindow=new ArrayList(driver.getWindowHandles());
		 
		 String insta=allwindow.get(2);               //2
		 
		 driver.switchTo().window(insta);           // INSTA
		 
		 System.out.println( "insta Title = " + driver.getTitle());      
		 
		 
		 Thread.sleep(3000);
			driver.switchTo().window(parent);
			System.out.println( "parent Title = " + driver.getTitle());
			
			
			driver.findElement(By.xpath("//div[contains(@class,'panel-pane pane-views pane-social-media-links')]//li[3]")) .click();
		
			

			 allwindow=new ArrayList(driver.getWindowHandles());
			 
			 String youtube=allwindow.get(3);
			 
			 driver.switchTo().window(youtube);                  //3
			 
			 System.out.println( "youtube Title = " +driver.getTitle());             // youtube
			 
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 
//			 js.executeScript("window.scroll(0,500)");
//			 Thread.sleep(3000);
//			 js.executeScript("window.scroll(0,-500)");
			 
			
			
		 
		

	}

}
