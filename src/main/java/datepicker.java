import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

		while (true) {

			String a = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			System.out.println(a);

			if (a.equals("Aug 2024")) {
				break;
			} 
			else
			{

				driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
			}

		}
		driver.findElement(By.xpath("//td[text()='14']")).click();

	}

}
