package com.aspirationbank.automation.common;

import org.openqa.selenium.WebDriver;

import com.aspirationbank.utils.LoadProp;

public class AspirationLib {
	private WebDriver driver;
	private PageLib pagelib;
	
	
	public AspirationLib(WebDriver driver) {
		this.driver=driver;
		pagelib=new PageLib(driver);
	}
	
	public PageLib page() {
		return pagelib;
	}
	

}
