import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
	
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		
		driver.manage().window().maximize();
		List<WebElement>row =driver.findElements(By.xpath("//table[1]/tbody/tr"));
		int a =row .size();
		System.out.println(a);
		
		List<WebElement>column =driver.findElements(By.xpath("//table[1]/tbody/tr/td"));
		int b = column.size();
		System.out.println(b);
		
		List<WebElement> all=driver.findElements(By.xpath("//table[1]/tbody/tr/td"));
		
		for(int r =1;r<=row.size();r++)
		{
			for(int c=1;c<=column.size();c++)
			{
				//table[@class='infobox vevent']/tbody/tr[5]/td
				//table[@class='infobox vevent']/tbody/tr/td
				String alldata=driver.findElement(By.xpath("//table[@class='infobox vevent']/tbody/tr[" +r+ "]/td[" +c+ "]")).getText();
			    System.out.print(alldata+" ");
			}
			System.out.println(" ");
			
		}

	}

}
