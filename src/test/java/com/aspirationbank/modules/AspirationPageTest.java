package com.aspirationbank.modules;

import org.testng.annotations.Test;

import com.aspirationbank.utils.ExtentReportListener;
import com.relevantcodes.extentreports.LogStatus;

public class AspirationPageTest extends TestBase{
	ExtentReportListener extentreport=new ExtentReportListener();

	@Test
	public void getHomePageTest() throws Exception {
		ExtentReportListener.test.log(LogStatus.INFO,"Starting test");
		ExtentReportListener.test.log(LogStatus.INFO,"Validating logo is displayed");
		app().page().homepage().aspirationLogoIsDisplayed();
		ExtentReportListener.test.log(LogStatus.INFO,"Validating title of page");
		app().page().homepage().homePageTitle(app().page().loadprop().getProp().getProperty("HOME_PAGE_TITLE"));//loadprop.prop.getProperty("HOME_PAGE_TITLE"));
		ExtentReportListener.test.log(LogStatus.INFO,"Clicking SpendandSave");
		app().page().homepage().ClickspendandSave();
		ExtentReportListener.test.log(LogStatus.INFO,"getHomePage test completed");
		
		
	}
	

}
