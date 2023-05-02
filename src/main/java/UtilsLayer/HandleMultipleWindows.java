package UtilsLayer;

import java.util.ArrayList;
import java.util.Set;

import BaseLayer.Baseclass;



public class HandleMultipleWindows extends Baseclass {

	public static String handleTwoHandle(String parent, Set<String> allWindow) {

		for (String abc : allWindow) {
			if (!abc.equals(parent)) {
				driver.switchTo().window(abc);
				return driver.getWindowHandle();
			}
		}

		return null;
	}

	public static String handleThreeWindow(String parent, String firstChildId, Set<String> allWindow) {

		for (String pqr : allWindow) {

			if (!(pqr.equals(parent)) && !(pqr.equals(firstChildId))) {
				driver.switchTo().window(pqr);
				return driver.getWindowHandle();
			}
		}

		return null;
	}

	public static String handleFourWindow(String parent, String firstChildId, String secondChildID,Set<String> allWindow) 
	{
		for (String xyz : allWindow) {
			if (!(xyz.equals(parent)) && !(xyz.equals(firstChildId)) && !(xyz.equals(secondChildID))) {
				driver.switchTo().window(xyz);
				return driver.getWindowHandle();
			}
		}

		return null;
	}

	// Handle window by using ArrayList concept

	public static void handleWindowUsingArrayList(String parent, Set<String> allWindow, int index) {
		ArrayList<String> arr = new ArrayList<String>(allWindow);
		driver.switchTo().window(arr.get(index));
}
}
