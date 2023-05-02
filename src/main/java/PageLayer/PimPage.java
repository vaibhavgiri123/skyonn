package PageLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilsLayer.ActionsClass;
import UtilsLayer.JSExecutor;
import UtilsLayer.TakesscreenShot;

public class PimPage extends Baseclass {

	@FindBy(xpath = "//ul[@class=\"oxd-main-menu\"]//li[2]")
	WebElement Pim;
	@FindBy(xpath = "//h5[text()='Employee Information']//following::button[4]")
	WebElement Add;
	@FindBy(name = "firstName")
	WebElement Firstname;
	@FindBy(name = "middleName")
	WebElement Middlename;
	@FindBy(name = "lastName")
	WebElement Lastname;
	@FindBy(xpath = "//input[@name=\"lastName\"]//following::button")
	WebElement Save;
	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[2]")
	WebElement Employeelist;
	@FindBy(xpath = "//h5[text()='Employee Information']//following::button[4]")
	WebElement Eadd;
	@FindBy(name = "firstName")
	WebElement Efirstname;
	@FindBy(name = "middleName")
	WebElement Emiddlename;
	@FindBy(name = "lastName")
	WebElement Elastname;
	@FindBy(xpath ="//button[@type=\"submit\"]")
	WebElement Esave;
	
	@FindBy(xpath="//div[@class=\"oxd-topbar-body\"]//li[4]")
	WebElement Reports;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement Hint;
//	@FindBy(xpath="//button[text()=' Search ']")
	//WebElement Search;
	

	public PimPage() {
		PageFactory.initElements(driver, this);
	}

	public void addEmployee(String fname, String middlename, String lastname) {
		ActionsClass.clickOnElement(Pim);
		Add.click();
		Firstname.sendKeys(fname);
		Middlename.sendKeys(middlename);
		Lastname.sendKeys(lastname);
		Save.click();
	}

	public void employeeList(String Efname, String Emname, String Elname){
		Employeelist.click();
		ActionsClass.clickOnElement(Eadd);
		Efirstname.sendKeys(Efname);

		Emiddlename.sendKeys(Emname);
		Elastname.sendKeys(Elname);
		Esave.click();
		
	}
	
	public void clickOnReports( String value)
	{
		
		ActionsClass.clickOnElement(Reports);
		Hint .sendKeys(value);
		
		
	}

}
