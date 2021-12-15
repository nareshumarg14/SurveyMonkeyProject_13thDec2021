package com.SM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver; //1
	
	//2 - Create Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver; //Assigning the driver passed from Test Case to local driver.
		PageFactory.initElements(driver, this);
	}
	
	//3. Page element for Username field
	@FindBy(id="username")
	WebElement txtUname;
	
	//4. Page element for Password field
	@FindBy(id="password")
	WebElement txtPwd;
	
	//5. Login Button
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	//Locator for Forgot username or password?
	@FindBy(linkText = "Forgot username or password?")
	WebElement lnkForgotUnOrPwd;
	
	//6. Entering Username
	public void setUsername(String uname) {
		txtUname.clear();
		txtUname.sendKeys(uname);
	}
	
	//7. Entering Password
	public void setPassword(String pwd) {
		txtPwd.clear();
		txtPwd.sendKeys(pwd);
	}
	
	//8. Click on Login button
	public void clickLoginButton() {
		btnLogin.click();
	}
	
	//Method for 
	public String getForgotUsernameOrPasswordTxt() {
		return lnkForgotUnOrPwd.getText();
	}
	
	

}
