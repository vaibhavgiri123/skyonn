package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.PimPage;
@Test(groups= {"PimPage"},dependsOnGroups= {"Home"})
public class PimPageTest extends Baseclass {

	PimPage pim;
	@Test(priority=1)
	public void validateAddEmployee()
	{
		 pim= new PimPage();
		 pim.addEmployee("vaibhav","Digambar","Gosavi");
	}
	@Test(priority=2)
	public void validateEmployeeList()
	{
		pim.employeeList("vaibhav","digambar","gosavi");
	
	}
	@Test(priority=3)
	public void validateReports()
	{
		pim.clickOnReports("vaibhav");
		
		
	}
	
}
