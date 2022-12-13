package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LeadHomePageHybrid extends ProjectSpecificMethods {
	
	public LeadCreatePageHybrid clickNewButton()
	{
		click(locateElement(Locators.XPATH, prop.getProperty("AccountHomePage.NewButton.xpath")));
		return new LeadCreatePageHybrid();
	}
	
	public LeadDetailsPageHybrid openLead()
	{
		waitForAppearance(locateElement(Locators.XPATH, "(//a[text()='Kumar'])[1]"));
		clickUsingJs(locateElement(Locators.XPATH, "(//a[text()='Kumar'])[1]"));
		return new LeadDetailsPageHybrid();
	}

}
