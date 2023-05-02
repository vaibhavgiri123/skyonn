package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.AdminPage;
@Test(groups ={"Admin"},dependsOnGroups= {"PimPage"})
public class AdminPageTest  extends Baseclass{

	  AdminPage admin;
	
	@Test(priority=1)
	public void validateAdminPage()
	{
		admin=new AdminPage();
		admin.clickOnAdmin();
	}
	@Test(priority=2)
	public void validateJobPage()
	{
		admin.checkJobStatus();
	}
	@Test(priority=3)
	public void validateClickOnOrganization()
	{
		admin.clickOnOrganization();
	}
	@Test(priority=4)
	public void validateGeneralInfo()
	{
		admin.addGeneralInformation("Softech","1234","I am the Great");
	}
	
	
}
