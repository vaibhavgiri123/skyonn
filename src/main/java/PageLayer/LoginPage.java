package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;

public class LoginPage extends Baseclass {
	@FindBy(name = "username")
	WebElement FirstName;
	@FindBy(name = "password")
	WebElement LastName;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement Click;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void checkregisterpage(String fname, String lname) {
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
		Click.click();
	}

}
