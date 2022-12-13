package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LeadCreatePageHybrid extends ProjectSpecificMethods {
	
	public LeadCreatePageHybrid selectSalutationAsMr()
	{
		waitForAppearance(locateElement(Locators.XPATH, "//label[text()='Salutation']/following-sibling::div[1]//button"));
		click(locateElement(Locators.XPATH, "//label[text()='Salutation']/following-sibling::div[1]//button"));
		click(locateElement(Locators.XPATH, "//label[text()='Salutation']/following-sibling::div[1]//span[text()='Mr.']"));
		return this;
	}
	
	public LeadCreatePageHybrid enterLastName(String name)
	{
		type(locateElement(Locators.XPATH, "//label[text()='Last Name']/following-sibling::div[1]/input"), name);
		return this;
	}
	
	public LeadCreatePageHybrid enterCompanyName(String company)
	{
		type(locateElement(Locators.XPATH, "//label[text()='Company']/following-sibling::div[1]/input"), company);
		return this;
	}
	
	public LeadDetailsPageHybrid clickSaveButton()
	{
		click(locateElement(Locators.XPATH, prop.getProperty("AccountCreatePage.SaveButton.xpath")));
		return new LeadDetailsPageHybrid();
	}

}
