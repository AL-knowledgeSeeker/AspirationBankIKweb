package com.aspirationbank.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aspirationbank.automation.common.Assertions;

public class SignInTest {
	WebDriver driver;
	Assertions assertions = new Assertions();
	

	public SignInTest(WebDriver driver) {
		 this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
