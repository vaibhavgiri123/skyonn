import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MultiplewindowByIterator{

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.cleanandclear.in/"); // 1   main URL

		String parent = driver.getWindowHandle();
		// System.out.println(parent);
		Thread.sleep(3000);   
		                                           // 2  2nd URL
		driver.findElement(By.xpath("//a[text()='Skin Care Blogs']//preceding::li[9]")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows);

		Iterator<String> it = windows.iterator();

		String parentId = it.next();
		String childId = it.next();

		System.out.println(parentId);
		System.out.println(childId);
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.xpath(""));

	}

}
