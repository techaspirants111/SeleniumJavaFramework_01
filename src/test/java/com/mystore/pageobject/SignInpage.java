package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInpage {
	WebDriver ldriver;
	public SignInpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement newAccount;
	
	
	
	public void createNewAccount()
	{
		newAccount.click();
	}
}
