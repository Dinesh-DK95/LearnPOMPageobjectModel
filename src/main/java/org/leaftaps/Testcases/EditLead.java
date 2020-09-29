package org.leaftaps.Testcases;

import org.leaftaps.base.api.Superclassforparameterconcept;
import org.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends Superclassforparameterconcept {
	
	
	@BeforeTest
	public void setdata (){
		excelname = "EditLead";
	}
	
	
	@Test(dataProvider = "providedata")
	public  void editlead(String Uname , String Pass ,String Cname) throws InterruptedException  {
		new LoginPage()
		.enterUserName(Uname)
		.password(Pass)
		.clickLogin()
		.clickcrmsfa()
		.clickleads()
		.clickFindleads()
		.clickPhone()
		.EnterPhoneNumber()
		.ClickFindLeads()
		.SelectLead()
		.clickEdit()
		.EditComapanyName(Cname)
		.ClickSubmit();
		
	}

}
