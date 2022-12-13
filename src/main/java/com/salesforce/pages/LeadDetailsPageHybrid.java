package com.salesforce.pages;

import org.testng.Assert;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LeadDetailsPageHybrid extends ProjectSpecificMethods {
	
	public LeadDetailsPageHybrid verifyLeadName(String expectedName)
	{
		String actualText = getElementText(locateElement(Locators.XPATH, "//div[text()='Lead']/following-sibling::slot//lightning-formatted-name"));
		Assert.assertEquals(actualText, expectedName);
		return this;
	}
	
	public LeadEditPageHybrid editLead()
	{
		click(locateElement(Locators.XPATH, "//button[text()='Submit for Approval']/ancestor::li/following-sibling::li//button"));
		click(locateElement(Locators.XPATH, "//button[text()='Submit for Approval']/ancestor::li/following-sibling::li//div//span[text()='Edit']"));
		return new LeadEditPageHybrid();
	}
	
	public LeadDetailsPageHybrid selectDetailsTab()
	{
		click(locateElement(Locators.XPATH, "(//a[text()='Details'])[1]"));
		return this;
	}
	
	public LeadDetailsPageHybrid verifyLeadStatus(String expected) 
	{
		String actualText = getElementText(locateElement(Locators.XPATH, "//span[text()='Lead Status']/following::span[1]//lightning-formatted-text"));
		Assert.assertEquals(actualText, expected);
		return this;
	}
	

}
