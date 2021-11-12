package com.aspirationbank.modules;

import org.testng.annotations.Test;

import com.aspirationbank.automation.pages.HomePage;
import com.aspirationbank.automation.pages.SpendandSavePage;
import com.aspirationbank.utils.ExtentReportListener;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Test;

public class SpendandSaveTest extends TestBase {
	ExtentReportListener extentreport=new ExtentReportListener();

	@Test
	public void getSpendandSaveTest() throws Exception {
		ExtentReportListener.test.log(LogStatus.INFO,"Starting test getSpendandSave");
		ExtentReportListener.test.log(LogStatus.INFO,"Clicking Spend and save link");
		app().page().homepage().ClickspendandSave();
		ExtentReportListener.test.log(LogStatus.INFO,"Verifying Spend and save image is displayed");
		app().page().spendandsave().spendandSaveIsDisplayed();
		
		
	}

}
