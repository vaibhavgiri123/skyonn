package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;

public class RecruitementPage extends Baseclass {
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//li[5]")
	WebElement Recruit;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement CandidateName;
	
	
	public RecruitementPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnRecruitment()
	{
		Recruit.click();
		
	}
	
	public void candidates(String name)
	{
		
		CandidateName.sendKeys(name);
	}
	
	
	
	
	
	

}
