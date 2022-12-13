package com.framework.testng.api.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {
	public static Properties prop;

	@DataProvider(name = "Dynamic_Data")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}
	
	@BeforeMethod
	public void preCondition() throws IOException {
		
		  prop = new Properties(); FileInputStream file = new FileInputStream(new
		  File("src/main/resources/config.properties")); prop.load( file );
		 
		startApp("chrome", false, "https://login.salesforce.com/");
		setNode();
//commented
	}
	
	@AfterMethod(enabled = false)
	public void postCondition() {
		close();

	} 

	
	
}
