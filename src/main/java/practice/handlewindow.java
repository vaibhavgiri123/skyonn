package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.Baseclass;

public class handlewindow extends Baseclass {
public static void main(String[] args) {

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\java classes\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Windows.html");
	Actions act=new Actions(driver);
	
	 WebElement wb=driver.findElement(By.xpath("//a[text()='SwitchTo']"));

	 act.moveToElement(wb).build().perform();
	 WebElement wb1=driver.findElement(By.xpath("//a[text()='Windows']"));
	
	 act.click(wb1).build().perform();
	 WebElement wb2=driver.findElement(By.xpath("//button[text()='click']"));
	 
	 act.click(wb2).build().perform();
	 
	 
	 
//	 String parent=driver.getWindowHandle();

	
	//System.out.println(parent);
	
	Set<String> allwindow=driver.getWindowHandles();
	for(String child:allwindow)
	{
		if(!child.equals(allwindow))
		{
			driver.switchTo().window(child);
			 driver.findElement(By.xpath("//a[text()='http://www.cleanandclear.in/']")).click();
			
		}
	}

}
	
	
}
