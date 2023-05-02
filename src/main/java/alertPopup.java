import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();

		Alert alt = driver.switchTo().alert();
		// to click on ok button
		alt.accept();

		// to click on cancel button
		alt.dismiss();
		// to send data button
		alt.sendKeys("vaibhav");

		// to getText button
		alt.getText();

	}

}
