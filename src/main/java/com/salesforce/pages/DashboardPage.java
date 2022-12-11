package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DashboardPage extends ProjectSpecificMethods {
	public DashboardPage clickNewDashboard() {
		
		click(locateElement(Locators.XPATH, prop.getProperty("dashboard.new.xpath")));
		return this;
	}

	public DashboardPage enterName(String dashboardName) {
		
		type(locateElement(Locators.ID, prop.getProperty("dashboard.name.id")), dashboardName);
		return this;
	}

	
	public DashboardPage enterDashboardName(String dashboardName) {
		type(locateElement(Locators.ID, prop.getProperty("dashboard.name.id")), dashboardName);
		
		return this;
	}

}
