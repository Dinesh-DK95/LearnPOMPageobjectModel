package org.leaftaps.pages;

import org.leaftaps.base.api.Superclassforparameterconcept;

public class ViewLeadsPage extends Superclassforparameterconcept{
	
	//Click edit button
	public EditLeadPageOpentapsCRM clickEdit() {
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPageOpentapsCRM();
	}


}
