package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.Baseclass;

public class TakesscreenShot  extends Baseclass{
	public static String capturePassScreenshot(String methodname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;

		File f = ts.getScreenshotAs(OutputType.FILE);
		String date = new SimpleDateFormat("ddMMyy_HHmmss").format(new Date());

		String dist = System.getProperty("user.dir") + "\\Sep22PassScreenshot\\" + methodname + date + " .png";
		FileUtils.copyFile(f, new File(dist));
		return dist;
	}
	public static String captureFailScreenshot(String methodname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;

		File f = ts.getScreenshotAs(OutputType.FILE);
		String date = new SimpleDateFormat("ddMMyy_HHmmss").format(new Date());

		String dist = System.getProperty("user.dir") + "\\Sep22FailScreenshot\\" + methodname + date + " .png";
		FileUtils.copyFile(f, new File(dist));
		return dist;
	}
	


}
