package org.leaftaps.pages;

import org.leaftaps.base.api.Superclassforparameterconcept;

public class MyHomePage extends Superclassforparameterconcept{

	// Click create lead
	

	public MyLeadsPage clickleads() {
		
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage() ;
	}

}