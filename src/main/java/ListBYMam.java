import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBYMam {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		// driver.manage().window().setSize(1024,768);

		driver.get("http://uitestpractice.com/Students/Switchto");          //1

		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();  //2 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[7]")).click();  //3

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();

		List<String> allwindow = new ArrayList(driver.getWindowHandles());

		String parent = allwindow.get(0);

		String openNewWindow = allwindow.get(1);
		String Switchto = allwindow.get(2);
		//String Opensinanewwindow = allwindow.get(3);

		WebElement PARENT = driver.findElement(By.xpath("//a[text()='Opens in a new window']"));

		System.out.println(PARENT.getText()); // parent

		Thread.sleep(2000);

		driver.switchTo().window(openNewWindow); //

		WebElement wb2 = driver.findElement(By.xpath("//h3[text()='Drag and Drop control']"));

		System.out.println(wb2.getText()); // child 1

		Thread.sleep(2000);
		
		WebElement wb=driver.findElement(By.xpath("//button[@name='dblClick']"));
		Actions act=new Actions(driver);
		
		act.doubleClick(wb).build().perform();
		

	}

}
