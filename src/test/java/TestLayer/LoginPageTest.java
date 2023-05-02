package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.LoginPage;

@Test(groups= {"Login"})
public class LoginPageTest extends Baseclass {
	
	LoginPage login;
  @BeforeTest
	public void setUp() 
	{
     Baseclass.initialization();
	}
  @Test(priority=1)
  public void logincredentials()
  {
	   login =new LoginPage();
	   login.checkregisterpage("Admin", "admin123");
  }

	
	
//	@DataProvider(name = "fbData")
//    	public Object[][] getData() throws Exception {
//		
//		ExcelReader excel = new ExcelReader("‪‪‪C:\\Users\\vaibh\\OneDrive\\Desktop\\XECEL.xlsx");
//
//		int rows = excel.countRows(0);
//		int cells = excel.countcells(0);
//		Object[][] data = new Object[rows][cells];
//
//		// capture data from excel sheet and enter data in Object[][] array
//
//		for (int i = 0; i < rows; i++) {
//			data[i][0] = excel.getData(0, i, 0);
//			data[i][1] = excel.getData(0, i, 1);
//
//		}
//
//		return data;
//	}

}
