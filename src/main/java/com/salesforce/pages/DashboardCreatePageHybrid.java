package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DashboardCreatePageHybrid extends ProjectSpecificMethods {
	
	public DashboardCreatePageHybrid enterDashboardName(String name)
	{
		//explicitWaitForFrame(locateElement("xpath", prop.getProperty("DashboardCreatePage.SwitchToFrame.xpath")));
		switchToFrame(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.SwitchToFrame.xpath")));
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.EnterName.xpath")));
		type(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.EnterName.xpath")), name);
		return this;
	}
	
	public DashboardCreatePageHybrid clickCreateButton()
	{
		click(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.CreateButton.xpath")));
		return this;
	}
	
	public DashboardCreatePageHybrid clickSaveButton() throws InterruptedException
	{
		//explicitWaitForFrame(locateElement("xpath", prop.getProperty("DashboardCreatePage.SwitchToFrame.xpath")));
		switchToFrame(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.SwitchToFrame.xpath")));
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.SaveButton.xpath")));
		clickUsingJs(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.SaveButton.xpath")));
		return this;
	}
	
	public DashboardCreatePageHybrid verifyToastMessage(String toastExpectedText)
	{
		defaultContent();
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.ToastMessage.xpath")));
		String toastText = getElementText(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.ToastMessage.xpath")));
		System.out.println("Toast message is : " + toastText);
		Assert.assertEquals(toastText, toastExpectedText);
		return this;
	}
	
	public DashboardCreatePageHybrid clickDoneButton()
	{
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.SwitchToFrame.xpath")));
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.DoneButton.xpath")));
		click(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.DoneButton.xpath")));
		return this;
	}
	
	public DashboardCreatePageHybrid verifyDashboardName(String name)
	{
		waitForAppearance(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.DashboardName.xpath")));
		String actualText = getElementText(locateElement(Locators.XPATH, prop.getProperty("DashboardCreatePage.DashboardName.xpath")));
		Assert.assertEquals(actualText, name);
		return this;
	}

}
