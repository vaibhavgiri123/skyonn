import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowBYPrafulSET {
static String youtube;
static String instagram;
static String facebook;
	
	public static void main(String[] args) throws InterruptedException {

//		https://tutorialshut.com/                               PRACTICE LINK

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.cleanandclear.in/"); // 1 PARENT WINDOW
		driver.manage().window().maximize();
               //^^
		String PARENT = driver.getWindowHandle(); // *****************************

		//System.out.println(PARENT);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Skincare Products']//preceding::li[2]")).click();// 2 youtube

	

		Set<String> allwindow = driver.getWindowHandles(); // *****************************
		//System.out.println(allwindow.size());

		for (String yout : allwindow) 
		{
			
			if (!yout.equals(PARENT))//^^               PARENT = PARENT(main window)
			{
               
				 driver.switchTo().window(yout);
				youtube= driver.getWindowHandle();       // written what is youtube      **
			//	System.out.println(youtube);                 // printing its id
				
				// we will check if we switched to youtube by getting title
				System.out.println( "1 " + driver.switchTo().window(yout).getTitle());
				
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(PARENT);  //MUST SWITCH TO PARENT BEFORE PROCEDING
		
		 driver.findElement(By.xpath("//a[text()='Skincare Products']//preceding::li[3]")).click(); // OPENING 2 ND WINDOW
		 
		  allwindow=driver.getWindowHandles();
		
		for(String insta : allwindow)
		{
			if(!insta.equals(youtube)&& (!insta.equals(PARENT)))    //  COMPARE WITH VARIBLES OF driver.getWindowHandle()
			{                                                       //i.e. with ids'
				//System.out.println(allwindow.size());
				driver.switchTo().window(insta);
				instagram=driver.getWindowHandle();  // ***
				//System.out.println(instagram);
				System.out.println(	"2 " + driver.switchTo().window(insta).getTitle());
			}
		}
		Thread.sleep(3000);
		
	    	driver.switchTo().window(PARENT);
	    	driver.findElement(By.xpath("//a[text()='Skincare Products']//preceding::li[4]")).click();
	    	allwindow=driver.getWindowHandles();
	 	
	    	for(String face:allwindow)
	    	{
	    		if(!face.equals(PARENT)&&(!face.equals(youtube)&&(!face.equals(instagram))))
	    			                                         //  COMPARE WITH VARIBLES OF driver.getWindowHandles()
	    			                                         //     //i.e. with ids'
	    		  {
	    			  //System.out.println(allwindow.size());
		    			driver.switchTo().window(face);              // IMP
		    			facebook=driver.getWindowHandle();           // IMP
		    			//System.out.println(facebook);
		    			System.out.println("3 " +driver.switchTo().window(face).getTitle());  // IMP(For verification)
	    		  }
	    		  
	    		
	    	}
	    	
	    	// NOW WE CAN SWITCH TO ANY WINDOW OU OF THESE 4
	    	       driver.switchTo().window(PARENT);
	    	       driver.switchTo().window(youtube);       // variable of getwindowHandle method
		
		
	    			//  System.out.println(allwindow.size());
	
	}

}
 	// driver.findElement(By.xpath("//a[text()='SkincareProducts']//preceding::li[3]")).click(); // 3 INSTA


// driver.findElement(By.xpath("//a[text()='Skincare Products']//preceding::li[4]")).click(); // 4 FACEBOOK

// PUT ABOVE ON 28 & 29 LINE