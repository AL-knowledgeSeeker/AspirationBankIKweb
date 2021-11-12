package com.aspirationbank.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class LoadProp {

	//public static final Properties prop = new Properties();
	public static String env_folder = System.getProperty("system.env.folder");
	public Properties prop=new Properties();
	
	
	public LoadProp() {
		
try {		
		String filePath="C:\\Users\\Admin\\git\\AspirationBankIKweb\\src\\test\\resources\\qaconfig.properties";
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(filePath);
		prop.load(fis);
		}catch (Exception e) {
            e.printStackTrace();
        }

	}
		
	public Properties getProp() {
		return prop;
		
	}

}
