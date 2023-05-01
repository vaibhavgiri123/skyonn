package com.TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

@Test(groups = { "loginpage", "regression" })
public class LoginPageTest extends BaseClass {
	private LoginPage loginpage;

	@BeforeTest
	public void setUp() {

		loginpage = new LoginPage();
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		BaseClass.iniliazation();

	}

	@Test
	public void validateLoginFunctionality() {
		loginpage.enterUsename(prop.getProperty("username"));
		loginpage.enterPassword(prop.getProperty("password"));
		loginpage.clickOnlogin();

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
