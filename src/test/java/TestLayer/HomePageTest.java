package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.HomePage;
@Test( groups= {"Home"},dependsOnGroups= {"Login"})
public class HomePageTest  extends Baseclass{
	 HomePage home=new HomePage();
	
	 
	 @Test(priority=1)
	 public void validateTitle()
	 {
		 home=new HomePage();
		 Assert.assertEquals(home.captureTitle(),"OrangeHRM");
	 }
	 @Test(priority=2)
	 public void validateCurrenturl()
	 {
		Assert.assertEquals(home.capturecurrentUrl().contains("hrm"),true); 
	 }
	// @Test(priority=3)
//	public void ValidateLogo()
//	{
//		
//		 //home.CheckLogo();
//		// Assert.assertTrue(home.CheckLogo());
//
//		 Assert.assertEquals(home.CheckLogo(),true);
//	}
	
	
}
