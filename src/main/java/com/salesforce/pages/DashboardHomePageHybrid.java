package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DashboardHomePageHybrid extends ProjectSpecificMethods {
	
	public DashboardCreatePageHybrid clickNewDashboard()
	{
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("DashboardHomePage.NewDashboardButton.xpath")));
		click(locateElement(Locators.XPATH, prop.getProperty("DashboardHomePage.NewDashboardButton.xpath")));
		return new DashboardCreatePageHybrid();
	}

}
