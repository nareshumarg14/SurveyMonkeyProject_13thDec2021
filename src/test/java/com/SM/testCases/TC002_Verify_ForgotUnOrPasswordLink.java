package com.SM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SM.pageObjects.LoginPage;
import com.SM.testBase.BaseClass;

public class TC002_Verify_ForgotUnOrPasswordLink extends BaseClass {
	
	//3
	@Test
	public void verifyForgotUsernameOrPasswordLink() throws IOException {
		LoginPage lp = new LoginPage(driver);
		Assert.assertEquals(lp.getForgotUsernameOrPasswordTxt(), "Forgot username or password?","Forgot username or password? link is missing");
		logger.info("Forgot username or password? link is displayed");
		capturescreen(driver, "Forgot Password Link exists");
	}
	
}
