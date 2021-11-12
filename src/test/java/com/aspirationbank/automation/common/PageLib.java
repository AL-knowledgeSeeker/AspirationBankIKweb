package com.aspirationbank.automation.common;

import org.openqa.selenium.WebDriver;

import com.aspirationbank.automation.pages.HomePage;
import com.aspirationbank.automation.pages.SignInPage;
import com.aspirationbank.automation.pages.SpendandSavePage;
import com.aspirationbank.utils.LoadProp;

public class PageLib {

	private WebDriver driver;
	private HomePage homepage;
	private SpendandSavePage spendandsave;
	private LoadProp loadprop;
	private SignInPage signin;
	
	public PageLib(WebDriver driver) {
		this.driver=driver;
		 homepage=new HomePage(driver);
		 spendandsave =new SpendandSavePage(driver);
		 loadprop=new LoadProp();
		 signin=new SignInPage(driver);
		
	}

	public HomePage homepage() {
		return homepage;
	}

   public SpendandSavePage spendandsave() {
		return spendandsave;
	}

   public LoadProp loadprop() {
		return loadprop;
	}
	
   public SignInPage signin() {
		return signin;
	}
	


}
