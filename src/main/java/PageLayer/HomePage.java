package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseLayer.Baseclass;

public class HomePage extends Baseclass {

@FindBy(xpath="//div[@class=\"oxd-brand-banner toggled\"]")
WebElement Logo;

public String  captureTitle()
{
	 return driver.getTitle();
}


public String capturecurrentUrl()
{
	return driver.getCurrentUrl();
}

//
//public boolean CheckLogo()
//{
//	return Logo.isDisplayed();
//}


	
}
