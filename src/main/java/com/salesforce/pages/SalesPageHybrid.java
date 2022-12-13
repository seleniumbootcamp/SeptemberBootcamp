package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SalesPageHybrid extends ProjectSpecificMethods{
	
	public LeadHomePageHybrid clickLeadLabel()
	{
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Leads']"));
		return new LeadHomePageHybrid();
	}

}
