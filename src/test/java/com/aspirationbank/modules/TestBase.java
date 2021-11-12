package com.aspirationbank.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.aspirationbank.automation.common.AppLib;
import com.aspirationbank.utils.Driverfactory;
import com.aspirationbank.utils.ExtentReportListener;
import com.aspirationbank.utils.LoadProp;

@Listeners(ExtentReportListener.class)
public class TestBase extends ExtentReportListener{
	public WebDriver driver;
	LoadProp loadprop;
	Driverfactory driverfactory;

	private AppLib app;

	@BeforeSuite
	public void setup() {
		/*
		 * loadprop=new LoadProp();; driverfactory=new Driverfactory();
		 * driver=driverfactory.getDriver(loadprop.prop.getProperty("BROWSER").toString(
		 * )); driver.manage().window().maximize(); getUrl();
		 * driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 * 
		 * 
		 * 
		 * WebElement cookies_accept =
		 * driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
		 */
	}

	@BeforeClass
	public void setupp() {
		loadprop = new LoadProp();
		driverfactory = new Driverfactory();
		driver = driverfactory.getDriver(loadprop.prop.getProperty("BROWSER").toString());
		app = new AppLib(driver);
		driver.manage().window().maximize();
		getUrl();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement cookies_accept = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
	}

	public AppLib app() {
		return app;
	}

	public void getUrl() {
		// System.out.println("URL - "+loadprop.prop.getProperty("URL"));
		System.out.println("URL - " + app().page().loadprop().getProp().getProperty("URL"));
		driver.get(app().page().loadprop().getProp().getProperty("URL"));
	}

	public String getTitle() {
		return driver.getTitle();

	}

	@AfterClass
	public void teardown() {
		driver.close();
	}

}
