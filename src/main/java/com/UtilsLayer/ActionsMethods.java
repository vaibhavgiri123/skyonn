package com.UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class ActionsMethods extends BaseClass {

	public void clickOnElement(WebElement wb) {
		new Actions(driver).click(wb).build().perform();
	}

	public void doubleClickOnElement(WebElement wb) {
		new Actions(driver).doubleClick(wb).build().perform();
	}

	public void rightClickOnElement(WebElement wb) {
		new Actions(driver).contextClick(wb).build().perform();
	}

	public void movetoelement(WebElement wb) {
		new Actions(driver).moveToElement(wb).build().perform();
	}

	public void dragAndDropElement(WebElement src, WebElement dist) {
		new Actions(driver).dragAndDrop(src, dist).build().perform();
	}

	public void clickAndHoldElement(WebElement src) {
		new Actions(driver).clickAndHold(src).build().perform();
	}

	public void releaseElement(WebElement dist) {
		new Actions(driver).release(dist).build().perform();
	}

	public void sendKeystoElement(WebElement wb, String value) {
		new Actions(driver).click(wb).sendKeys(value).build().perform();
	}

}
