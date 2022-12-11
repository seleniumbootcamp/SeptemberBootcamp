package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

//import com.salesforce.base.ProjectSpecificMethods;

public class SalesPage extends ProjectSpecificMethods {

	public OpportunityPage clickOpportunityLink() {
		//clickUsingJs(locateElement("xpath", prop.getProperty("sales.opportunitieslink.xpath")));
		clickUsingJs(locateElement(Locators.XPATH, prop.getProperty("sales.opportunitieslink.xpath")));
		
		return new OpportunityPage();
	}
	
	public SalesPage clickSalesLink() throws InterruptedException {
		click(locateElement(Locators.XPATH, prop.getProperty("home.saleslink.xpath")));
		Thread.sleep(5000);
		return new SalesPage();
	}


}
