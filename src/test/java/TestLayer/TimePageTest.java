package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.TimePage;
@Test(groups= {"Time"},dependsOnGroups= {"Leave"})
public class TimePageTest extends Baseclass {
	
	
	TimePage time;
	@Test(priority=1)
	public void validateClickOnTime()
	{
		time=new TimePage();
		time.clickOnTime();
	}

}
