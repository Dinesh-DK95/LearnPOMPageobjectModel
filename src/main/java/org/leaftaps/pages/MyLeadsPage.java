package org.leaftaps.pages;

import org.leaftaps.base.api.Superclassforparameterconcept;

public class MyLeadsPage  extends Superclassforparameterconcept{
	
	
	public CreateLeadPage clickCreateleads() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();

	}
	
	public FindLeadsPage clickFindleads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();

	}

	

}
