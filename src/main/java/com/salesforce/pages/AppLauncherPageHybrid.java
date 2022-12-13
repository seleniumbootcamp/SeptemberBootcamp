package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherPageHybrid extends ProjectSpecificMethods {
	
	public DashboardHomePageHybrid clickDashboard()
	{
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("AppLauncherPage.Dashboard.xpath")));
		clickUsingJs(locateElement(Locators.XPATH, prop.getProperty("AppLauncherPage.Dashboard.xpath")));
		return new DashboardHomePageHybrid();
	}
	
	public ServiceConsoleHomePageHybrid clickServiceConsole()
	{
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("AppLauncherPage.ServiceConsole.xpath")));
		clickUsingJs(locateElement(Locators.XPATH, prop.getProperty("AppLauncherPage.ServiceConsole.xpath")));
		return new ServiceConsoleHomePageHybrid();
	}

}
