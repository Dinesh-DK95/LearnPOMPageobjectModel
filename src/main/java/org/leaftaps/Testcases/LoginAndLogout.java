package org.leaftaps.Testcases;

import org.leaftaps.base.api.Superclassforparameterconcept;
import org.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAndLogout extends Superclassforparameterconcept{

	
	@BeforeTest
	public void setdata() {
		excelname = "Usercredentials";
		
	}
	@Test(dataProvider = "providedata")
	public  void loginlogout (String Uname , String Pass) {
		
		new LoginPage().enterUserName(Uname).password(Pass).clickLogin().clickLogout();
		
		

	}

}
