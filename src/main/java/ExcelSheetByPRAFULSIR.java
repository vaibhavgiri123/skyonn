import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelSheetByPRAFULSIR {

	public static void main(String[] args) throws IOException {
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		File f=new File("C:\\Users\\vaibh\\OneDrive\\Documents\\dataProvider.xlsx");
		
		FileInputStream fis=new FileInputStream(f);      //1
		
		
		XSSFWorkbook workbook =new XSSFWorkbook(fis);  //2
		
		
		
		XSSFSheet sh=workbook.getSheet("Sheet1");  //3
		

	
	   String username=sh.getRow(5).getCell(4).getStringCellValue();                      //4      
	   
	   
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		
		String password=sh.getRow(5).getCell(4).getStringCellValue();  
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
