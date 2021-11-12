package com.aspirationbank.automation.common;

import org.openqa.selenium.WebElement;

import com.aspirationbank.modules.TestBase;

public class Assertions extends TestBase{

	
	
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
		
	}
	public boolean isEquals(WebElement element,String expected) {
		String actual=element.getText();
		return actual.equalsIgnoreCase(expected);
	
		
	}
}
