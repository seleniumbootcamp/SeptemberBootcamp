package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePageHybrid extends ProjectSpecificMethods{
	
	public HomePageHybrid clickAppLauncher()
	{
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("HomePage.AppLauncher.xpath")));
		clickUsingJs(locateElement(Locators.XPATH, prop.getProperty("HomePage.AppLauncher.xpath")));
		reportStep("Clicked AppLauncher successfully","pass");
		return this;
	}
	
	public SalesPageHybrid clickSales()
	{
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("HomePage.Sales.xpath")));
		click(locateElement(Locators.XPATH, prop.getProperty("HomePage.Sales.xpath")));
		reportStep("Clicked Sales tab successfully","pass");
		return new SalesPageHybrid();
	}
	
	public ServiceConsoleHomePageHybrid clickServiceConsole()
	{
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("HomePage.ServiceConsole.xpath")));
		click(locateElement(Locators.XPATH, prop.getProperty("HomePage.ServiceConsole.xpath")));
		reportStep("Clicked Service Comsole app successfully","pass");
		return new ServiceConsoleHomePageHybrid();
	}
	
	public AppLauncherPageHybrid clickViewAll()
	{
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("HomePage.ViewAll.xpath")));
		click(locateElement(Locators.XPATH, prop.getProperty("HomePage.ViewAll.xpath")));
		reportStep("Clicked View All successfully","pass");
		return new AppLauncherPageHybrid();
	}

}
