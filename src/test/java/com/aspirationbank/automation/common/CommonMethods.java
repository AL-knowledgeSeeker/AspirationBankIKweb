package com.aspirationbank.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aspirationbank.modules.AbstractTestBase;

public class CommonMethods extends AbstractTestBase{
	
	public CommonMethods(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
