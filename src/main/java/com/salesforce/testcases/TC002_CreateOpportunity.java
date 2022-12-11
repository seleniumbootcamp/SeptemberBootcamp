package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_CreateOpportunity extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		testcaseName = "CreateOpportunity";
		testDescription ="Create an Opportunity in Salesforce";
		authors="KSK";
		category ="Smoke";
		excelFileName="CreateOpportunity";
		}

	@Test(dataProvider = "Dynamic_Data")

	public void createOpportunity(String userName, String passWord, String enterOpportunity, String snackBarMessage)
			throws InterruptedException {

		LoginPage loginPage = new LoginPage();
		loginPage.enterUsername(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.clickSalesLink()
		.clickOpportunityLink()
		.clickNewButton()
		.enterOpportunityName(enterOpportunity)
		.getEnteredOpportunityName()
		.clickCloseDate()
		.clickTodayDateNumber()
		.clickStageDropdown()
		.selectNeedAnalaysisValue()
		.clickSaveButton()
		.validateSnackBarMessageWithTitleVerification(snackBarMessage,enterOpportunity);

	}
}
