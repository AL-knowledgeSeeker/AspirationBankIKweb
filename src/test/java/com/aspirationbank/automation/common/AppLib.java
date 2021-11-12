package com.aspirationbank.automation.common;

import org.openqa.selenium.WebDriver;

import com.aspirationbank.utils.LoadProp;

public class AppLib {
	private WebDriver driver;
	private PageLib pagelib;
	
	
	public AppLib(WebDriver driver) {
		this.driver=driver;
		pagelib=new PageLib(driver);
	}
	
	public PageLib page() {
		return pagelib;
	}
	

}
