import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	static Select se;
public static void dpp(WebElement dp,String visibltext)
{
	 Select se=new Select(dp );
	 se.selectByVisibleText(visibltext);
	 
}
	
public static void count( WebElement co)
{
	List<WebElement> ab=se.getOptions();
	int a=ab.size();
	System.out.println(ab);
}


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 WebElement dp=driver.findElement(By.xpath("//select[@title=\"Search in\"]"));
		 dp.click();
dropdown.dpp(dp, "Books");


  
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
