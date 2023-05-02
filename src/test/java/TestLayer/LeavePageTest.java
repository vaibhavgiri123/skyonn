package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.LeavePage;
@Test(groups= {"Leave"},dependsOnGroups= {"Admin"})
public class LeavePageTest extends Baseclass {
	LeavePage leave;
	@Test(priority=1)
	public void validateClickOnLeavePage()
	{
		leave=new LeavePage();
		leave.clickOnLeavePage();
	}
	@Test(priority=2)
	public void validateApplyLeave()
	{
		leave.applyLeave();
	}
	//@Test(priority=3)
//	public void validateLeaveList()
//	{
//		leave.leaveList();
//	}
	
	
}
