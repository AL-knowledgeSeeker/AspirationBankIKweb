package com.aspirationbank.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aspirationbank.modules.TestBase;

public class CommonMethods extends TestBase{
	
	public CommonMethods(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
