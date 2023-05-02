package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.Baseclass;

public class Datepicker extends Baseclass {
public static void datepicker(WebElement currentmonthandyear,String expectedmonthandyear,WebElement clicknext,WebElement date) {
		
		while(true)
		{
			String a=currentmonthandyear.getText();
			if(a.equalsIgnoreCase(expectedmonthandyear))
			{
				break;
			}
			else
			{
				clicknext.click();
			}
		}
	
		date.click();
	}
	
	


}
