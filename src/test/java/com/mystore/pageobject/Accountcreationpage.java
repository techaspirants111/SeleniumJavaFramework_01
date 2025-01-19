package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountcreationpage {
	WebDriver ldriver;
	public Accountcreationpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//input[@type='tel']")
	WebElement phone;
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement FirstndLastname;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue1;
	
	
	
	public void enterphone(String phonenumber)
	{   
		phone.sendKeys(phonenumber);
	}
	public void entername(String name)
	{   
		FirstndLastname.sendKeys(name);
	}
	public void enterPassword(String name)
	{   
		password.sendKeys(name);
	}
	
	public void clickContinue()
	{   
		continue1.click();
	}

}

