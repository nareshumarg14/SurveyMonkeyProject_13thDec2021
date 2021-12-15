package com.SM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SM.pageObjects.HomePage;
import com.SM.pageObjects.LoginPage;
import com.SM.testBase.BaseClass;

public class TC001_Login_Test extends BaseClass {
		
	//3
	@Test
	public void loginTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		
		//Calling method of LoginPage
		lp.setUsername(prop.getProperty("username"));
		//System.out.println(prop.getProperty("username") + "- is entered successfully");
		logger.info(prop.getProperty("username") + " - is entered successfully");
		lp.setPassword(prop.getProperty("password"));
		//System.out.println(prop.getProperty("password") + "- is entered successfully");
		logger.info(prop.getProperty("password") + " - is entered successfully");
		
		//Calling the method to capture screenshot
		capturescreen(driver, "1. Login Test before clicking on Login button");
		
		lp.clickLoginButton();
		//System.out.println("Clicked on Login button");
		logger.info("Clicked on Login button");
		capturescreen(driver, "2. Login Test after clicking on Login button");
		
		HomePage hp = new HomePage(driver);
		boolean lnkStatus = hp.dashboardLinkDisplayed();
		//Assertion to check the value
		Assert.assertEquals(lnkStatus, true);
		//System.out.println("Login is successful");
		logger.info("User successfully logged in");
	}
	
	

}
