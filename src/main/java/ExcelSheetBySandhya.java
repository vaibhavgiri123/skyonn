import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelSheetBySandhya {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		
	//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://www.facebook.com/");
	
	File f=new File("C:\\Users\\vaibh\\OneDrive\\Documents\\dataProvider.xlsx");
	
	System.out.println(f.exists());
  FileInputStream file=new FileInputStream(f);                                                     //1
		
		org.apache.poi.ss.usermodel.Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");      //2
		String username=sh.getRow(0).getCell(0).getStringCellValue();                              //3
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		
		String password=sh.getRow(0).getCell(1).getStringCellValue();                              //4
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}

}
