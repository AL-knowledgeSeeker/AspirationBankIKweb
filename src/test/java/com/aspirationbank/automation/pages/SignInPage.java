package com.aspirationbank.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aspirationbank.automation.common.Assertions;
import com.aspirationbank.modules.TestBase;

public class SignInPage extends TestBase {
	WebDriver driver;
	Assertions assertions = new Assertions();
	

	public SignInPage(WebDriver driver) {
		 this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//Header[starts-with(@class,'Box-sc-')]/div/a")
	private WebElement aspirationLogo;
	
	@FindBy(xpath = "//h2[@class='fonts-v3']")
	private WebElement welcomePage;
	
	
	@FindBy(id = "signinEmail")
	private WebElement signInEmailTextBox;
	
	@FindBy(id = "signinPassword")
	private WebElement signInPasswordTextBox;
	
	@FindBy(xpath = "//*[@class='btn__heading ng-binding']")
	private WebElement loginBtn;

	

}
