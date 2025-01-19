package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {
	WebDriver ldriver;
	public Indexpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1\']")
	WebElement signInlist;
	
	@FindBy(xpath="//a[text()='Start here.']")
	WebElement signInLink;
	
	public void moveToSignInlist()
	{   
		Actions a1=new Actions(ldriver);
		a1.moveToElement(signInlist).perform();
		signInLink.click();
	}

	
	

}
