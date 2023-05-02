package UtilsLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseLayer.Baseclass;

public class HandleFrames extends Baseclass {

	public static WebDriver frameByIndex(int index) {
		return driver.switchTo().frame(index);
	}

	public static WebDriver frameByName(String value) {
		return driver.switchTo().frame(value);
	}

	public static WebDriver framebyWebElement(WebElement wb) {
		return driver.switchTo().frame(wb);
	}

	public static WebDriver defaultcontent() {
		return driver.switchTo().defaultContent();
	}

	public static WebDriver parentframe() {
		return driver.switchTo().parentFrame();
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}














