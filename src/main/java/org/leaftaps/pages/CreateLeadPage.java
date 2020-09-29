package org.leaftaps.pages;

import org.leaftaps.base.api.Superclassforparameterconcept;

public class CreateLeadPage extends Superclassforparameterconcept {

	

	public CreateLeadPage enterCompanyName(String data) {

		driver.findElementById("createLeadForm_companyName").sendKeys(data);
		return this;
	}

	public CreateLeadPage enterFirstName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
	}

	public CreateLeadPage enterLastName(String data) {

		driver.findElementById("createLeadForm_lastName").sendKeys(data);
		return this;
	}

	public CreateLeadPage enterPhoneNumber(String data) {

		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(data);
		return this;
	}

	public ViewLeadsPage clickSubmit() {
		
		driver.findElementByName("submitButton").click();
		return new ViewLeadsPage();
	}
}
