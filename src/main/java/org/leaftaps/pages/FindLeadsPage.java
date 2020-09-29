package org.leaftaps.pages;

import org.leaftaps.base.api.Superclassforparameterconcept;

public class FindLeadsPage extends Superclassforparameterconcept{
	// Click Phone Tab
	public FindLeadsPage clickPhone() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		return new FindLeadsPage();
	}
	// Enter Phone Number
	public FindLeadsPage EnterPhoneNumber() {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9");
		return this;
	}
	//Click find leads
	public FindLeadsPage ClickFindLeads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		return this;
	}
	//select first resultant lead from the search list
	
	public ViewLeadsPage SelectLead(){
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

		return new ViewLeadsPage();
	}
}
