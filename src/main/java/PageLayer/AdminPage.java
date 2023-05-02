package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilsLayer.ActionsClass;
import UtilsLayer.JSExecutor;

public class AdminPage  extends Baseclass{
	
@FindBy(xpath="//ul[@class=\"oxd-main-menu\"]//li[1]")
WebElement Admin;
@FindBy(xpath="//span[text()='User Management ']")
WebElement UserManagment;

@FindBy(xpath="//ul[@class=\"oxd-dropdown-menu\"]")
WebElement Users;
@FindBy(xpath="//div[@class='oxd-topbar-body']//li[2]")
WebElement Job;
@FindBy(linkText="Job Titles")
WebElement JobTitle;
//@FindBy(xpath="//div[text()='Account Assistant']//following::i[1]")
//WebElement Symbol;
//@FindBy(xpath="//div[@class=\"orangehrm-modal-footer\"]//button[2]")
//WebElement YesDelete;
@FindBy(xpath="//span[text()='Organization ']")
WebElement Organization;
@FindBy(xpath="//ul[@class='oxd-dropdown-menu']//li[1]")
WebElement GenralInformation;
@FindBy(xpath="//input[@type='checkbox']")
WebElement Edit;

@FindBy(xpath="//label[text()='Organization Name']//following::input[1]")
WebElement OrganizationName;

@FindBy(xpath="//label[text()='Registration Number']//following::input[1]")

WebElement RegistrationNumber;
@FindBy(xpath="//label[text()='Country']//following::textarea")
WebElement Notes;

@FindBy(xpath="//button[text()=' Save ']")
WebElement Save;

public AdminPage()
{
	PageFactory.initElements(driver,this);
}

public void clickOnAdmin()
{
	Admin.click();
	ActionsClass.clickOnElement(UserManagment);
	Users.click();
}
public void checkJobStatus()
{
	ActionsClass.clickOnElement(Job);
	JobTitle.click();
	//JSExecutor.clickOnElementUsingJs(Symbol);
	//YesDelete.click();
}
public void clickOnOrganization()
{
	ActionsClass.clickOnElement(Organization);
	GenralInformation.click();
	Edit.click();
	
}
public void addGeneralInformation(String Orgname,String regnum,String notes)
{
	OrganizationName.click();
	OrganizationName.sendKeys(Orgname);          // DOUBT REMAINING
	
	RegistrationNumber.sendKeys(regnum);
	Notes.sendKeys(notes);
	Save.click();
	
}




}
