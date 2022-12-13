package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LeadEditPageHybrid extends ProjectSpecificMethods {
	
	public LeadEditPageHybrid enterLastName(String lastName)
	{
		waitForAppearance(locateElement(Locators.XPATH, "//label[text()='Last Name']/following-sibling::div[1]/input"));
		type(locateElement(Locators.XPATH, "//label[text()='Last Name']/following-sibling::div[1]/input"), lastName);
		return this;
	}
	
	public LeadEditPageHybrid selectLeadStatusAsWorkingContacted()
	{
		waitForAppearance(locateElement(Locators.XPATH, "//label[text()='Lead Status']/following-sibling::div[1]//button"));
		clickUsingJs(locateElement(Locators.XPATH, "//label[text()='Lead Status']/following-sibling::div[1]//button"));
		clickUsingJs(locateElement(Locators.XPATH, "//span[@title='Working - Contacted']"));
		return this;
	}
	
	public LeadDetailsPageHybrid clickSaveButton()
	{
		click(locateElement(Locators.XPATH, "//button[text()='Save']"));
		return new LeadDetailsPageHybrid();
	}	
	

}
