package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.Baseclass;

public class HandleDropDown extends Baseclass {

		public static Select sel;

		public static void handleDPByVisibleText(WebElement wb, String value) {
			sel = new Select(wb);
			sel.selectByVisibleText(value);

		}

		public static void handleDPByIndex(WebElement wb, int index) {
			sel = new Select(wb);
			sel.selectByIndex(index);

		}

		public static void handleDPByValue(WebElement wb, String value) {
			sel = new Select(wb);
			sel.selectByValue(value);
		}

		public static String checkSelectedValueFromDP(WebElement wb) {
			sel = new Select(wb);
			WebElement abc = sel.getFirstSelectedOption();
			String a = abc.getText();
			return a;

			// return new Select(wb).getFirstSelectedOption().getText();
		}

		public static int countTotalValueFromDP(WebElement wb) {
//			sel = new Select(wb);
//			List<WebElement> ls = sel.getOptions();
//			int a = ls.size();
//			return a;

			return new Select(wb).getOptions().size();

		}

		public static void printAllValuesFromDP(WebElement wb) {
//			sel=new Select(wb);
//			List<WebElement>ls=sel.getOptions();
			List<WebElement> ls = new Select(wb).getOptions();
			for (WebElement abc : ls) {
				System.out.println(abc.getText());

			}
		}

		public static boolean checkSpecificValueIsPresent(WebElement wb, String value) // ******************
		{
			sel = new Select(wb);
			List<WebElement> ls1 = sel.getOptions();
			for (WebElement abc : ls1)
			{
				String a = abc.getText();

				if (a.equalsIgnoreCase("value")) 
				{
					return true;
				}

			}
	   return false;
		}
		
		
	

}
