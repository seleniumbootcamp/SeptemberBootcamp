package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='Home']"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	
	public HomePage clickAppLauncher() {
		click(locateElement(Locators.XPATH, prop.getProperty("home.applauncher.xpath")));
		reportStep("App Launcher is clicked successfully", "pass");
		return this;

	}

	public HomePage clickViewAll() {
		click(locateElement(Locators.XPATH, prop.getProperty("home.viewall.xpath")));
		reportStep("View All is clicked successfully", "pass");
		return this;
	}

	public SalesPage clickSalesLink() throws InterruptedException {
		click(locateElement(Locators.XPATH, prop.getProperty("home.saleslink.xpath")));
		Thread.sleep(5000);
		reportStep("Sales link is clicked successfully", "pass");
		return new SalesPage();
	}

	
	public ServiceConsolePage clickServiceConsole() {
		
		click(locateElement(Locators.XPATH, prop.getProperty("home.serviceconsolelink.xpath")));
		reportStep("Service Console link is clicked successfully", "pass");
		pause(5000);
		return new ServiceConsolePage();
	}
	
}
