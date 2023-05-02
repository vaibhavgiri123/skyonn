import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownAndRadio14march {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.edge.driver","‪‪C:\\edgedriver\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://www.facebook.in/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(day);
		s.selectByVisibleText("6");
		
		Thread.sleep(3000);
		List<WebElement>ls=s.getOptions();
		
		for(WebElement abc:ls)
		{
			
			//String a=abc.getText();
			System.out.println(abc.getText());
			if(abc.getText().equals("9"))  //1-10
			{
				abc.click();
	
		}
	driver.findElement(By.xpath("//label[text()='Male']")).click(); //  RADIO BUTTON
	
//		 List<WebElement> radio=driver.findElements(By.xpath("//input[@name='sex']"));
//		
//		 for(WebElement button : radio)
//		 {
//			 if(button.getAttribute("value").equals("1"))
//			 {
//				 button.click();
//			 }
//		 }
		 
	}
	}
}
