package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.HomePageHybrid;
import com.salesforce.pages.LoginPageHybrid;
import com.salesforce.pages.HomePage;

public class TC002_CreateALeadHybrid extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyCreateLead";
		testDescription ="Verify Create Lead functionality with positive data";
		authors="Adhitya";
		category ="Smoke";
		excelFileName="CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void createLeadTC002Hybrid(String lastName, String company, String expected) throws InterruptedException {
		
		new LoginPageHybrid().enterUsername().enterPassword().clickLogin()
		.clickAppLauncher().clickSales().clickLeadLabel()
		.clickNewButton().selectSalutationAsMr().enterLastName(lastName).enterCompanyName(company).clickSaveButton()
		.verifyLeadName(expected);
	}
}
