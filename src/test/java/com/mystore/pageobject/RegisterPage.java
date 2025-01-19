package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver ldriver;
	public RegisterPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continue1;
	
	public void enterEmail(String email1)
	{   
		email.sendKeys(email1);
	}
	public void proceed()
	{   
		continue1.click();
	}

}
