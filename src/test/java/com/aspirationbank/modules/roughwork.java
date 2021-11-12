package com.aspirationbank.modules;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class roughwork {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("TEst");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\AspirationBankIKweb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aspiration.com/");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		System.out.println("Title - "+driver.getTitle());
		
	   WebElement iframe=driver.findElement(By.xpath("//iframe[starts-with(@id,'universal_pixel_')]"));
		
		//driver.switchTo().frame(iframe);
	 	driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//Header[starts-with(@class,'Box-sc-')]/div/a")).click();
		System.out.println("Title - "+driver.getTitle());
		driver.quit();
		
		
}	
}
