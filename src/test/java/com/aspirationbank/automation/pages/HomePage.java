package com.aspirationbank.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aspirationbank.automation.common.Assertions;
import com.aspirationbank.modules.TestBase;
import com.aspirationbank.utils.*;

public class HomePage extends TestBase {
	WebDriver driver;
	Assertions assertions = new Assertions();
	

	public HomePage(WebDriver driver) {
		 this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//Header[starts-with(@class,'Box-sc-')]/div/a")
	private WebElement aspirationLogo;
	@FindBy(xpath = "//ul[starts-with(@class,'Flex-sc-')]/li/a[@data-testid='nav-bar-spendandsave']")
	private WebElement spendandSave;
	@FindBy(xpath = "//a[@data-testid='sign-in-account-button']")
	private WebElement signIn;
	@FindBy(xpath = "//a[@data-testid='nav-bar-spendandsave']")
	private WebElement spendandsave;
	@FindBy(xpath = "//a[@data-testid='nav-bar-credit']")
	private WebElement credit;
	@FindBy(xpath = "//a[@data-testid='nav-bar-business']")
	private WebElement enterprise;
	@FindBy(xpath = "//a[@data-testid='nav-bar-who-we-are']")
	private WebElement whoweare;
	@FindBy(xpath = "//a[@data-testid='nav-bar-impact']")
	private WebElement impact;
	@FindBy(xpath = "//a[@data-testid='nav-bar-education']")
	private WebElement learn;
	
	@FindBy(xpath = "//span[contains(text(),'Sign In')]")
	private WebElement signInButton;
	
	public void signInButtonIsDisplayed() {
		boolean display = assertions.isDisplayed(signInButton);
		Assert.assertTrue(display, "Fail - signInButton is not displayed");
	}
	
	public void clickSignInButton() {
		signInButton.click();
		
	}
	
	public void aspirationLogoIsDisplayed() {
		boolean display = assertions.isDisplayed(aspirationLogo);
		Assert.assertTrue(display, "Fail - Logo is not displayed");
	}
	
	public void homePageTitle(String expected) {
		String title=this.driver.getTitle();
		Assert.assertEquals(title,expected, "Fail - Title is not displayed");
	}

	public boolean spendandSaveIsDisplayed() {
		return spendandSave.isDisplayed();
	}

	public void ClickspendandSave() {
		spendandSave.click();
	}

	public void ClickImpact() {
		impact.click();
	}

	public void ClickWhoweare() {
		whoweare.click();
	}

	public void ClickEnterprise() {
		enterprise.click();
	}

	public void ClickCredit() {
		credit.click();
	}

	public void ClickLearn() {
		learn.click();
	}
}
