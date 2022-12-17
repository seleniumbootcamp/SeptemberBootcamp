package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_CreateALeadHybrid extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyCreateLead";
		testDescription ="Verify Create Lead functionality with positive data";
		authors="Adhitya";
		category ="Smoke";
		excelFileName="CreateLead";
	}
	
	@Test(dataProvider = "Dynamic_Data")
	public void createLeadTC002Hybrid(String userName,String Password,String lastName, String company, String expected) throws InterruptedException {
		
		LoginPage loginPage = new LoginPage();
		
		loginPage.enterUsername(userName)
		.enterPassword(Password)
		.clickLogin()
		.clickAppLauncher()
		.clickSales()
		.clickLeadLabel()
		.clickNewButton()
		.selectSalutationAsMr()
		.enterLastName(lastName)
		.enterCompanyName(company)
		.clickSaveButton()
		.verifyLeadName(expected);
	}
}
