package UtilsLayer;

import org.openqa.selenium.Alert;

import BaseLayer.Baseclass;

public class AlertPopUp extends Baseclass {

	static Alert alt;

	public static void switchToAlert() {
		driver.switchTo().alert();
	}

	public static void clickOnOkButton() {
		driver.switchTo().alert().accept();
	}

	public static void clickOnCancelButton() {
		driver.switchTo().alert().dismiss();
	}

	public static void enterDataInAlert(String value) {
		driver.switchTo().alert().sendKeys("value");
	}

	public static String captureAlertText() {
		return driver.switchTo().alert().getText();
	}

}
