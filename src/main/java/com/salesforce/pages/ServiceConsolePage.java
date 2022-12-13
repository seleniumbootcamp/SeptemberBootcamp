package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ServiceConsolePage extends ProjectSpecificMethods {

	public ServiceConsolePage clickOnDropdown() {
		waitUntilElementLocated(Locators.XPATH, prop.getProperty("serviceconsole.dropdown.xpath"));
		click(locateElement(Locators.XPATH,prop.getProperty("serviceconsole.dropdown.xpath")));
		//clickUsingJs(locateElement(Locators.XPATH,prop.getProperty("serviceconsole.dropdown.xpath")));
		
		pause(5000);
		reportStep("Service Console dropdown is clicked successfully", "pass");
		return new ServiceConsolePage();
	}
	
	public ServiceConsolePage selectHomeOption() {
		//waitForAppearance(locateElement(Locators.XPATH,prop.getProperty("serviceconsole.homeoption.xpath")));
		waitUntilElementLocated(Locators.XPATH, prop.getProperty("serviceconsole.homeoption.xpath"));
		reportStep("Home option is displayed", "info");
		click(locateElement(Locators.XPATH, prop.getProperty("serviceconsole.homeoption.xpath")));
		reportStep("Home option is clicked successfully", "pass");
		return new ServiceConsolePage();
		
	}
	
	
	public DashboardPage selectDashboardOption() {
		//waitForAppearance(locateElement(Locators.XPATH,prop.getProperty("serviceconsole.homeoption.xpath")));
		waitUntilElementLocated(Locators.XPATH, prop.getProperty("serviceconsole.dashboardoption.xpath"));
		reportStep("Dashboard option is displayed", "info");
		click(locateElement(Locators.XPATH, prop.getProperty("serviceconsole.dashboardoption.xpath")));
		reportStep("Dashboard option is clicked successfully", "pass");
		pause(5000);
		return new DashboardPage();
		
	}
	
	public ServiceConsolePage checkGoalValue(String goalValue) {
		waitUntilElementLocated(Locators.XPATH, prop.getProperty("serviceconsole.goalvalue.xpath"));

		String getGoalValue = getElementText(locateElement(Locators.XPATH, prop.getProperty("serviceconsole.goalvalue.xpath")));
		System.out.println("Printed"+getGoalValue);
		pause(2000);
		if (!getGoalValue.equals("$10,000")) {
			System.out.println("Printed inside");
			click(locateElement(Locators.XPATH, prop.getProperty("serviceconsole.editgoal.xpath")));
			pause(5000);
			//clearAndType(locateElement(Locators.XPATH,prop.getProperty("serviceconsole.entergoal.xpath")), getGoalValue);
		
		//	pause(4000);
			actionSendKeys(locateElement(Locators.XPATH,prop.getProperty("serviceconsole.entergoal.xpath")),goalValue);
			click(locateElement(Locators.XPATH,prop.getProperty("serviceconsole.goalsave.xpath")));
			pause(4000);
		}
		
		return new ServiceConsolePage();
	}
}



