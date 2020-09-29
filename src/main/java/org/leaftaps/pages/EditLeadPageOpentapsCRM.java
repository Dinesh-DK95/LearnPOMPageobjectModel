package org.leaftaps.pages;

import org.leaftaps.base.api.Superclassforparameterconcept;

public class EditLeadPageOpentapsCRM extends Superclassforparameterconcept {
	
	//
	public EditLeadPageOpentapsCRM EditComapanyName(String data) {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(data);

		return this;
	}
	public ViewLeadsPage ClickSubmit() {
		driver.findElementByName("submitButton").click();

		return new ViewLeadsPage();
	}
	
}
