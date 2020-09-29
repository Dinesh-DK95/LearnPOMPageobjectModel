package org.leaftaps.pages;

import org.leaftaps.base.api.Superclassforparameterconcept;

public class LoginPage extends Superclassforparameterconcept {

	//remove main method

		public LoginPage enterUserName(String data) {
			
			driver.findElementById("username").sendKeys(data);
			return this;
		}	
		
		public LoginPage password( String data) {
			driver.findElementById("password").sendKeys(data);
			//this keyword represents the current control
			return this;
		}
		
		public HomePage clickLogin() {
			driver.findElementByClassName("decorativeSubmit").click();

			//return next page class
			return new HomePage() ;
		}

	

}
