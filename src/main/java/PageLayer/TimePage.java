package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;

public class TimePage  extends Baseclass{
	
@FindBy(xpath="//ul[@class='oxd-main-menu']//li[4]")
WebElement Time;

public TimePage()
{
	PageFactory.initElements(driver,this);
}

public void clickOnTime()
{
	Time.click();
}

}
