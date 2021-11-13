package com.aspirationbank.automation.common;

import org.openqa.selenium.WebElement;

import com.aspirationbank.modules.AbstractTestBase;

public class Assertions extends AbstractTestBase{

	
	
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
		
	}
	public boolean isEquals(WebElement element,String expected) {
		String actual=element.getText();
		return actual.equalsIgnoreCase(expected);
	
		
	}
}
