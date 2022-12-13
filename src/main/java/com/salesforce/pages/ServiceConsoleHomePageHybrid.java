package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ServiceConsoleHomePageHybrid extends ProjectSpecificMethods{
	
	public ServiceConsoleHomePageHybrid clickServiceControlDropdown()
	{
		waitForAppearance(locateElement(Locators.XPATH, "//button[@title='Show Navigation Menu']/lightning-primitive-icon"));
		click(locateElement(Locators.XPATH, "//button[@title='Show Navigation Menu']/lightning-primitive-icon"));
		reportStep("Clicked Service Console dropdown successfully","pass");
		return this;
	}
	
	public ServiceConsoleHomePageHybrid clickHome()
	{
		waitForAppearance(locateElement(Locators.XPATH, "//div[@role='listbox']//span[text()='Home']"));
		click(locateElement(Locators.XPATH, "//div[@role='listbox']//span[text()='Home']"));
		reportStep("Clicked Home successfully","pass");
		return this;
	}
	
	public HomePageHybrid setGoalValue()
	{
		String goalValue = getElementText(locateElement(Locators.XPATH, "//span[text()='Goal']/following::lightning-formatted-text[1]"));
		if (goalValue!="$10,000")
		{
			click(locateElement(Locators.XPATH, "//span[text()='Goal']/following::button[@title='Edit Goal']/lightning-primitive-icon"));
			clearAndType(locateElement(Locators.XPATH, "//label[text()='Edit Goal']/following::input"), "10000");
			click(locateElement(Locators.XPATH, prop.getProperty("AccountCreatePage.SaveButton.xpath")));
		}
		reportStep("Goal value set as 10000 successfully","pass");
		return new HomePageHybrid();
	}

}
