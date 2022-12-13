package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC003_DashboardAssessment extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setData() {
		testcaseName = "CreateDashboard";
		testDescription ="Create a Dashboard and related validations";
		authors="KSK";
		category ="Smoke";
		excelFileName="CreateDashboard";
		}

	@Test(dataProvider = "Dynamic_Data")
	
	public void createDashboard(String userName, String passWord,String goalValue,String dashboardName)
			throws InterruptedException {

		LoginPage loginPage = new LoginPage();
		loginPage.enterUsername(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickAppLauncher()
		.clickServiceConsole()
		.clickOnDropdown()
		//.pause(5000)
		.selectHomeOption() 
		.checkGoalValue(goalValue)
		.clickOnDropdown()
		.selectDashboardOption()
		.clickNewDashboard()
		.switchToIFrame()
		.enterDashboardName(dashboardName)
		.clickCreateButton()
		.switchToIFrame()
		.clickDashboardSaveButton()
		.switchToDefault()
		;
	}

}
