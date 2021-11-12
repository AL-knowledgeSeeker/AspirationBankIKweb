package com.aspirationbank.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aspirationbank.automation.common.Assertions;

public class SpendandSavePage {
	WebDriver driver;
	Assertions assertions = new Assertions();

	public SpendandSavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[starts-with(@class,'Flex-sc-')]/img[contains(@src,'Cards_Ripple_Lockup')]")
	private WebElement cardHandLockup;
	
	public void spendandSaveIsDisplayed() {
		boolean display= cardHandLockup.isDisplayed();
		Assert.assertTrue(display, "Fail - Spendandsave card image is not displayed");
	}
	


}
