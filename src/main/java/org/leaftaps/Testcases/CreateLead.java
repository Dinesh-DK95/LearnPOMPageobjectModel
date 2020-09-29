package org.leaftaps.Testcases;

import org.leaftaps.base.api.Superclassforparameterconcept;
import org.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends Superclassforparameterconcept {

	

	@BeforeTest
	public void setdata (){
		excelname = "CreateLead";
	}
	
	@Test(dataProvider = "providedata")
	public  void createlead(String Uname , String Pass ,String Cname, String Fname ,String Lname , String PH) {
		
		new LoginPage()
		.enterUserName(Uname)
		.password(Pass)
		.clickLogin()
		.clickcrmsfa()
		.clickleads()
		.clickCreateleads()
		.enterCompanyName(Cname)
		.enterFirstName(Fname)
		.enterLastName(Lname)
		.enterPhoneNumber(PH)
		.clickSubmit();
	}

}
