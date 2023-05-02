import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowPHP {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
 WebDriver driver=new EdgeDriver();
 
 driver.get("https://phptravels.com/");           // 0 PARENT
 
 JavascriptExecutor js=(JavascriptExecutor)driver;
 Thread.sleep(3000);
 js.executeScript("window.scroll(0,600)");
 Thread.sleep(3000);
 driver.findElement(By.xpath("//a[@data-tooltip=\"Kiwi\"]")).click();         //  1 KIWI
 Thread.sleep(3000);
// driver.findElement(By.xpath("//div[@data-wow-delay='2s']")).click();    // 2 INSTA


 Thread.sleep(3000);
//driver.findElement(By.xpath("//div[text()='www.phptravels.com']")).click();        //  3 php website
 
 List<String> allwindow=new ArrayList(driver.getWindowHandles());
 String parent=allwindow.get(0);
 System.out.println(driver.getTitle());
 
 String kiwi=allwindow.get(1);
 driver.switchTo().window(kiwi);
 
 System.out.println(driver.getTitle());
 
 ////span[text()=' Instagram']
 driver.findElement(By.xpath("//div[@data-wow-delay='2s']")).click();
 
 allwindow=new ArrayList(driver.getWindowHandles());
 
 String insta=allwindow.get(2);
 driver.switchTo().window(insta);
 System.out.println(driver.getTitle());
 //String php=allwindow.get(3);
 

 
 
 
 
 
 
	}
}
