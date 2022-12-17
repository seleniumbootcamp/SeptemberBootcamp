package com.framework.selenium.api.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInstance  {

	public String username = "selbootcamp.sep2022";
    public String accesskey = "A20Qwo6otPRwUFIuQ7jukqO3fphGIQfFET4fvItae030VOGrG3";
    public static RemoteWebDriver driver = null;
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;
	
	
	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<WebDriverWait>();

	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), 30));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) throws MalformedURLException {		
		switch (browser) {
		case "chrome":
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("--start-maximized");
			 * options.addArguments("--disable-notifications");
			 * options.addArguments("--incognito"); remoteWebdriver.set(new
			 * ChromeDriver(options));
			 */
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("browserName", "chrome");
	        capabilities.setCapability("version", "70.0");
	        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
	        capabilities.setCapability("build", "Salesforce Automation");
	        capabilities.setCapability("name", "Cloud execution");
	        remoteWebdriver.set(new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities));	
			break;
		case "firefox":
			remoteWebdriver.set(new FirefoxDriver());
			break;
		case "ie":
			remoteWebdriver.set(new InternetExplorerDriver());
		default:
			break;
		}
	}
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
	
}
