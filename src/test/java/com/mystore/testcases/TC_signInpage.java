package com.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.pageobject.Accountcreationpage;
import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.RegisterPage;
import com.mystore.pageobject.SignInpage;
import com.mystore.ultities.ReadExcelFile;

public class TC_signInpage extends BaseTestclass{
 @Test  (dataProvider ="RegisterDataProvider")  
public void registertAndLogin(String userEmail, String userFirstName,String Password, String userMobNumber) throws IOException
{ 
	
	Indexpage ip=new Indexpage(driver);
	ip.moveToSignInlist();
	captureScreenShot(driver, "registertAndLogin");

	RegisterPage rp=new RegisterPage(driver);
	rp.enterEmail(userEmail);
	rp.proceed();
	captureScreenShot(driver, "registertAndLogin");
	SignInpage sp=new SignInpage(driver);
	sp.createNewAccount();
	
	captureScreenShot(driver, "registertAndLogin");
	Accountcreationpage acp= new Accountcreationpage(driver);
	acp.entername(userFirstName);
	acp.enterphone(userMobNumber);
	acp.enterPassword(Password);
	acp.clickContinue();
	logger.info("account created");
	captureScreenShot(driver, "registertAndLogin");
	
}
 @DataProvider(name = "RegisterDataProvider")
	public String[][] RegisterDataProvider()
	{
		//System.out.println(System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir") + "\\TestData\\MyStoreTestData.xlsx";


		int ttlRows = ReadExcelFile.getRowCount(fileName, "UserRegistrationData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "UserRegistrationData");
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"UserRegistrationData", i,j);
			}

		}
		return data;
	}

}
