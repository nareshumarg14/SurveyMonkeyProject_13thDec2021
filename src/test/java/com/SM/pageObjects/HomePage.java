package com.SM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//1
	public WebDriver driver;
	
	//2. Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//3. Locator for Dashboard Link
	@FindBy(linkText = "Dashboard")
	WebElement lnkDashboard;
	
	//4. Method for Dashboard Link
	public boolean dashboardLinkDisplayed() {
		boolean status = lnkDashboard.isDisplayed();
		return status;
	}

}
