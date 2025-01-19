package com.mystore.ultities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	String path="C:\\Users\\reeth\\Desktop\\Appium_Environment\\MyStoreV1\\configuration\\config.properties";
	
	public ReadConfig() 
	{   prop=new Properties();
	try {
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
	public String getUrl()
	{
		 String baseurl=prop.getProperty("baseURL");
		 if(baseurl!=null)
	return baseurl;
		 
		 else
			 new RuntimeException("Url not found");
		return baseurl;
		
	}
	public String getBrowser()
	{
		 String browser=prop.getProperty("browser");
		 if(browser!=null)
	return browser;
		 
		 else
			 new RuntimeException("browser not found");
		return browser;
		
	}
	

}
