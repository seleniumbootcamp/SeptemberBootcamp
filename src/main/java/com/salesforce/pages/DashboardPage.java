package com.salesforce.pages;

import org.testng.Assert;

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
	

	public DashboardPage enterDashboardDescription(String description) {
		type(locateElement(Locators.ID, prop.getProperty("dashboard.description.id")), description);
		
		return this;
	}

	
	public DashboardPage switchToIFrame() throws InterruptedException {

		switchToFrame(locateElement(Locators.XPATH, prop.getProperty("dashboard.iframe.xpath")));
		Thread.sleep(5000);
		return this;
	}

	

	public DashboardPage clickCreateButton()
	{
		click(locateElement(Locators.ID, prop.getProperty("dashboard.createbtn.id")));
		return this;
	}

	public DashboardPage switchToDefault() throws InterruptedException
	{
		defaultContent();
		Thread.sleep(2000);
		return this;
	}

	public DashboardPage clickDashboardSaveButton() throws InterruptedException {
		waitUntilElementLocated(Locators.XPATH, prop.getProperty("dashboard.save.xpath"));
		Thread.sleep(2000);

		click(locateElement(Locators.XPATH, prop.getProperty("dashboard.save.xpath")));
		//clickUsingJs(locateElement("xpath", prop.getProperty("dashboard.save.xpath")));
		return this;
	}

	public DashboardPage validateSnackBarMsg(String snackText) {
		
		waitUntilElementLocated(Locators.XPATH, prop.getProperty("dashboard.snackbarmsg.xpath"));
		String getSnackBarMsg = getElementText(locateElement(Locators.XPATH, prop.getProperty("dashboard.snackbarmsg.xpath")));
		Assert.assertEquals(snackText, getSnackBarMsg);
		return this;
	}
	public DashboardPage clickDoneButton() {
		waitUntilElementLocated(Locators.XPATH, prop.getProperty("dashboard.donebutton.xpath"));
		click(locateElement(Locators.XPATH, prop.getProperty("dashboard.donebutton.xpath")));
		pause(20000);
		return this;
	}
}
