package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.Baseclass;

public class JSExecutor extends Baseclass {
		 public static JavascriptExecutor js;

		public static void borderOnElement(WebElement wb) // 1
		{
			js = (JavascriptExecutor) driver;
			js.executeScript ("arguments[0].style.border='3px.solid.red';", wb);
		}

		public static void scrolldownload(WebElement wb) // 2
		{
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", wb);
		}

		public static void clickOnElementUsingJs(WebElement wb) // 3
		{
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", wb);

		}

		public static void sendDataUsingJs(String value, WebElement wb) // 4
		{

			js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].value='" + value + "';", wb);
		}

		public static void openUrl(String url) // 5
		{
			js = (JavascriptExecutor) driver;
			js.executeScript("window.location='" + url + "';");
		}

		public static String captureTitleUsingJs() // 6
		{
			js = (JavascriptExecutor) driver;
			return js.executeScript("return document. title;").toString();
		}

		public static String captureUrlUsingJs() // 7
		{
			js = (JavascriptExecutor) driver;
			return js.executeScript("return document.url;").toString();
		}

		public static void moveSomeStepsforwrd(String moveforword) // 8
		{
			js = (JavascriptExecutor) driver;
			js.executeScript("history.go('" + moveforword + "');");
		}

		public static void moveSomeStepsback(String moveback) {
			js = (JavascriptExecutor) driver;
			js.executeScript("history.go('" + moveback + "');");

		}

	//remaining
		public static void changeBackgroundColor(WebElement wb) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor='rgb(255,0,0)';", wb);
		}

		public static void generateAlertUsingJs(String alertvalue) {
			js = (JavascriptExecutor) driver;
			js.executeScript("alert('" + alertvalue + "');");
		}

		public static void generateConfirmpopUsingJs(String confirmvalue) // 6
		{
			js = (JavascriptExecutor) driver;
			js.executeScript("confirm('" + confirmvalue + "');");
		}

		public static void generatePropmtpopUsingJs(String Promtvalue) // 7
		{
			js = (JavascriptExecutor) driver;
			js.executeScript("prompt('" + Promtvalue + "');");
		}
}
