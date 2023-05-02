import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralleltesting {

	
	
	
	@Test(priority=1)
	public void facebook() throws InterruptedException
	{
		WebDriverManager .edgedriver().setup();
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
	}
	@Test(priority=2)
	public void amazon()
	{
		WebDriverManager .edgedriver().setup();
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
	}
	/*
	 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

<suite name="Suite" parallel="methods" thread-count="2">                -- IMP

  <test thread-count="5" name="Test">
    <classes>
   
      <class name="CodingWithMK.parallelTesting"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
	 */
	 
}
