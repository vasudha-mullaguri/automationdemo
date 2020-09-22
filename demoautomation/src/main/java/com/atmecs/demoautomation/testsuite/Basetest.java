package com.atmecs.demoautomation.testsuite;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.atmecs.demoauomation.constants.Constant;
import com.atmecs.demoautomation.utils.PropertyReader;

import bsh.org.objectweb.asm.Constants;


public class Basetest {
	public static Properties properties;
	public static WebDriver driver;
	String baseUrl;
	String browser;

	@BeforeTest
	public void invokeBrowser() {

		properties = PropertyReader.readProperties(Constant.CONFIG_FILE);

		baseUrl = properties.getProperty("Url");
		browser = properties.getProperty("Browser_name");

		System.setProperty("webdriver.chrome.driver", Constant.CHROME_FILE);
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}