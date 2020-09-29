package org.leaftaps.pages;

import org.leaftaps.base.api.Superclassforparameterconcept;

public class HomePage extends Superclassforparameterconcept {
	// click logout button
	
	public LoginPage clickLogout() {
		
		driver.findElementByClassName("decorativeSubmit").click();

		//return next page class
		return new LoginPage() ;
		
		
	}
	// Click Crmsfa link
	
	public MyHomePage clickcrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
}
