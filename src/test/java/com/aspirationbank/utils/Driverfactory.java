package com.aspirationbank.utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import lombok.val;

public class Driverfactory {

	public static WebDriver driver = null;
	LoadProp loadprop = new LoadProp();

	public synchronized WebDriver getDriver(String browser) {
		return setDriver(browser);
	}

	private WebDriver setDriver(String browser) {
		String ChromedriverLoc = loadprop.getProp().getProperty("CHROME_DRIVER").toString();
		String FirefoxdriverLoc = loadprop.getProp().getProperty("FIREFOX_DRIVER").toString();

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ChromedriverLoc);
			 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", FirefoxdriverLoc);
			driver = new FirefoxDriver();
		}

		return driver;

	}

}
