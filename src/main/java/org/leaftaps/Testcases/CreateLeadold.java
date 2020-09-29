package org.leaftaps.Testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.leaftaps.base.api.Superclassforparameterconcept;

public class CreateLeadold extends org.leaftaps.base.api.Superclassforparameterconcept{
	
	@BeforeTest
	public void setdata() {
		excelname = "Book";
		
	}
	
	@Test(dataProvider = "providedata")
	public  void runcreateLead(String CName,String FName ,String LName ,String PH)  {

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(CName);
		driver.findElementById("createLeadForm_firstName").sendKeys(FName);
		driver.findElementById("createLeadForm_lastName").sendKeys(LName);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(PH);
		driver.findElementByName("submitButton").click();
	}
}






