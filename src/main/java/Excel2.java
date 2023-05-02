import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel2 {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver =new EdgeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		FileInputStream file=new FileInputStream("C:\\Users\\vaibh\\OneDrive\\Documents\\dataProvider.xlsx");
		
		org.apache.poi.ss.usermodel.Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		String username=sh.getRow(5).getCell(4).getStringCellValue();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		
		String password=sh.getRow(2).getCell(6).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	
		
		
		
	}

}
