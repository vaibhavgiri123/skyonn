package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilsLayer.ActionsClass;

public class LeavePage extends Baseclass {

	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//li[3]")
	WebElement Lev;
	@FindBy(xpath="//div[@class='oxd-topbar-body']//li[1]")
	WebElement Apply;
	@FindBy(xpath="//div[@class='oxd-switch-wrapper']")
	WebElement Save;
	
	public LeavePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLeavePage()
	{
		Lev.click();
	}
	
	public void applyLeave()
	{
	Apply.click();
		
	}
//	public void leaveList()
//	{
//		Save.click();
//	}
	
	
	
}
