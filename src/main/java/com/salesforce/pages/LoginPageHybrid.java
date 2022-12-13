package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPageHybrid extends ProjectSpecificMethods{
			
			public LoginPageHybrid enterUsername() {
				String username = prop.getProperty("sfusername");
				type(locateElement(Locators.ID, "username"), username);
				reportStep(username+" entered successfully","pass");
				return this;
			}
			
			public LoginPageHybrid enterPassword() {
				String pwd = prop.getProperty("sfpassword");
				type(locateElement(Locators.ID, "password"), pwd);
				reportStep(pwd+" entered successfully","pass");
				return this;
			}
			
			public HomePageHybrid clickLogin() {
				click(locateElement(Locators.ID, "Login"));
				reportStep("Login button clicked successfully", "pass");
				return new HomePageHybrid();
			}

}
