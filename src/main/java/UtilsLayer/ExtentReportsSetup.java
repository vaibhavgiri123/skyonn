package UtilsLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.Baseclass;

public class ExtentReportsSetup extends Baseclass {
	 public static ExtentReports extent;
	
	 public static ExtentReports extentReporter( )
	               //return type    method name
	 {
	    String date=new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	 	ExtentSparkReporter sparkreport =new ExtentSparkReporter("C:\\Users\\vaibh\\eclipse-workspace\\Parabank\\Reports\\"+date+"extentreport .html");
	 	
	 	 extent=new ExtentReports();
	 		extent.attachReporter(sparkreport);
	 return extent;
	 }
}
